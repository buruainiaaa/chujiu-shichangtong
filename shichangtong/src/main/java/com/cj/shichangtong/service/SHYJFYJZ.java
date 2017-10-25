package com.cj.shichangtong.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.shichangtong.conf.ServiceUrl;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.util.HttpClientUtil;

import net.sf.json.JSONObject;


@Service
public class SHYJFYJZ {
	@Autowired
	private ServiceUrl serviceUrl;
	public String openAccess(OpenAccess openAccess) {
		JSONObject json = new JSONObject();
		json.put("bizDate", 1);// 业务日期
		json.put("bizTime", 1);// 业务时间
		json.put("funcionID", 1);// 交易代码
		json.put("serialNo", 1);// 业务流水
		json.put("merNo", 1);// 商户编号
		json.put("casign", 1);// 签名字段
		json.put("rebackUrl", 1);// 商户返回Url
		json.put("notifyUrl", 1);// 回调Url

		json.put("CustNo", 1);// 企业代码
		json.put("CustName", 1);// 企业名称
		json.put("CertType", 1);// 企业证件类型
		json.put("CertNo", 1);// 企业证件号码
		json.put("LegalRealName", 1);// 法人代表
		json.put("LegalCertType", 1);// 法人证件类型
		json.put("LegalCertNo", 1);// 法人证件号码
		json.put("AgentName", 1);// 经办人
		json.put("AgentCertType", 1);// 经办人证件类型
		json.put("AgentCertNo", 1);// 经办人证件号码
		json.put("AgentMobileNo", 1);// 经办人手机号码
		return HttpClientUtil.post(json, serviceUrl.getSHYJFYJZ());
	}

}
