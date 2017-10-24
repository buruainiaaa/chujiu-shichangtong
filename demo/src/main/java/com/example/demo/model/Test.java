package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Test {
	@ApiModelProperty(value = "ID", required = true)
	private Integer id;
	@ApiModelProperty(value = "测试名称", required = true)
	private String name;
	@ApiModelProperty(value = "测试测试", required = true)
	private String testName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", name=" + name + ", testName=" + testName + "]";
	}

}
