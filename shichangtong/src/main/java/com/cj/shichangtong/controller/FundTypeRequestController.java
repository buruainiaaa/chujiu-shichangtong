package com.cj.shichangtong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

	/**
	 * 客户提现出金
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_qymm", method = RequestMethod.POST)
	@ApiOperation(value = "客户提现出金", notes = "客户提现出金")
	public ResultModel<String> notifyResuleQymm(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************提现出金************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			// notifyResultService.modyfyMobilePwd(body, 1);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);
	}

}
