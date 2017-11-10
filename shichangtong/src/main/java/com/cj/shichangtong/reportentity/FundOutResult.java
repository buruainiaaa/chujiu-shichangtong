package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("客户提现出金回调报文模型")
public class FundOutResult extends BaseResultReport2 {

	@ApiModelProperty(value = "交易流水号", required = true)
	@JSONField(name = "SerialNo")
	private String serialNo;// 交易流水号
	@ApiModelProperty(value = "手续费", required = true)
	@JSONField(name = "FeeAmt")
	private String feeAmt;// 手续费

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	@Override
	public String toString() {
		return "FundOutResult [serialNo=" + serialNo + ", feeAmt=" + feeAmt + "]";
	}

}
