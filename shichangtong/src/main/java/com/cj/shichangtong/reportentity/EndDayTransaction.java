package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商户日终对账报文实体
 * 
 * EndDayTransaction
 * 
 * cody cody 2017年11月14日 上午10:20:02
 * 
 * @version 1.0.0
 *
 */
@ApiModel("商户日终交易")
public class EndDayTransaction extends BaseReport {

	@ApiModelProperty(value = "操作标志 0-开市 1-闭市 2-对账", required = true)
	@JSONField(name = "OperFlag")
	private String operFlag;// 操作标志 "0-开市 1-闭市 2-对账"
	@ApiModelProperty(value = "操作方式  缺省同步 0-同步 1- 异步 仅对OperFlag=2 有效 异步方式时恒丰在生成对账文件或对账完成后通过结果通知交易返回结果，如果对账不平也返回对应的不平文件", required = true)
	@JSONField(name = "OperType")
	private String operType;// 操作方式 缺省同步 0-同步 1- 异步 仅对OperFlag=2 有效
							// 异步方式时恒丰在生成对账文件或对账完成后通过结果通知交易返回结果，如果对账不平也返回对应的不平文件
	@ApiModelProperty(value = "对账日期 开市为当前工作日 闭市为下工作日 对账为对账日期，缺省为当天", required = true)
	@JSONField(name = "CheckDate")
	private String checkDate;// 对账日期 "开市为当前工作日 闭市为下工作日 对账为对账日期，缺省为当天"

	public String getOperFlag() {
		return operFlag;
	}

	public void setOperFlag(String operFlag) {
		this.operFlag = operFlag;
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return "EndDayTransaction [operFlag=" + operFlag + ", operType=" + operType + ", checkDate=" + checkDate + "]";
	}

}
