package com.example.demo.util;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="PageModel",description="分页模型")
public class PageModel<T> {

	@ApiModelProperty(value="返回状态码,200成功 -1失败",required=false)
	private String code;
	
	@ApiModelProperty(value="返回信息",required=false)
	private String msg;
	
	@ApiModelProperty(value="返回数据",required=false)
	private List<T> resultDate;
	
	@ApiModelProperty(value="当前页",required=false)
	private Integer pageIndex;
	
	@ApiModelProperty(value="每页显示的条数",required=false)
	private Integer pageSize;
	
	@ApiModelProperty(value="总页数",required=false)
	private Integer totalPage;
	
	@ApiModelProperty(value="数据总条数",required=false)
	private Integer totalSize;

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

	public List<T> getResultDate() {
		return resultDate;
	}

	public void setResultDate(List<T> resultDate) {
		this.resultDate = resultDate;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	@Override
	public String toString() {
		return "PageModel [code=" + code + ", msg=" + msg + ", resultDate=" + resultDate + ", pageIndex=" + pageIndex
				+ ", pageSize=" + pageSize + ", totalPage=" + totalPage + ", totalSize=" + totalSize + "]";
	}
	
	
}
