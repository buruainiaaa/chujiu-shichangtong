package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 会员资金账户提现出金申请查询 模型
 * 
 * FundOutQuery
 * 
 * cody cody 2017年11月14日 上午10:41:44
 * 
 * @version 1.0.0
 *
 */
@ApiModel("会员资金账户提现出金申请查询")
public class FundOutQuery extends BaseReport {
	@ApiModelProperty(value = "资金账号", required = true)
	@JSONField(name = "SubAcctNo")
	private String subAcctNo;// 资金账号
	@ApiModelProperty(value = "商户流水号", required = true)
	@JSONField(name = "OrderNo")
	private String orderNo;// 商户流水号
	@ApiModelProperty(value = "起始日期", required = true)
	@JSONField(name = "StartDate")
	private String startDate;// 起始日期
	@ApiModelProperty(value = "截止日期", required = true)
	@JSONField(name = "EndDate")
	private String endDate;// 截止日期
	@ApiModelProperty(value = "页码", required = true)
	@JSONField(name = "PageId")
	private String pageId;// 页码
	@ApiModelProperty(value = "每页记录数", required = true)
	@JSONField(name = "PageSize")
	private String pageSize;// 每页记录数

	public String getSubAcctNo() {
		return subAcctNo;
	}

	public void setSubAcctNo(String subAcctNo) {
		this.subAcctNo = subAcctNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "FundOutQuery [subAcctNo=" + subAcctNo + ", orderNo=" + orderNo + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", pageId=" + pageId + ", pageSize=" + pageSize + "]";
	}

}
