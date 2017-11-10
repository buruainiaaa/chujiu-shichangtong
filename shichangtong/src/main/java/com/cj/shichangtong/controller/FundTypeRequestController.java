package com.cj.shichangtong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cj.shichangtong.reportentity.BaseResultReport;
import com.cj.shichangtong.reportentity.FundOut;
import com.cj.shichangtong.service.NotifyResultService;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.util.MyRequestWrapper;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "市场通接口_资金类请求", value = "市场通接口_资金类请求", tags = "FundTypeRequestController")
@RequestMapping("/ShiChangTong_fund_rquest")
public class FundTypeRequestController {

	private static final Logger log = LoggerFactory.getLogger(FundTypeRequestController.class);

	@Autowired
	private SHYJFYJZ shyjfyjz;

	@Autowired
	private NotifyResultService notifyResultService;

	/**
	 * 客户提现出金
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/fund_out", method = RequestMethod.POST)
	@ApiOperation(value = "客户提现出金", notes = "客户提现出金")
	public ResultModel<String> fundOut(@RequestBody FundOut fundOut) throws IOException {
		log.info("*******************提现出金************************");

		// 1、请求报文
		String resultStr = shyjfyjz.fundOut(fundOut);
		// 2、反序列化
		BaseResultReport resultReport = JSONObject.parseObject(resultStr, BaseResultReport.class);
		// 3、报文结果判断
		if (resultReport != null && "000000".equals(resultReport.getRespCode())) {
			return ResponseEntity
					.getSuccessModel(resultReport.getAuthUrl() + "?authTokenId=" + resultReport.getAuthToken());
		}
		return ResponseEntity.getFailureModel(resultStr);
	}

	/**
	 * （回调）客户提现出金
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_fund_out", method = RequestMethod.POST)
	@ApiOperation(value = "（回调）客户提现出金", notes = "（回调）客户提现出金")
	public ResultModel<String> notifyResuleFundOut(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************回调成功************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			notifyResultService.fundOut(body);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);

	}

	/**
	 * （回跳）客户提现出金
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/rebackUrl_fund_out", method = RequestMethod.GET)
	@ApiOperation(value = "（回跳）客户提现出金", notes = "（回调）客户提现出金")
	public ResultModel<String> rebackResultFundOut() {
		// System.out.println(JSON.toJSON(p_GROpenAccessResult));
		return ResponseEntity.getSuccessModel("*********************（回跳）客户提现出金**********************");
	}
}
