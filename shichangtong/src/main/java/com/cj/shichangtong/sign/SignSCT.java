package com.cj.shichangtong.sign;

import com.cj.shichangtong.util.InterfaceLogUtil;
import com.hundsun.epay.util.SignAndVerify;

/**
 * 
 * 市场通加签 商户验签 SignSCT
 * 
 * cody 2017年11月7日 下午3:53:49
 * 
 * @version 1.0.0
 *
 */
public class SignSCT {
	/**
	 * 
	 * signSct 市场通加签 商户验签
	 * 
	 * @param resp
	 *            JSON串
	 * @param caSign
	 *            签名串
	 * @param pub
	 *            公钥地址
	 * @param pwd
	 *            证书密码
	 * @return boolean 签名结果
	 * @exception @since
	 *                1.0.0
	 */
	public boolean signSct(String resp, String caSign, String pub) {
		try {
			/* 获取私钥证书地址 */
			/* 获取私钥证书密码 */
			// String sign = SignAndVerify.sign(respJson, privateCertPath, pwd);
			// System.out.println(sign);
			boolean bool = SignAndVerify.vertifyForCert(resp, caSign, pub);
			return bool;

		} catch (Exception e) {
			InterfaceLogUtil.writeError("验签失败：" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
}
