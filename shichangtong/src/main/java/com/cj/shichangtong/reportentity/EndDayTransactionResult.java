package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商户日终交易返回模型
 * 
 * EndDayTransactionResult
 * 
 * cody cody 2017年11月14日 上午10:34:24
 * 
 * @version 1.0.0
 *
 */
@ApiModel("商户日终交易返回模型")
public class EndDayTransactionResult extends BaseResultReport2 {

	@ApiModelProperty("文件名")
	@JSONField(name = "FileName")
	private String fileName;// 文件名
	@ApiModelProperty("总记录数")
	@JSONField(name = "RecordNum")
	private String recordNum;// 总记录数

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}

	@Override
	public String toString() {
		return "EndDayTransactionResult [fileName=" + fileName + ", recordNum=" + recordNum + "]";
	}

}
