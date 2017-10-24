package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cj.auth.rpc.facade.authority.interfaces.IUserAuthorityFacade;
import com.cj.auth.rpc.facade.authority.transobject.UserInfoTransfer;
import com.example.demo.model.Test;
import com.example.demo.reportentity.OpenAccess;
import com.example.demo.service.SHYJFYJZ;
import com.example.demo.service.TestService;
import com.example.demo.util.ResponseEntity;
import com.example.demo.util.ResultModel;
import com.sun.tools.doclint.Entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(description = "测试集成", tags = "DemoController")
@RequestMapping("/")
public class DemoController {
	
	@Autowired
	private com.example.demo.config.ServiceUrl ServiceUrl;

	@Autowired
	private IUserAuthorityFacade userAuthorityFacade;
	
	@Autowired
	private SHYJFYJZ shyjfyjz;
	
	@Autowired
	private TestService testService;
	
	
	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	@ApiOperation(value="spring boot测试",notes="spring boot测试")
	public String Demo(){
		return "Hello World!";
	}
	
	@ResponseBody
	@RequestMapping(value="/openAccess",method=RequestMethod.POST)
	@ApiOperation(value="测试市场通接口",notes="测试市场通接口返回")
	@ApiImplicitParam(name="openAccess",value="请求信息",paramType="body",required=false)
	public ResultModel<OpenAccess> openAccess(@RequestBody OpenAccess openAccess){
		OpenAccess openAccess1= openAccess;
		System.out.println(openAccess1);
		return ResponseEntity.getSuccessModel(shyjfyjz.openAccess(openAccess));
	}
	
	@ApiOperation(value="测试DUBBO",notes="根据用户名获取用户密码")
	@ApiImplicitParam(name="userName",value="登录账号",paramType="path",required=false)
	@ResponseBody
	@RequestMapping(value="/test/{userName}",method=RequestMethod.DELETE)
	public ResultModel<String> test(@PathVariable String userName){
		UserInfoTransfer user=userAuthorityFacade.getUserInfoByUsername(userName);
		ResultModel<String> res=ResponseEntity.getSuccessModel(user.getUsername());
		return res;
	}
	
	@RequestMapping(value="/jspTest",method=RequestMethod.GET)
	public String jspTest(){
		return "helloJsp";
	}
	
	@ApiOperation(value="测试mybatis",notes="测试Mybatis")
	@ResponseBody
	@RequestMapping(value="/test-mybatis",method=RequestMethod.GET)
	public ResultModel<Test> getEntity(){
		return ResponseEntity.getSuccessModel(testService.getEntity());
	}
}
