package com.cj.shichangtong.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * 
 * GROpenAccess 客户发起个人会员资金账户开户
 * 
 * cody cody 2017年11月6日 下午4:55:17
 * 
 * @version 1.0.0
 *
 */
@ApiModel(value = "客户发起个人会员资金账户开户", description = "GROpenAccess")
public class GROpenAccess extends BaseReport {

	@ApiModelProperty(value = "用户代码", required = true)
	private String custNo;
	@ApiModelProperty(value = "用户姓名", required = true)
	private String custName;
	@ApiModelProperty(value = "证件类型 1 身份证", required = true)
	private String certType;
	@ApiModelProperty(value = "证件号码", required = true)
	private String certNo;
	@ApiModelProperty(value = "手机号码", required = true)
	private String mobileNo;

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "GROpenAccess [custNo=" + custNo + ", custName=" + custName + ", certType=" + certType + ", certNo="
				+ certNo + ", mobileNo=" + mobileNo + "]";
	}

}
