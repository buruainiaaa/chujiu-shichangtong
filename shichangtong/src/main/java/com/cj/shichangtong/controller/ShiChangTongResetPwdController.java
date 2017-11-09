package com.cj.shichangtong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cj.shichangtong.reportentity.BaseResultReport;
import com.cj.shichangtong.service.NotifyResultService;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.util.MyRequestWrapper;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "市场通接口_重置密码", value = "市场通接口_重置密码", tags = "ShiChangTongResetPwdController")
@RequestMapping("/ShiChangTong_reset_pwd")
public class ShiChangTongResetPwdController {

	private static final Logger log = LoggerFactory.getLogger(ShiChangTongResetPwdController.class);

	@Autowired
	private SHYJFYJZ shyjfyjz;
	@Autowired
	NotifyResultService notifyResultService;

	/**
	 * 客户发起企业资金账户交易密码重置
	 * 
	 */
	@RequestMapping(value = "/qycz", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起企业资金账户交易密码重置", notes = "客户发起企业资金账户交易密码重置")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "rebackUrl", value = "页面回调地址", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "notifyUrl", value = "服务通知地址", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> qycz(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo,
			@RequestParam(value = "rebackUrl", required = true) String rebackUrl,
			@RequestParam(value = "notifyUrl", required = true) String notifyUrl) {
		String funcionID = "880018";

		// 1、请求报文
		String resultString = shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID, rebackUrl, notifyUrl);
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
	 * （回调）客户发起企业资金账户交易密码重置
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_qycz", method = RequestMethod.POST)
	@ApiOperation(value = "（回调）客户发起企业资金账户交易密码重置", notes = "（回调）客户发起企业资金账户交易密码重置")
	public ResultModel<String> notifyResuleQycz(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************回调成功************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			notifyResultService.resetPwd(body, 1);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);
	}

	/**
	 * （回跳）客户发起企业资金账户交易密码重置
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/rebackUrl_qycz", method = RequestMethod.GET)
	@ApiOperation(value = "（回跳）客户发起企业资金账户交易密码重置", notes = "（回调）客户发起企业资金账户交易密码重置")
	public ResultModel<String> rebackResultQycz() {
		return ResponseEntity.getSuccessModel("***********************（回跳）客户发起企业资金账户交易密码重置********************");
	}

	/**
	 * 客户发起个人资金账户交易密码重置
	 * 
	 */
	@RequestMapping(value = "/grcz", method = RequestMethod.POST)
	@ApiOperation(value = "户发起个人资金账户交易密码重置", notes = "户发起个人资金账户交易密码重置")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "rebackUrl", value = "页面回调地址", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "notifyUrl", value = "服务通知地址", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> grcz(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo,
			@RequestParam(value = "rebackUrl", required = true) String rebackUrl,
			@RequestParam(value = "notifyUrl", required = true) String notifyUrl) {
		String funcionID = "880017";
		// 1、请求报文
		String resultString = shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID, rebackUrl, notifyUrl);
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
	 * （回调）户发起个人资金账户交易密码重置
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/notifyUrl_grcz", method = RequestMethod.POST)
	@ApiOperation(value = "（回调）户发起个人资金账户交易密码重置", notes = "（回调）户发起个人资金账户交易密码重置")
	public ResultModel<String> notifyResuleGrcz(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************回调成功************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			notifyResultService.resetPwd(body, 2);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);
	}

	/**
	 * （回跳）户发起个人资金账户交易密码重置
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 */
	@RequestMapping(value = "/rebackUrl_grcz", method = RequestMethod.GET)
	@ApiOperation(value = "（回跳）户发起个人资金账户交易密码重置", notes = "（回调）户发起个人资金账户交易密码重置")
	public ResultModel<String> rebackResultGrcz() {
		// System.out.println(JSON.toJSON(p_GROpenAccessResult));
		return ResponseEntity.getSuccessModel("*******************（回跳）户发起个人资金账户交易密码重置************************");
	}
}
