package com.cj.shichangtong.reportentity;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("手机号码修改回调报文实体")
public class ModifyMobile extends BaseResultReport2 {

	@ApiModelProperty(value = "新手机号码", required = true)
	@JSONField(name = "NewMoblie")
	private String newMoblie;// 新手机号码

	public String getNewMoblie() {
		return newMoblie;
	}

	public void setNewMoblie(String newMoblie) {
		this.newMoblie = newMoblie;
	}

	@Override
	public String toString() {
		return "ModifyMobile [newMoblie=" + newMoblie + "]";
	}

}
