package com.cj.shichangtong.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.cj.shichangtong.reportentity.BankFileGenNotice;
import com.cj.shichangtong.reportentity.BaseResultReport2;
import com.cj.shichangtong.reportentity.BindCardResult;
import com.cj.shichangtong.reportentity.FundChangeNotice;
import com.cj.shichangtong.reportentity.FundOutResult;
import com.cj.shichangtong.reportentity.GROpenAccessResult;
import com.cj.shichangtong.reportentity.ModifyMobile;
import com.cj.shichangtong.sign.SignConfig;
import com.cj.shichangtong.util.BankCasignUtil;
import com.cj.shichangtong.util.InterfaceLogUtil;

/**
 * 回调报文服务
 * 
 * notifyResultService
 * 
 * cody cody 2017年11月9日 下午2:26:04
 * 
 * @version 1.0.0
 *
 */
@org.springframework.stereotype.Service
public class NotifyResultService {

	@Autowired
	private SignConfig signConfig;

	/**
	 * 开户回调 openAccess
	 * 
	 * @param openAccess
	 * @param type
	 *            1、企业会员开户 2、个人会员开户 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void openAccess(String openAccess, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("开户请求完成，报文：" + openAccess);
		GROpenAccessResult grOpenAccessResult = JSON.parseObject(openAccess, GROpenAccessResult.class);
		if (grOpenAccessResult == null || !"000000".equals(grOpenAccessResult.getRespCode())) {
			InterfaceLogUtil.writeError("开户失败，详情请查看日志！");
			throw new Exception("开户失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 绑卡回调 bindCard
	 * 
	 * @param reportString
	 * @param type
	 *            1、企业会员 2、个人会员 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void bindCard(String reportString, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("绑卡请求完成，报文：" + reportString);
		BindCardResult bindCardResult = JSON.parseObject(reportString, BindCardResult.class);
		if (bindCardResult == null || !"000000".equals(bindCardResult.getRespCode())) {
			InterfaceLogUtil.writeError("绑卡失败，详情请查看日志！");
			throw new Exception("绑卡失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 修改密码回调 bindCard
	 * 
	 * @param reportString
	 * @param type
	 *            1、企业会员 2、个人会员 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void modifyPwd(String reportString, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("修改密码请求完成，报文：" + reportString);
		BaseResultReport2 bindCardResult = JSON.parseObject(reportString, BaseResultReport2.class);
		if (bindCardResult == null || !"000000".equals(bindCardResult.getRespCode())) {
			InterfaceLogUtil.writeError("修改密码失败，详情请查看日志！");
			throw new Exception("修改密码失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 重置密码回调 bindCard
	 * 
	 * @param reportString
	 * @param type
	 *            1、企业会员 2、个人会员 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void resetPwd(String reportString, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("重置密码请求完成，报文：" + reportString);
		BaseResultReport2 bindCardResult = JSON.parseObject(reportString, BaseResultReport2.class);
		if (bindCardResult == null || !"000000".equals(bindCardResult.getRespCode())) {
			InterfaceLogUtil.writeError("重置密码失败，详情请查看日志！");
			throw new Exception("重置密码失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 修改手机号码回调 bindCard
	 * 
	 * @param reportString
	 * @param type
	 *            1、企业会员 2、个人会员 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void modyfyMobilePwd(String reportString, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("修改手机号码请求完成，报文：" + reportString);
		ModifyMobile modifyMobile = JSON.parseObject(reportString, ModifyMobile.class);
		if (modifyMobile == null || !"000000".equals(modifyMobile.getRespCode())) {
			InterfaceLogUtil.writeError("修改手机号码失败，详情请查看日志！");
			throw new Exception("修改手机号码失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 银行卡解绑回调
	 * 
	 * @param reportString
	 * 
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void unbundlingCard(String reportString) throws Exception {
		InterfaceLogUtil.writeInfo("银行卡解绑请求完成，报文：" + reportString);
		BaseResultReport2 baseResultReport2 = JSON.parseObject(reportString, BaseResultReport2.class);
		if (baseResultReport2 == null || !"000000".equals(baseResultReport2.getRespCode())) {
			InterfaceLogUtil.writeError("银行卡解绑失败，详情请查看日志！");
			throw new Exception("银行卡解绑失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 资金账户销户
	 * 
	 * @param reportString
	 * @param type
	 *            1、企业会员 2、个人会员 void
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void closeAccess(String reportString, Integer type) throws Exception {
		InterfaceLogUtil.writeInfo("资金账户销户请求完成，报文：" + reportString);
		BaseResultReport2 baseResultReport = JSON.parseObject(reportString, BaseResultReport2.class);
		if (baseResultReport == null || !"000000".equals(baseResultReport.getRespCode())) {
			InterfaceLogUtil.writeError("资金账户销户失败，详情请查看日志！");
			throw new Exception("资金账户销户失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 资金变动提醒
	 * 
	 * @param reportString
	 * 
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public String fundChangeNotice(String reportString) throws Exception {
		InterfaceLogUtil.writeInfo("资金变动提醒完成，报文：" + reportString);
		// 1、反序列化
		FundChangeNotice fundChangeNotice = JSON.parseObject(reportString, FundChangeNotice.class);
		// 2、判断报文是否正常
		if (fundChangeNotice == null) {
			InterfaceLogUtil.writeError("资金变动提醒失败，详情请查看日志！");
			throw new Exception("资金变动提醒失败，详情请查看日志！");
		}
		// 3、验签
		String casign = fundChangeNotice.getCasign();
		fundChangeNotice.setCasign(null);
		String respJson = JSON.toJSONString(fundChangeNotice);
		boolean bool = BankCasignUtil.vertifyForCert(respJson, casign, signConfig.getTruststore0());
		if (!bool) {
			InterfaceLogUtil.writeError("验签失败，报文！" + reportString);
			throw new Exception("验签失败！");
		}

		// 4、返回通知给银行
		net.sf.json.JSONObject jsonObject = new net.sf.json.JSONObject();
		jsonObject.put("respCode", "000000");
		jsonObject.put("respMsg", "交易成功");
		jsonObject.put("serialNo", fundChangeNotice.getSerialNo());
		jsonObject.put("SubAcctNo", fundChangeNotice.getSubAcctNo());
		jsonObject.put("funcionID", fundChangeNotice.getFuncionID());
		jsonObject.put("merNo", fundChangeNotice.getMerNo());
		jsonObject.put("OrderNo", fundChangeNotice.getOrderNo());

		String caSign = BankCasignUtil.getHuiFengSign(jsonObject.toString());
		jsonObject.put("casign", caSign);// 签名字段
		return jsonObject.toString();
		// TODO 数据库相关操作
	}

	/**
	 * 客户提现出金回调
	 * 
	 * @param reportString
	 * 
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public void fundOut(String reportString) throws Exception {
		InterfaceLogUtil.writeInfo("客户提现出金回调请求完成，报文：" + reportString);
		FundOutResult fundOutResult = JSON.parseObject(reportString, FundOutResult.class);
		if (fundOutResult == null || !"000000".equals(fundOutResult.getRespCode())) {
			InterfaceLogUtil.writeError("客户提现出金回调失败，详情请查看日志！");
			throw new Exception("客户提现出金回调失败，详情请查看日志！");
		}
		// TODO 数据库相关操作
	}

	/**
	 * 银行文件生成提醒
	 * 
	 * @param reportString
	 * 
	 * @throws Exception
	 * @exception @since
	 *                1.0.0
	 */
	public String fileGenNotice(String reportString) throws Exception {
		InterfaceLogUtil.writeInfo("银行文件生成完成，请下载，报文：" + reportString);
		// 1、反序列化
		BankFileGenNotice bankFileGenNotice = JSON.parseObject(reportString, BankFileGenNotice.class);
		// 2、判断报文是否正常
		if (bankFileGenNotice == null) {
			InterfaceLogUtil.writeError("银行文件生成通知失败，详情请查看日志！");
			throw new Exception("银行文件生成通知失败，详情请查看日志！");
		}
		// 3、验签
		String casign = bankFileGenNotice.getCasign();
		bankFileGenNotice.setCasign(null);
		String respJson = JSON.toJSONString(bankFileGenNotice);
		boolean bool = BankCasignUtil.vertifyForCert(respJson, casign, signConfig.getTruststore0());
		if (!bool) {
			InterfaceLogUtil.writeError("验签失败，报文！" + reportString);
			throw new Exception("验签失败！");
		}

		// 4、返回通知给银行
		net.sf.json.JSONObject jsonObject = new net.sf.json.JSONObject();
		jsonObject.put("respCode", "000000");
		jsonObject.put("respMsg", "交易成功");
		jsonObject.put("funcionID", bankFileGenNotice.getFuncionID());
		jsonObject.put("merNo", bankFileGenNotice.getMerNo());

		String caSign = BankCasignUtil.getHuiFengSign(jsonObject.toString());
		jsonObject.put("casign", caSign);// 签名字段
		return jsonObject.toString();
		// TODO 数据库相关操作
	}

}
