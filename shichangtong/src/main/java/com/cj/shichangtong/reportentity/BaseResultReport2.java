package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 应答公共报文头(收银台模式二次请求后的回调响应公共报文头)
 * 
 * BaseResultReport
 * 
 * cody cody 2017年11月8日 上午10:12:34
 * 
 * @version 1.0.0
 *
 */
@ApiModel("收银台模式二次请求后的回调响应公共报文头")
public class BaseResultReport2 {
	@ApiModelProperty(value = "响应码", required = true)
	private String respCode;// 响应码
	@ApiModelProperty(value = "响应信息", required = true)
	private String respMsg;// 响应信息
	@ApiModelProperty(value = "业务流水号", required = true)
	private String serialNo;// 业务流水号
	@ApiModelProperty(value = "签名字段", required = true)
	private String casign;// 签名字段
	@ApiModelProperty(value = "资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号
	@ApiModelProperty(value = "交易代码", required = true)
	private String funcionID;// 交易代码
	@ApiModelProperty(value = "商户编号", required = true)
	private String merNo;// 商户编号

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

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getCasign() {
		return casign;
	}

	public void setCasign(String casign) {
		this.casign = casign;
	}

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}

	public String getFuncionID() {
		return funcionID;
	}

	public void setFuncionID(String funcionID) {
		this.funcionID = funcionID;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	@Override
	public String toString() {
		return "BaseResultReport2 [respCode=" + respCode + ", respMsg=" + respMsg + ", serialNo=" + serialNo
				+ ", casign=" + casign + ", subAcctNo=" + subAcctNo + ", funcionID=" + funcionID + ", merNo=" + merNo
				+ "]";
	}

}
