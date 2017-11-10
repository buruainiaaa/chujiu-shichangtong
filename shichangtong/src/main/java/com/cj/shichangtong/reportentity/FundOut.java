package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 提现出金
 * 
 * FundOut
 * 
 * cody cody 2017年11月10日 下午1:49:06
 * 
 * @version 1.0.0
 *
 */
@ApiModel("客户提现出金")
public class FundOut extends BaseReport {

	@ApiModelProperty(value = "资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号
	@ApiModelProperty(value = "操作标志0-实时提现  1-提现申请", required = true)
	@JSONField(name = "OperFlag")
	private String operFlag;// 操作标志0-实时提现 1-提现申请
	@ApiModelProperty(value = "交易金额", required = true)
	@JSONField(name = "Amount")
	private String amount;// 交易金额
	@ApiModelProperty(value = "提现费用", required = true)
	@JSONField(name = "FeeList")
	private java.util.List<Fee> feeList;

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}

	public String getOperFlag() {
		return operFlag;
	}

	public void setOperFlag(String operFlag) {
		this.operFlag = operFlag;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public java.util.List<Fee> getFeeList() {
		return feeList;
	}

	public void setFeeList(java.util.List<Fee> feeList) {
		this.feeList = feeList;
	}

	@Override
	public String toString() {
		return "FundOut [subAcctNo=" + subAcctNo + ", operFlag=" + operFlag + ", amount=" + amount + ", feeList="
				+ feeList + "]";
	}

}
