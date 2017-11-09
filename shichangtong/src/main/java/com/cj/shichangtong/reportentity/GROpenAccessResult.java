package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("资金账户开户回调报文")
public class GROpenAccessResult extends BaseResultReport2 {

	@ApiModelProperty(value = "资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号
	@ApiModelProperty(value = "资金户名", required = true)
	@JSONField(name = "SubAcctName")
	private String subAcctName;// 资金户名
	@ApiModelProperty(value = "开户行号", required = true)
	@JSONField(name = "BankNo")
	private String bankNo;// 开户行号
	@ApiModelProperty(value = "开户行名", required = true)
	@JSONField(name = "BankName")
	private String bankName;// 开户行名

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}

	public String getSubAcctName() {
		return subAcctName;
	}

	public void setSubAcctName(String subAcctName) {
		this.subAcctName = subAcctName;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "GROpenAccessResult [subAcctNo=" + subAcctNo + ", subAcctName=" + subAcctName + ", bankNo=" + bankNo
				+ ", bankName=" + bankName + "]";
	}

}
