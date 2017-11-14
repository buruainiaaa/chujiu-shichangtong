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
@ApiModel("会员资金账户提现出金申请查询返回")
public class FundOutQueryResult {
	@ApiModelProperty(value = "页码", required = true)
	@JSONField(name = "PageId")
	private String pageId;// 页码
	@ApiModelProperty(value = "每页记录数", required = true)
	@JSONField(name = "PageSize")
	private String pageSize;// 每页记录数
	@ApiModelProperty(value = "总页数", required = true)
	@JSONField(name = "PageSum")
	private String pageSum;// 总页数
	@ApiModelProperty(value = "总记录数", required = true)
	@JSONField(name = "RecordNum")
	private String recordNum;// 总记录数

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

	public String getPageSum() {
		return pageSum;
	}

	public void setPageSum(String pageSum) {
		this.pageSum = pageSum;
	}

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}

	@Override
	public String toString() {
		return "FundOutQueryResult [pageId=" + pageId + ", pageSize=" + pageSize + ", pageSum=" + pageSum
				+ ", recordNum=" + recordNum + "]";
	}

}
