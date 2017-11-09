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
import com.cj.shichangtong.reportentity.GROpenAccess;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.service.NotifyResultService;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.util.MyRequestWrapper;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "市场通接口", value = "市场通接口_开户", tags = "ShiChangTong")
@RequestMapping("/ShiChangTong_KH")
public class ShiChangTongOpenAccessController {

	private static final Logger log = LoggerFactory.getLogger(ShiChangTongOpenAccessController.class);

	@Autowired
	private SHYJFYJZ shyjfyjz;
	@Autowired
	private NotifyResultService notifyResultService;

	/**
	 * 对公开户(客户发起企业会员资金账号开户)
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/dgkh", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起企业会员资金账号开户", notes = "客户发起企业会员资金账号开户")
	public ResultModel<String> dgkh(@RequestBody OpenAccess openAccess) {
		// 1、请求报文
		String resultString = shyjfyjz.openAccess(openAccess);
		// 2、反序列化
		BaseResultReport resultReport = JSONObject.parseObject(resultString, BaseResultReport.class);
		// 3、报文结果判断
		if (resultReport != null && "000000".equals(resultReport.getRespCode())) {
			return ResponseEntity
					.getSuccessModel(resultReport.getAuthUrl() + "?authTokenId=" + resultReport.getAuthToken());
		}
		return ResponseEntity.getFailureModel(resultString);
	}

	/**
	 * （回调）客户发起企业会员资金账户开户
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_dgkh", method = RequestMethod.POST)
	@ApiOperation(value = "（回调）客户发起企业会员资金账户开户", notes = "（回调）客户发起企业会员资金账户开户")
	public ResultModel<String> notifyResuleDgkh(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************回调成功************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			notifyResultService.openAccess(body, 1);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);
	}

	/**
	 * （回跳）客户发起企业会员资金账户开户
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/rebackUrl_dgkh", method = RequestMethod.GET)
	@ApiOperation(value = "（回跳）客户发起企业会员资金账户开户", notes = "（回调）客户发起企业会员资金账户开户")
	public ResultModel<String> rebackResultDgkh() {
		// System.out.println(JSON.toJSON(p_GROpenAccessResult));
		return ResponseEntity.getSuccessModel("*********************（回跳）客户发起企业会员资金账户开户**********************");
	}

	/**
	 * 客户发起个人会员资金账户开户
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/dskh", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起个人会员资金账户开户", notes = "客户发起个人会员资金账户开户")
	public ResultModel<String> dskh(@RequestBody GROpenAccess p_GROpenAccess) {
		// 1、请求报文
		String resultString = shyjfyjz.GROpenAccess(p_GROpenAccess);
		// 2、反序列化
		BaseResultReport resultReport = JSONObject.parseObject(resultString, BaseResultReport.class);
		// 3、报文结果判断
		if (resultReport != null && "000000".equals(resultReport.getRespCode())) {
			return ResponseEntity
					.getSuccessModel(resultReport.getAuthUrl() + "?authTokenId=" + resultReport.getAuthToken());
		}
		return ResponseEntity.getFailureModel(resultString);
	}

	/**
	 * （回调）客户发起个人会员资金账户开户
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_dskh", method = RequestMethod.POST)
	@ApiOperation(value = "（回调）客户发起个人会员资金账户开户", notes = "（回调）客户发起个人会员资金账户开户")
	public ResultModel<String> notifyResuleDskh(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************回调成功************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			notifyResultService.openAccess(body, 2);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);

	}

	/**
	 * （回跳）客户发起个人会员资金账户开户
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/rebackUrl_dskh", method = RequestMethod.GET)
	@ApiOperation(value = "（回跳）客户发起个人会员资金账户开户", notes = "（回调）客户发起个人会员资金账户开户")
	public ResultModel<String> rebackResultDskh() {
		// System.out.println(JSON.toJSON(p_GROpenAccessResult));
		return ResponseEntity.getSuccessModel("*********************（回跳）客户发起个人会员资金账户开户**********************");
	}

}
