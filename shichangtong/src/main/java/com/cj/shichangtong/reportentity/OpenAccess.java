package com.cj.shichangtong.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 客户发起企业会员资金账号开户
 * 
 * @author Cody
 *
 */
@ApiModel(value = "OpenAccess", description = "企业会员资金账户开户")
public class OpenAccess extends BaseReport {

	@ApiModelProperty(value = "企业代码", required = false)
	private String custNo;// 企业代码
	@ApiModelProperty(value = "企业名称", required = false)
	private String custName;// 企业名称
	@ApiModelProperty(value = "企业证件类型 B-营业执照 C-社会统一认证码", required = false)
	private String certType;// 企业证件类型
	@ApiModelProperty(value = "企业证件号码", required = false)
	private String certNo;// 企业证件号码
	@ApiModelProperty(value = "经办人姓名", required = false)
	private String orgAgentName;// 经办人姓名
	@ApiModelProperty(value = "经办人手机号", required = false)
	private String orgAgentMobile;// 经办人手机号
	@ApiModelProperty(value = "经办人证件号码", required = false)
	private String orgAgentCertNo;// 经办人证件号码
	@ApiModelProperty(value = "法人代表", required = false)
	private String legalRealName;// 法人代表
	@ApiModelProperty(value = "法人证件类型 1-身份证", required = false)
	private String legalCertType;// 法人证件类型
	@ApiModelProperty(value = "法人证件号码", required = false)
	private String legalCertNo;// 法人证件号码

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

	public String getLegalRealName() {
		return legalRealName;
	}

	public void setLegalRealName(String legalRealName) {
		this.legalRealName = legalRealName;
	}

	public String getLegalCertType() {
		return legalCertType;
	}

	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public String getLegalCertNo() {
		return legalCertNo;
	}

	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getOrgAgentName() {
		return orgAgentName;
	}

	public void setOrgAgentName(String orgAgentName) {
		this.orgAgentName = orgAgentName;
	}

	public String getOrgAgentMobile() {
		return orgAgentMobile;
	}

	public void setOrgAgentMobile(String orgAgentMobile) {
		this.orgAgentMobile = orgAgentMobile;
	}

	public String getOrgAgentCertNo() {
		return orgAgentCertNo;
	}

	public void setOrgAgentCertNo(String orgAgentCertNo) {
		this.orgAgentCertNo = orgAgentCertNo;
	}

	@Override
	public String toString() {
		return "OpenAccess [custNo=" + custNo + ", custName=" + custName + ", certType=" + certType + ", certNo="
				+ certNo + ", orgAgentName=" + orgAgentName + ", orgAgentMobile=" + orgAgentMobile + ", orgAgentCertNo="
				+ orgAgentCertNo + ", legalRealName=" + legalRealName + ", legalCertType=" + legalCertType
				+ ", legalCertNo=" + legalCertNo + "]";
	}

}
