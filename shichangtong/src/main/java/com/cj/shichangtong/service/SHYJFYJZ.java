package com.cj.shichangtong.service;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.shichangtong.conf.ServiceUrl;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.util.BankCasignUtil;
import com.cj.shichangtong.util.DateUtils;
import com.cj.shichangtong.util.HttpClientUtil;

import net.sf.json.JSONObject;

/**
 * 市场通服务接口
 * 
 * @author Administrator
 *
 */
@Service
public class SHYJFYJZ {
	@Autowired
	private ServiceUrl serviceUrl;

	/**
	 * 
	 * 企业会员对公开户
	 */
	public String openAccess(OpenAccess openAccess) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "880001");// 交易代码
		json.put("serialNo", "QDRZ_" + new Random().nextInt(10000) + "TEST");// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("casign", "1");// 签名字段

		json.put("custNo", "1221");// 企业代码
		json.put("custName", "1123");// 企业名称
		json.put("certType", "1");// 企业证件类型
		json.put("certNo", "43042619910420489x");// 企业证件号码
		json.put("legalRealName", "唐文金");// 法人代表
		json.put("legalCertType", 1);// 法人证件类型
		json.put("legalCertNo", "43042619910420489x");// 法人证件号码
		return HttpClientUtil.post(json, serviceUrl.getDGKH());
	}

	/**
	 * 
	 * openAccess(客户发起个人会员资金账户开户)
	 * 
	 * @param openAccess
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String GROpenAccess(com.cj.shichangtong.reportentity.GROpenAccess grOpenAccess) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "880002");// 交易代码
		json.put("serialNo", grOpenAccess.getSerialNo());// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("casign", BankCasignUtil.getHuiFengSign());// 签名字段

		json.put("CustNo", grOpenAccess.getCustNo());// 用户代码
		json.put("CustName", grOpenAccess.getCustName());// 用户姓名
		json.put("CertType", grOpenAccess.getCertType());// 证件类型 1-身份证
		json.put("CertNo", grOpenAccess.getCertNo());// 固定为身份证号码
		json.put("MobileNo", grOpenAccess.getMobileNo());// 手机号码
		return HttpClientUtil.post(json, serviceUrl.getDSKH());
	}

	/**
	 * 资金账户管理类报文请求服务
	 * 
	 * 客户发起个人资金账户交易密码修改 880003， 客户发起企业资金账户交易密码修改 880004， 客户发起个人用户手机号码修改 880005，
	 * 客户发起企业用户手机号码修改 880006， 客户发起个人银行卡绑定 880007， 客户发起企业银行卡绑定 880008， 客户发起银行卡解绑
	 * 880010， 客户发起个人资金账户销户 880011， 客户发起企业资金账户销户 880012， 客户发起个人资金账户冻结 880013，
	 * 客户发起企业资金账户冻结 880014， 客户发起个人资金账户解冻 880015， 客户发起企业资金账户解冻 880016，
	 * 客户发起个人资金账户交易密码重置 880017， 客户发起企业资金账户交易密码重置 880018，
	 * 
	 * @param openAccess
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String AccessManagement(String serialNo, String subAcctNo, String funcionID) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", funcionID);// 交易代码
		json.put("serialNo", serialNo);// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("casign", BankCasignUtil.getHuiFengSign());// 签名字段

		json.put("SubAcctNo", subAcctNo);// 资金账号
		return HttpClientUtil.post(json, serviceUrl.getDGBD());
	}

}
