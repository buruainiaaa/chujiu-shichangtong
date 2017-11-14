package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 会员资金账户提现出金申请查询 返回 模型
 * 
 * FundOutQuery
 * 
 * cody cody 2017年11月14日 上午10:41:44
 * 
 * @version 1.0.0
 *
 */
@ApiModel("会员资金账户提现出金申请查询返回 集合子类")
public class FundOutQueryResultListModel extends BaseReport {
	@ApiModelProperty(value = "交易流水号 渠道流水号", required = true)
	@JSONField(name = "SerialNo")
	private String serialNo;// 交易流水号 渠道流水号
	@ApiModelProperty(value = "交易日期 渠道交易日期，格式：yyyyMMdd", required = true)
	@JSONField(name = "TransDate")
	private String transDate;// 交易日期 渠道交易日期，格式：yyyyMMdd
	@ApiModelProperty(value = "交易时间 渠道交易时间，格式：HHmmss", required = true)
	@JSONField(name = "TransTime")
	private String transTime;// 交易时间 渠道交易时间，格式：HHmmss
	@ApiModelProperty(value = "资金账号 会员资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号 会员资金账号
	@ApiModelProperty(value = "资金户名 会员资金户名", required = true)
	@JSONField(name = "SubAcctName")
	private String subAcctName;// 资金户名 会员资金户名

	@ApiModelProperty(value = "交易金额 提现金额", required = true)
	@JSONField(name = "Amount")
	private String amount;// 交易金额 提现金额
	@ApiModelProperty(value = "收款账号 个人银行卡号或企业账号", required = true)
	@JSONField(name = "RcvAcctNo")
	private String rcvAcctNo;// 收款账号 个人银行卡号或企业账号
	@ApiModelProperty(value = "收款户名 个人银行卡户名或企业账户户名", required = true)
	@JSONField(name = "RcvAcctName")
	private String rcvAcctName;// 收款户名 个人银行卡户名或企业账户户名
	@ApiModelProperty(value = "收款行号 大小额收款行号", required = true)
	@JSONField(name = "RcvBankNo")
	private String rcvBankNo;// 收款行号 大小额收款行号
	@ApiModelProperty(value = "收款行名 大小额收款行名", required = true)
	@JSONField(name = "RcvBankName")
	private String rcvBankName;// 收款行名 大小额收款行名
	@ApiModelProperty(value = "交易附言", required = true)
	@JSONField(name = "PostScript")
	private String postScript;// 交易附言
	@ApiModelProperty(value = "商户流水号 商户流水号或订单号", required = true)
	@JSONField(name = "OrderNo")
	private String orderNo;// 商户流水号 商户流水号或订单号
	@ApiModelProperty(value = "手续费金额", required = true)
	@JSONField(name = "FeeAmt")
	private String feeAmt;// 手续费金额
	@ApiModelProperty(value = "佣金金额 佣金汇总金额", required = true)
	@JSONField(name = "SalaryAmt")
	private String salaryAmt;// 佣金金额 佣金汇总金额
	@ApiModelProperty(value = "交易状态 0.待支付 2.处理中 3.成功 4.交易关闭 5.删除 6.已退款 7.交易失败 8.交易完成 9.待审核 F.提现申请确认过程失败", required = true)
	@JSONField(name = "Status")
	private String status;// 交易状态 0.待支付 2.处理中 3.成功 4.交易关闭 5.删除 6.已退款 7.交易失败
							// 8.交易完成 9.待审核 F.提现申请确认过程失败

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRcvAcctNo() {
		return rcvAcctNo;
	}

	public void setRcvAcctNo(String rcvAcctNo) {
		this.rcvAcctNo = rcvAcctNo;
	}

	public String getRcvAcctName() {
		return rcvAcctName;
	}

	public void setRcvAcctName(String rcvAcctName) {
		this.rcvAcctName = rcvAcctName;
	}

	public String getRcvBankNo() {
		return rcvBankNo;
	}

	public void setRcvBankNo(String rcvBankNo) {
		this.rcvBankNo = rcvBankNo;
	}

	public String getRcvBankName() {
		return rcvBankName;
	}

	public void setRcvBankName(String rcvBankName) {
		this.rcvBankName = rcvBankName;
	}

	public String getPostScript() {
		return postScript;
	}

	public void setPostScript(String postScript) {
		this.postScript = postScript;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getSalaryAmt() {
		return salaryAmt;
	}

	public void setSalaryAmt(String salaryAmt) {
		this.salaryAmt = salaryAmt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FundOutQueryResult [serialNo=" + serialNo + ", transDate=" + transDate + ", transTime=" + transTime
				+ ", subAcctNo=" + subAcctNo + ", subAcctName=" + subAcctName + ", amount=" + amount + ", rcvAcctNo="
				+ rcvAcctNo + ", rcvAcctName=" + rcvAcctName + ", rcvBankNo=" + rcvBankNo + ", rcvBankName="
				+ rcvBankName + ", postScript=" + postScript + ", orderNo=" + orderNo + ", feeAmt=" + feeAmt
				+ ", salaryAmt=" + salaryAmt + ", status=" + status + "]";
	}

}
