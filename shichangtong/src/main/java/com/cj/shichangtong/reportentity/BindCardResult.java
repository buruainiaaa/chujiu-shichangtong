package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 会员绑卡 回调
 * 
 * BindCardResult
 * 
 * cody cody 2017年11月9日 下午3:29:58
 * 
 * @version 1.0.0
 *
 */
@ApiModel("会员绑卡 回调")
public class BindCardResult extends BaseResultReport2 {

	@ApiModelProperty(value = "绑定银行卡卡号", required = true)
	@JSONField(name = "BankCardNo")
	private String bankCardNo;// 绑定银行卡卡号
	@ApiModelProperty(value = "资金账户户名", required = true)
	@JSONField(name = "SubAcctName")
	private String subAcctName;// 资金账户户名
	@ApiModelProperty(value = "联行行号", required = true)
	@JSONField(name = "BankNo")
	private String bankNo;// 联行行号
	@ApiModelProperty(value = "银行名称", required = true)
	@JSONField(name = "BankName")
	private String bankName;// 银行名称
	@ApiModelProperty(value = "银行卡户名", required = true)
	@JSONField(name = "BankCardName")
	private String bankCardName;// 银行卡户名

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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

	public String getBankCardName() {
		return bankCardName;
	}

	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	@Override
	public String toString() {
		return "BindCardResult [bankCardNo=" + bankCardNo + ", subAcctName=" + subAcctName + ", bankNo=" + bankNo
				+ ", bankName=" + bankName + ", bankCardName=" + bankCardName + "]";
	}

}
