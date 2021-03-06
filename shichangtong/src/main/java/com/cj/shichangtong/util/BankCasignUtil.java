package com.cj.shichangtong.util;

import com.cj.shichangtong.sign.SignMerchant;
import com.cj.shichangtong.sign.SignSCT;

/**
 * 银行对接签名帮助类
 * 
 * BankCasignUtil
 * 
 * cody cody 2017年11月6日 下午4:01:19
 * 
 * @version 1.0.0
 *
 */
public class BankCasignUtil {

	/**
	 * 
	 * getHuiFengSign(汇丰银行签名)
	 * 
	 * @return String
	 * @exception @since
	 *                1.0.0
	 */
	public static String getHuiFengSign(String signJson) {
		SignMerchant sign = new SignMerchant();
		String string = sign.signMerchant(signJson);
		return string;
	}

	/**
	 * 汇丰银行验签 vertifyForCert
	 * 
	 * @param resp
	 *            报文串（去掉casign字段）
	 * @param caSign
	 *            签名串
	 * @param pub
	 *            公钥地址
	 * @return boolean
	 * @exception @since
	 *                1.0.0
	 */
	public static boolean vertifyForCert(String resp, String caSign, String pub) {
		SignSCT sct = new SignSCT();
		return sct.signSct(resp, caSign, pub);
	}
}
