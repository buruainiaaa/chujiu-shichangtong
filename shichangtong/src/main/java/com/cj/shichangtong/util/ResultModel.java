package com.cj.shichangtong.util;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="PageModel",description="返回模型")
public class ResultModel<T> {

	@ApiModelProperty(value="返回状态码 200正常  -1失败",required=false)
	private String code;
	
	@ApiModelProperty(value="返回信息",required=false)
	private String msg;
	
	@ApiModelProperty(value="返回数据",required=false)
	private T resultDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResultDate() {
		return resultDate;
	}

	public void setResultDate(T resultDate) {
		this.resultDate = resultDate;
	}

	@Override
	public String toString() {
		return "ResultModel [code=" + code + ", msg=" + msg + ", resultDate=" + resultDate + "]";
	}
	
	
	
}
