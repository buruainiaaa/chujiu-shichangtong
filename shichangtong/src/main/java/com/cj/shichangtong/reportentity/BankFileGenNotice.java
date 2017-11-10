package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("银行文件生成通知报文模型")
public class BankFileGenNotice extends BaseReport {

	@ApiModelProperty(value = "文件名", required = true)
	@JSONField(name = "FileName")
	private String fileName;// 文件名
	@ApiModelProperty(value = "通知日期", required = true)
	@JSONField(name = "NoticeDate")
	private String noticeDate;// 通知日期
	@ApiModelProperty(value = "文件标识0001-交易所模式出入金明细 0002-交易所模式对账不平文件", required = true)
	@JSONField(name = "FileFlag")
	private String fileFlag;// 文件标识
	@ApiModelProperty(value = "总记录数", required = true)
	@JSONField(name = "RecordNum")
	private String recordNum;// 总记录数

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getFileFlag() {
		return fileFlag;
	}

	public void setFileFlag(String fileFlag) {
		this.fileFlag = fileFlag;
	}

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}

	@Override
	public String toString() {
		return "BankFileGenNotice [fileName=" + fileName + ", noticeDate=" + noticeDate + ", fileFlag=" + fileFlag
				+ ", recordNum=" + recordNum + "]";
	}

}
