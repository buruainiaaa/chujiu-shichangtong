package com.cj.shichangtong.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cj.auth.rpc.facade.authority.interfaces.IUserAuthorityFacade;
import com.cj.auth.rpc.facade.authority.transobject.UserInfoTransfer;
import com.cj.shichangtong.model.Test;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.service.SHYJFYJZ;
import com.cj.shichangtong.service.TestService;
import com.cj.shichangtong.util.DateUtils;
import com.cj.shichangtong.util.PageModel;
import com.cj.shichangtong.util.ResponseEntity;
import com.cj.shichangtong.util.ResultModel;
import com.cj.shichangtong.util.SftpUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(description = "测试集成", tags = "DemoController")
@RequestMapping("/test")
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	@Autowired
	private TestService testService;
	@Autowired
	private IUserAuthorityFacade userAuthorityFacade;
	@Autowired
	private SHYJFYJZ shyjfyjz;
	@Value("${sftp-host}")
	private String host;
	@Value("${sftp-port}")
	private int port;
	@Value("${sftp-username}")
	private String username;
	@Value("${sftp-password}")
	private String password;

	@Value("${sftp-bank-url}")
	private String sftpBankUrl;
	@Value("${sftp-mer-url}")
	private String sftpMerUrl;
	@Value("${sftp-mer-local-url}")
	private String sftpMerLocalUrl;
	@Value("${sftp-bank-local-url}")
	private String sftpBankLocalUrl;

	@RequestMapping(value = "/delete/{id}")
	public ModelMap delete(@PathVariable Integer id, RedirectAttributes ra) {
		ModelMap result = new ModelMap();
		testService.deleteById(id);
		result.put("msg", "删除成功!");
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "spring boot测试", notes = "spring boot测试")
	public String Demo() {
		return "Hello World!";
	}

	@RequestMapping(value = "/jspView")
	public String JspName(String name, Model model) {
		model.addAttribute("url", jdbcUrl);
		// ModelAndView mdv=new ModelAndView();
		// mdv.setViewName(name);
		return name;
	}

	@RequestMapping(value = "/sftpUpload")
	public String sftpUpload(HttpServletRequest request, HttpServletResponse response) {
		SftpUtils sftpUtils = new SftpUtils(host, port, username, password);
		File file = new File(sftpMerLocalUrl + "shichangtong.serviceLog.2017-11-10.log");
		sftpUtils.upload(sftpMerUrl, file);
		return "sftpUpload";
	}

	@RequestMapping(value = "/sftpDownload")
	public String sftpDownLoad(HttpServletRequest request, HttpServletResponse response) {
		// DefaultKeyMapping.xml
		SftpUtils sftpUtils = new SftpUtils(host, port, username, password);
		sftpUtils.get(sftpBankUrl + "/DefaultKeyMapping.xml",
				sftpBankLocalUrl + DateUtils.formatDate(new Date()) + DateUtils.formatTime(new Date()) + ".xml");
		return "sftpDownload";
	}

	@ResponseBody
	@RequestMapping(value = "/openAccess", method = RequestMethod.POST)
	@ApiOperation(value = "测试市场通接口", notes = "测试市场通接口返回")
	@ApiImplicitParam(name = "openAccess", value = "请求信息", paramType = "body", required = false)
	public ResultModel<OpenAccess> openAccess(@RequestBody OpenAccess openAccess) {
		OpenAccess openAccess1 = openAccess;
		System.out.println(openAccess1);
		return ResponseEntity.getSuccessModel(shyjfyjz.openAccess(openAccess));
	}

	@ApiOperation(value = "测试DUBBO", notes = "根据用户名获取用户密码")
	@ApiImplicitParam(name = "userName", value = "登录账号", paramType = "path", required = false)
	@ResponseBody
	@RequestMapping(value = "/test/{userName}", method = RequestMethod.DELETE)
	public ResultModel<String> test(@PathVariable String userName) {
		UserInfoTransfer user = userAuthorityFacade.getUserInfoByUsername(userName);
		ResultModel<String> res = ResponseEntity.getSuccessModel(user.getUsername());
		return res;
	}

	@RequestMapping(value = "/jspTest", method = RequestMethod.GET)
	public String jspTest() {
		return "helloJsp";
	}

	@ApiOperation(value = "测试mybatis", notes = "测试Mybatis")
	@ResponseBody
	@RequestMapping(value = "/test-mybatis", method = RequestMethod.GET)
	public ResultModel<Test> getEntity() {
		return ResponseEntity.getSuccessModel(testService.getById(2));
	}

	@ApiOperation(value = "测试mybatis分页", notes = "测试Mybatis分页")
	@ApiImplicitParams({ @ApiImplicitParam(name = "name", value = "名称查询", paramType = "query", required = false),
			@ApiImplicitParam(name = "pageIndex", value = "当前页", paramType = "query", required = false),
			@ApiImplicitParam(name = "pageSize", value = "每页显示的数据量", paramType = "query", required = false) })
	@ResponseBody
	@RequestMapping(value = "/test-mybatis/page/", method = RequestMethod.GET)
	public PageModel<Test> getTestPage(String name, Integer pageIndex, Integer pageSize) {
		Test test = new Test();
		test.setPage(pageIndex);
		test.setRows(pageSize);
		test.setName(name);
		List<Test> testList = testService.getAll(test);
		return ResponseEntity.getSuccessPageModel(testList);
	}

}
