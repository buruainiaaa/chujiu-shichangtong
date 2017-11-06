package com.cj.shichangtong.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * 
 * BaseReport 公共报文头
 * 
 * cody cody 2017年11月6日 下午5:08:54
 * 
 * @version 1.0.0
 *
 */
@ApiModel(value = "BaseReport", description = "公共报文头")
public class BaseReport {

	@ApiModelProperty(value = "业务日期", required = true)
	private String bizDate; // 业务日期
	@ApiModelProperty(value = "业务时间", required = true)
	private String bizTime; // 业务时间
	@ApiModelProperty(value = "交易代码", required = true)
	private String funcionID; // 交易代码
	@ApiModelProperty(value = "业务流水", required = true)
	private String serialNo; // 业务流水
	@ApiModelProperty(value = "商户编号", required = true)
	private String merNo; // 商户编号
	@ApiModelProperty(value = "签名字段", required = true)
	private String casign; // 签名字段
	@ApiModelProperty(value = "商户返回Url", required = false)
	private String rebackUrl; // 商户返回Url
	@ApiModelProperty(value = "回调Url", required = false)
	private String notifyUrl; // 回调Url

	public String getBizDate() {
		return bizDate;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizTime() {
		return bizTime;
	}

	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getFuncionID() {
		return funcionID;
	}

	public void setFuncionID(String funcionID) {
		this.funcionID = funcionID;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getCasign() {
		return casign;
	}

	public void setCasign(String casign) {
		this.casign = casign;
	}

	public String getRebackUrl() {
		return rebackUrl;
	}

	public void setRebackUrl(String rebackUrl) {
		this.rebackUrl = rebackUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	@Override
	public String toString() {
		return "BaseReport [bizDate=" + bizDate + ", bizTime=" + bizTime + ", funcionID=" + funcionID + ", serialNo="
				+ serialNo + ", merNo=" + merNo + ", casign=" + casign + ", rebackUrl=" + rebackUrl + ", notifyUrl="
				+ notifyUrl + "]";
	}

}
