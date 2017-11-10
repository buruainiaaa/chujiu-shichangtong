package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("提现费用模型")
public class Fee {

	@ApiModelProperty(value = "费用Code", required = true)
	@JSONField(name = "FeeCode")
	private String feeCode;// 费用Code

	@ApiModelProperty(value = "费用金额", required = true)
	@JSONField(name = "FeeAmt")
	private String feeAmt; // 费用金额

	public String getFeeCode() {
		return feeCode;
	}

	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	@Override
	public String toString() {
		return "Fee [feeCode=" + feeCode + ", feeAmt=" + feeAmt + "]";
	}

}
