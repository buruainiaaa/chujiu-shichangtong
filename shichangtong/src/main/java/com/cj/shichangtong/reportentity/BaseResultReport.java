package com.cj.shichangtong.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 应答公共报文头
 * 
 * BaseResultReport
 * 
 * cody cody 2017年11月8日 上午10:12:34
 * 
 * @version 1.0.0
 *
 */
@ApiModel("响应公共报文头")
public class BaseResultReport {

	@ApiModelProperty(value = "响应码", required = true)
	private String respCode;// 响应码
	@ApiModelProperty(value = "响应信息", required = true)
	private String respMsg;// 响应信息
	@ApiModelProperty(value = "渠道流水号", required = true)
	private String ebsSerialNo;// 渠道流水号
	@ApiModelProperty(value = "签名字段", required = true)
	private String casign;// 签名字段
	@ApiModelProperty(value = "注册token", required = true)
	private String auhToken;// 注册token
	@ApiModelProperty(value = "页面跳转url", required = true)
	private String authUrl;// 页面跳转url

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getEbsSerialNo() {
		return ebsSerialNo;
	}

	public void setEbsSerialNo(String ebsSerialNo) {
		this.ebsSerialNo = ebsSerialNo;
	}

	public String getCasign() {
		return casign;
	}

	public void setCasign(String casign) {
		this.casign = casign;
	}

	public String getAuhToken() {
		return auhToken;
	}

	public void setAuhToken(String auhToken) {
		this.auhToken = auhToken;
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	@Override
	public String toString() {
		return "BaseResultReport [respCode=" + respCode + ", respMsg=" + respMsg + ", ebsSerialNo=" + ebsSerialNo
				+ ", casign=" + casign + ", auhToken=" + auhToken + ", authUrl=" + authUrl + "]";
	}

}
