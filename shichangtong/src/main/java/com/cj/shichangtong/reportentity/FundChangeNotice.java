package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("资金变动通知 报文模型")
public class FundChangeNotice extends BaseReport {

	@ApiModelProperty(value = "资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号
	@ApiModelProperty(value = "账号类型 0-平台 1-会员", required = true)
	@JSONField(name = "AcctType")
	private String acctType;// 账号类型 0-平台 1-会员
	@ApiModelProperty(value = "后台流水号", required = true)
	@JSONField(name = "NoticelNo")
	private String noticelNo;// 后台流水号
	@ApiModelProperty(value = "借贷标志 D-借 C-贷", required = true)
	@JSONField(name = "CdFlag")
	private String cdFlag;// 借贷标志 D-借 C-贷
	@ApiModelProperty(value = "交易金额", required = true)
	@JSONField(name = "Amount")
	private String amount;// 交易金额
	@ApiModelProperty(value = "交易附言", required = true)
	@JSONField(name = "PostScript")
	private String postScript;// 交易附言
	@ApiModelProperty(value = "通知类型 0001-客户入金 0002-客户出金 0003-交易付款 0004-交易收款 0005-开户 0006-销户 0007-绑卡 0008-解绑 0009-冻结 0010-解冻 0011-对账完成（对账平）", required = true)
	@JSONField(name = "OperFlag")
	private String operFlag;// 通知类型"0001-客户入金 0002-客户出金 0003-交易付款 0004-交易收款
							// 0005-开户 0006-销户 0007-绑卡 0008-解绑 0009-冻结 0010-解冻
							// 0011-对账完成（对账平）"
	@ApiModelProperty(value = "交易日期", required = true)
	@JSONField(name = "TransDate")
	private String transDate;// 交易日期
	@ApiModelProperty(value = "交易时间", required = true)
	@JSONField(name = "TransTime")
	private String transTime;// 交易时间
	@ApiModelProperty(value = "收款账号", required = true)
	@JSONField(name = "RcvAcctNo")
	private String rcvAcctNo;// 收款账号
	@ApiModelProperty(value = "收款户名", required = true)
	@JSONField(name = "RcvAcctName")
	private String rcvAcctName;// 收款户名
	@ApiModelProperty(value = "商户订单号", required = true)
	@JSONField(name = "OrderNo")
	private String orderNo;// 商户订单号

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getNoticelNo() {
		return noticelNo;
	}

	public void setNoticelNo(String noticelNo) {
		this.noticelNo = noticelNo;
	}

	public String getCdFlag() {
		return cdFlag;
	}

	public void setCdFlag(String cdFlag) {
		this.cdFlag = cdFlag;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPostScript() {
		return postScript;
	}

	public void setPostScript(String postScript) {
		this.postScript = postScript;
	}

	public String getOperFlag() {
		return operFlag;
	}

	public void setOperFlag(String operFlag) {
		this.operFlag = operFlag;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "FundChangeNotice [subAcctNo=" + subAcctNo + ", acctType=" + acctType + ", noticelNo=" + noticelNo
				+ ", cdFlag=" + cdFlag + ", amount=" + amount + ", postScript=" + postScript + ", operFlag=" + operFlag
				+ ", transDate=" + transDate + ", transTime=" + transTime + ", rcvAcctNo=" + rcvAcctNo
				+ ", rcvAcctName=" + rcvAcctName + ", orderNo=" + orderNo + "]";
	}

}
