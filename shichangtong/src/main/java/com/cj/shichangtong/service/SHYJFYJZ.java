package com.cj.shichangtong.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.shichangtong.conf.ServiceUrl;
import com.cj.shichangtong.reportentity.BankFileGenNotice;
import com.cj.shichangtong.reportentity.EndDayTransaction;
import com.cj.shichangtong.reportentity.FundOut;
import com.cj.shichangtong.reportentity.OpenAccess;
import com.cj.shichangtong.sign.SignConfig;
import com.cj.shichangtong.util.BankCasignUtil;
import com.cj.shichangtong.util.DateUtils;
import com.cj.shichangtong.util.HttpClientUtil;

import net.sf.json.JSONObject;

/**
 * 市场通服务接口_开户
 * 
 * @author Administrator
 *
 */
@Service
public class SHYJFYJZ {
	@Autowired
	private ServiceUrl serviceUrl;

	@Autowired
	private SignConfig signConfig;

	/**
	 * 
	 * 企业会员对公开户
	 */
	public String openAccess(OpenAccess openAccess) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "880001");// 交易代码
		json.put("serialNo", openAccess.getSerialNo());// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("rebackUrl", openAccess.getRebackUrl());// 商户返回Url
		json.put("notifyUrl", openAccess.getNotifyUrl());// 回调Url

		json.put("CustNo", openAccess.getCustNo());// 企业代码
		json.put("CustName", openAccess.getCustName());// 企业名称
		json.put("CertType", openAccess.getCertType());// 企业证件类型
		json.put("CertNo", openAccess.getCertNo());// 企业证件号码
		json.put("OrgAgentName", openAccess.getOrgAgentName());// 企业证件号码
		json.put("OrgAgentMobile", openAccess.getOrgAgentMobile());// 企业证件号码
		json.put("OrgAgentCertNo", openAccess.getOrgAgentCertNo());// 企业证件号码
		json.put("LegalRealName", openAccess.getLegalRealName());// 法人代表
		json.put("LegalCertType", openAccess.getLegalCertType());// 法人证件类型
		json.put("LegalCertNo", openAccess.getLegalCertNo());// 法人证件号码

		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
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
		json.put("rebackUrl", grOpenAccess.getRebackUrl());// 商户返回Url
		json.put("notifyUrl", grOpenAccess.getNotifyUrl());// 回调Url

		json.put("CustNo", grOpenAccess.getCustNo());// 用户代码
		json.put("CustName", grOpenAccess.getCustName());// 用户姓名
		json.put("CertType", grOpenAccess.getCertType());// 证件类型 1-身份证
		json.put("CertNo", grOpenAccess.getCertNo());// 固定为身份证号码
		json.put("MobileNo", grOpenAccess.getMobileNo());// 手机号码
		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
		return HttpClientUtil.post(json, serviceUrl.getDSKH());
	}

	/**
	 * 资金账户管理类报文请求服务
	 * 
	 * 客户发起个人资金账户交易密码修改 880003， 客户发起企业资金账户交易密码修改 880004， 客户发起个人用户手机号码修改 880005，
	 * 客户发起企业用户手机号码修改 880006， 客户发起个人银行卡绑定 880007， 客户发起企业银行卡绑定 880008， 客户发起银行卡解绑
	 * 880010， 客户发起个人资金账户销户 880011， 客户发起企业资金账户销户 880012， 客户发起个人资金账户冻结 880013，
	 * 客户发起企业资金账户冻结 880014， 客户发起个人资金账户解冻 880015， 客户发起企业资金账户解冻 880016，
	 * 客户发起个人资金账户交易密码重置 880017， 客户发起企业资金账户交易密码重置 880018， AccessManagement
	 * 
	 * @param serialNo
	 *            业务流水
	 * @param subAcctNo
	 *            资金账号
	 * @param funcionID
	 *            服务ID
	 * @param rebackUrl
	 *            前台页面回跳地址
	 * @param notifyUrl
	 *            后台服务回调通知地址
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String AccessManagement(String serialNo, String subAcctNo, String funcionID, String rebackUrl,
			String notifyUrl) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", funcionID);// 交易代码
		json.put("serialNo", serialNo);// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("rebackUrl", rebackUrl);// 商户返回Url
		json.put("notifyUrl", notifyUrl);// 回调Url

		json.put("SubAcctNo", subAcctNo);// 资金账号

		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
		return HttpClientUtil.post(json, serviceUrl.getDGBD());
	}

	/**
	 * 客户提现出金 fundOut
	 * 
	 * @param out
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String fundOut(FundOut out) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "880009");// 交易代码
		json.put("serialNo", out.getSerialNo());// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号
		json.put("rebackUrl", out.getRebackUrl());// 商户返回Url
		json.put("notifyUrl", out.getNotifyUrl());// 回调Url

		json.put("SubAcctNo", out.getSubAcctNo());//
		json.put("OperFlag", out.getOperFlag());//
		json.put("Amount", out.getAmount());//
		json.put("FeeList", out.getFeeList());//

		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
		return HttpClientUtil.post(json, serviceUrl.getTXCJ());
	}

	/**
	 * 商户文件生成提醒 merFileGeneratorNotice
	 * 
	 * @param bankFileGenNotice
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String merFileGeneratorNotice(BankFileGenNotice bankFileGenNotice) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "890039");// 交易代码
		json.put("serialNo", bankFileGenNotice.getSerialNo());// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号

		json.put("FileName", bankFileGenNotice.getFileName());//
		json.put("NoticeDate", bankFileGenNotice.getNoticeDate());//
		json.put("FileFlag", bankFileGenNotice.getFileFlag());//
		json.put("RecordNum", bankFileGenNotice.getRecordNum());//

		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
		return HttpClientUtil.post(json, serviceUrl.getWJSCTZ());

	}

	/**
	 * 商户日终交易 merFileGeneratorNotice
	 * 
	 * @param bankFileGenNotice
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public String endDayTransaction(EndDayTransaction endDayTransaction) {
		JSONObject json = new JSONObject();
		json.put("bizDate", DateUtils.formatDate(new Date()));// 业务日期
		json.put("bizTime", DateUtils.formatTime(new Date()));// 业务时间
		json.put("funcionID", "890040");// 交易代码
		json.put("serialNo", endDayTransaction.getSerialNo());// 业务流水
		json.put("merNo", serviceUrl.getMerNo());// 商户编号

		json.put("OperFlag", endDayTransaction.getOperFlag());// 操作标志
		json.put("OperType", endDayTransaction.getOperType());// 操作方式
		json.put("CheckDate", endDayTransaction.getCheckDate());// 对账日期

		String caSign = BankCasignUtil.getHuiFengSign(json.toString());
		json.put("casign", caSign);// 签名字段
		return HttpClientUtil.post(json, serviceUrl.getRZDZ());

	}

}
