package com.cj.shichangtong.reportentity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * 
 * BankBind 管理类请求报文模型
 * 
 * cody 2017年11月6日 下午3:50:53
 * 
 * @version 1.0.0
 *
 */
@ApiModel(value = "BankBind", description = "管理类请求报文模型")
public class BankBind extends BaseReport {

	@ApiModelProperty(value = "资金账号", required = true)
	private String subAcctNo; // 资金账号

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}
}
