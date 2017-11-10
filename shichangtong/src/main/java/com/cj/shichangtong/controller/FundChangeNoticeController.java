package com.cj.shichangtong.controller;

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
import com.cj.shichangtong.reportentity.BankFileGenNotice;
import com.cj.shichangtong.reportentity.BaseResultReport;
import com.cj.shichangtong.service.NotifyResultService;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.util.MyRequestWrapper;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "市场通接口_资金变动提醒", value = "市场通接口_资金变动提醒", tags = "FundChangeNoticeController")
@RequestMapping("/ShiChangTong_fund_change_notice")
public class FundChangeNoticeController {

	private static final Logger log = LoggerFactory.getLogger(FundChangeNoticeController.class);

	@Autowired
	private SHYJFYJZ shyjfyjz;
	@Autowired
	NotifyResultService notifyResultService;

	/**
	 * 资金变动提醒(银行调用)
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "资金变动提醒 ", notes = "资金变动提醒 ")
	public String fundChangeNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("*******************资金变动提醒 ************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		System.out.println(body);
		String resultStr = notifyResultService.fundChangeNotice(body);
		return resultStr;
	}

	/**
	 * 银行文件生成提醒(银行调用)
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/file_gen_notice", method = RequestMethod.POST)
	@ApiOperation(value = "银行文件生成提醒 ", notes = "银行文件生成提醒 ")
	public String fileGeneratorNotice(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("*******************银行文件生成提醒 ************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		System.out.println(body);
		String resultStr = notifyResultService.fileGenNotice(body);
		return resultStr;
	}

	/**
	 * 商户文件生成提醒
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/mer_file_gen_notice", method = RequestMethod.POST)
	@ApiOperation(value = "商户文件生成提醒 ", notes = "商户文件生成提醒 ")
	public ResultModel<String> merFileGeneratorNotice(@RequestBody BankFileGenNotice bankFileGenNotice)
			throws Exception {
		// 1、请求报文
		String resultString = shyjfyjz.merFileGeneratorNotice(bankFileGenNotice);
		// 2、反序列化
		BaseResultReport resultReport = JSONObject.parseObject(resultString, BaseResultReport.class);
		// 3、报文结果判断
		if (resultReport != null && "000000".equals(resultReport.getRespCode())) {
			return ResponseEntity.getSuccessModel(resultString);
		}
		return ResponseEntity.getFailureModel(resultString);
	}

}
