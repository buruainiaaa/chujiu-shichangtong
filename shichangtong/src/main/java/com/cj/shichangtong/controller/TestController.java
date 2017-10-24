package com.cj.shichangtong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cj.auth.rpc.facade.authority.interfaces.IUserAuthorityFacade;
import com.cj.auth.rpc.facade.authority.transobject.UserInfoTransfer;
import com.cj.shichangtong.model.Test;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.service.TestService;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "测试集成", tags = "DemoController")
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	@Autowired
	private IUserAuthorityFacade userAuthorityFacade;
	
	@RequestMapping(value = "/delete/{id}")
    public ModelMap delete(@PathVariable Integer id, RedirectAttributes ra) {
		ModelMap result = new ModelMap();
        testService.deleteById(id);
        result.put("msg", "删除成功!");
        return result;
    }
	
	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	@ApiOperation(value="spring boot测试",notes="spring boot测试")
	public String Demo(){
		return "Hello World!";
	}
	
//	@ResponseBody
//	@RequestMapping(value="/openAccess",method=RequestMethod.POST)
//	@ApiOperation(value="测试市场通接口",notes="测试市场通接口返回")
//	@ApiImplicitParam(name="openAccess",value="请求信息",paramType="body",required=false)
//	public ResultModel<OpenAccess> openAccess(@RequestBody OpenAccess openAccess){
//		OpenAccess openAccess1= openAccess;
//		System.out.println(openAccess1);
//		return ResponseEntity.getSuccessModel(shyjfyjz.openAccess(openAccess));
//	}
	
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
		return ResponseEntity.getSuccessModel(testService.getById(2));
	}
	
//	@ApiOperation(value="测试mybatis2",notes="测试Mybatis2")
//	@ResponseBody
//	@RequestMapping(value="/test-mybatis2",method=RequestMethod.GET)
//	public ResultModel<City> getCity(){
//		return ResponseEntity.getSuccessModel(cityService.getById(3));
//	}
}
