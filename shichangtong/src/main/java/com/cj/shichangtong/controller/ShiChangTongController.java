package com.cj.shichangtong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cj.shichangtong.reportentity.GROpenAccess;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "市场通接口", tags = "ShiChangTong")
@RequestMapping("/ShiChangTong")
public class ShiChangTongController {

	@Autowired
	private SHYJFYJZ shyjfyjz;

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
		OpenAccess openAccess1 = openAccess;
		return ResponseEntity.getSuccessModel(shyjfyjz.openAccess(openAccess));
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
		GROpenAccess openAccess1 = p_GROpenAccess;
		return ResponseEntity.getSuccessModel(shyjfyjz.GROpenAccess(openAccess1));
	}

	/**
	 * 客户发起企业银行卡绑定
	 * 
	 */
	@RequestMapping(value = "/qybd", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起企业银行卡绑定", notes = "客户发起企业银行卡绑定")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> qybd(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo) {
		String funcionID = "880008";
		return ResponseEntity.getSuccessModel(shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID));
	}

	/**
	 * 客户发起个人银行卡绑定
	 * 
	 */
	@RequestMapping(value = "/gr-bind", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起个人银行卡绑定", notes = "客户发起个人银行卡绑定")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> grbd(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo) {
		String funcionID = "880007";
		return ResponseEntity.getSuccessModel(shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID));
	}

	/**
	 * 客户发起个人资金账户交易密码修改
	 * 
	 */
	@RequestMapping(value = "/gr-Pwd-Modify", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起个人资金账户交易密码修改", notes = "客户发起个人资金账户交易密码修改")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> grPwdModify(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo) {
		String funcionID = "880003";
		return ResponseEntity.getSuccessModel(shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID));
	}

	/**
	 * 客户发起企业资金账户交易密码修改
	 * 
	 */
	@RequestMapping(value = "/qy-Pwd-Modify", method = RequestMethod.POST)
	@ApiOperation(value = "客户发起企业资金账户交易密码修改", notes = "客户发起企业资金账户交易密码修改")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "serialNo", value = "业务流水号", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "subAcctNo", value = "资金账户", required = true, dataType = "String", paramType = "query") })
	public ResultModel<String> qyPwdModify(@RequestParam(value = "serialNo", required = true) String serialNo,
			@RequestParam(value = "subAcctNo", required = true) String subAcctNo) {
		String funcionID = "880004";
		return ResponseEntity.getSuccessModel(shyjfyjz.AccessManagement(serialNo, subAcctNo, funcionID));
	}

	/*
	 * * 客户发起个人资金账户交易密码修改 880003 客户发起企业资金账户交易密码修改 880004 客户发起个人用户手机号码修改 880005
	 * 客户发起企业用户手机号码修改 880006 客户发起个人银行卡绑定 880007 客户发起企业银行卡绑定 880008 客户发起银行卡解绑
	 * 880010 客户发起个人资金账户销户 880011 客户发起企业资金账户销户 880012 客户发起个人资金账户冻结 880013
	 * 客户发起企业资金账户冻结 880014 客户发起个人资金账户解冻 880015 客户发起企业资金账户解冻 880016
	 * 客户发起个人资金账户交易密码重置 880017 客户发起企业资金账户交易密码重置 880018
	 */

}
