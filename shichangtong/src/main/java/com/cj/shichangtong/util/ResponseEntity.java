package com.cj.shichangtong.util;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;

import org.hamcrest.text.IsEmptyString;

import com.github.pagehelper.Page;

import io.swagger.annotations.ApiModelProperty;

public class ResponseEntity {

	/**
	 * 查询分页数据查询成功对象模型
	 * @param list  数据集合
	 * @param pageIndex   当前页
	 * @param pageSize	  每页显示的数据总数
	 * @param totalPage  总页数
	 * @param totalSize  数据总条数
	 * @return
	 */
	public static <T> PageModel getSuccessPageModel(List<T> list,Integer pageIndex,Integer pageSize,Integer totalPage,Integer totalSize){
		PageModel<T> pageModel=new PageModel<>();
		pageModel.setCode("200");
		pageModel.setMsg("操作成功！");
		pageModel.setPageIndex(pageIndex);
		pageModel.setResultDate(list);
		pageModel.setPageSize(pageSize);
		pageModel.setTotalPage(totalPage);
		pageModel.setTotalSize(totalSize);
		return pageModel;
	}
	
	/**
	 * 查询分页数据查询成功对象模型(无需分页信息，需要Pagehelper插件查询后的List结果集，实现自动读取分页数据)
	 * @param list  数据集合
	 * @param pageIndex   当前页
	 * @param pageSize	  每页显示的数据总数
	 * @param totalPage  总页数
	 * @param totalSize  数据总条数
	 * @return
	 */
	public static <T> PageModel getSuccessPageModel(List<T> list){
		PageModel<T> pageModel=new PageModel<>();
		pageModel.setCode("200");
		pageModel.setMsg("操作成功！");
		if (list instanceof Page) {
			Page<T> new_name = (Page<T>) list;
			pageModel.setPageIndex(new_name.getPageNum());
			pageModel.setResultDate(list);
			pageModel.setPageSize(new_name.getPageSize());
			pageModel.setTotalPage(new_name.getPages());
			pageModel.setTotalSize((int)new_name.getTotal());
		}
		return pageModel;
	}
	
	/**
	 * 查询分页数据查询失败对象模型
	 * @param Msg 失败的错误信息
	 * @return
	 */
	public static <T> PageModel getFailurePageModel(String msg){
		PageModel<T> pageModel=new PageModel<>();
		pageModel.setCode("-1");
		pageModel.setMsg("操作失败！"+msg);
		pageModel.setPageIndex(0);
		pageModel.setResultDate(null);
		pageModel.setPageSize(0);
		pageModel.setTotalPage(0);
		pageModel.setTotalSize(0);
		return pageModel;
	}
	
	
	/**
	 * 查询单个对象成功数据模型
	 * @param t 对象
	 * @return
	 */
	public static <T> ResultModel getSuccessModel(T t){
		ResultModel<T> resultModel=new ResultModel<>();
		resultModel.setCode("200");
		resultModel.setMsg("操作成功！");
		resultModel.setResultDate(t);
		return resultModel;
	}
	
	/**
	 * 查询单个对象失败数据模型
	 * @param msg 异常信息
	 * @return
	 */
	public static <T> ResultModel getFailureModel(String msg){
		ResultModel<T> resultModel=new ResultModel<>();
		resultModel.setCode("200");
		resultModel.setMsg("操作失败！"+msg);
		resultModel.setResultDate(null);
		return resultModel;
	}
	
}
