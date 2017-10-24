package com.example.demo.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="OpenAccess",description="企业会员资金账户开户")
public class OpenAccess extends BaseReport {

	@ApiModelProperty(value="企业代码",required=false)
	private String CustNo;//		企业代码
	@ApiModelProperty(value="企业名称",required=false)
	private String CustName	;//	企业名称
	@ApiModelProperty(value="企业证件类型",required=false)
	private String CertType;//		企业证件类型
	@ApiModelProperty(value="企业证件号码",required=false)
	private String CertNo;//	企业证件号码
	@ApiModelProperty(value="法人代表",required=false)
	private String LegalRealName;//		法人代表
	@ApiModelProperty(value="法人证件类型",required=false)
	private String LegalCertType;//		法人证件类型
	@ApiModelProperty(value="法人证件号码",required=false)
	private String LegalCertNo	;//	法人证件号码
	@ApiModelProperty(value="经办人",required=false)
	private String AgentName;//		经办人
	@ApiModelProperty(value="经办人证件类型",required=false)
	private String AgentCertType;//		经办人证件类型
	@ApiModelProperty(value="经办人证件号码",required=false)
	private String AgentCertNo;//		经办人证件号码
	@ApiModelProperty(value="经办人手机号码",required=false)
	private String AgentMobileNo;//		经办人手机号码
	public String getCustNo() {
		return CustNo;
	}
	public void setCustNo(String custNo) {
		CustNo = custNo;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCertType() {
		return CertType;
	}
	public void setCertType(String certType) {
		CertType = certType;
	}
	public String getCertNo() {
		return CertNo;
	}
	public void setCertNo(String certNo) {
		CertNo = certNo;
	}
	public String getLegalRealName() {
		return LegalRealName;
	}
	public void setLegalRealName(String legalRealName) {
		LegalRealName = legalRealName;
	}
	public String getLegalCertType() {
		return LegalCertType;
	}
	public void setLegalCertType(String legalCertType) {
		LegalCertType = legalCertType;
	}
	public String getLegalCertNo() {
		return LegalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		LegalCertNo = legalCertNo;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public String getAgentCertType() {
		return AgentCertType;
	}
	public void setAgentCertType(String agentCertType) {
		AgentCertType = agentCertType;
	}
	public String getAgentCertNo() {
		return AgentCertNo;
	}
	public void setAgentCertNo(String agentCertNo) {
		AgentCertNo = agentCertNo;
	}
	public String getAgentMobileNo() {
		return AgentMobileNo;
	}
	public void setAgentMobileNo(String agentMobileNo) {
		AgentMobileNo = agentMobileNo;
	}
	
	@Override
	public String toString() {
		return "OpenAccess [CustNo=" + CustNo + ", CustName=" + CustName + ", CertType=" + CertType + ", CertNo="
				+ CertNo + ", LegalRealName=" + LegalRealName + ", LegalCertType=" + LegalCertType + ", LegalCertNo="
				+ LegalCertNo + ", AgentName=" + AgentName + ", AgentCertType=" + AgentCertType + ", AgentCertNo="
				+ AgentCertNo + ", AgentMobileNo=" + AgentMobileNo + "]";
	}

	
}
