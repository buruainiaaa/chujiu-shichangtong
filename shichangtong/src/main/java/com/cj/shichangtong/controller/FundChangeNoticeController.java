package com.cj.shichangtong.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	 * 资金变动提醒
	 * 
	 * @param openAccess
	 *            报文对象
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "资金变动提醒 ", notes = "资金变动提醒 ")
	public ResultModel<String> fundChangeNotice(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		log.info("*******************资金变动提醒 ************************");
		String body = MyRequestWrapper.getRequestJsonString(request);
		try {
			System.out.println(body);
			notifyResultService.unbundlingCard(body);
		} catch (Exception e) {
			ResponseEntity.getFailureModel(e.getMessage());
		}
		return ResponseEntity.getSuccessModel(body);
	}

}
