package com.cj.shichangtong.sign;

import java.io.UnsupportedEncodingException;

import com.infosec.NetSignServer;

/**
 * 
 * 商户加签-市场通验签 SignMerchant
 * 
 * cody cody 2017年11月7日 下午3:08:30
 * 
 * @version 1.0.0
 *
 */
public class SignMerchant {

	/**
	 * 商户加签-市场通验签
	 * 
	 * @param signText
	 *            JSON串
	 * @return String 签名后串
	 * @exception @since
	 *                1.0.0
	 */
	public String signMerchant(String signText) {
		try {
			// 签名
			byte[] ret = sign(signText);
			String signStr = new String(ret);
			return signStr;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 签名 sign
	 * 
	 * @param signature
	 * @return
	 * @throws UnsupportedEncodingException
	 *             byte[]
	 * @exception @since
	 *                1.0.0
	 */
	private static byte[] sign(String signature) throws UnsupportedEncodingException {
		String s64code = "";
		NetSignServer ns = new NetSignServer();// 初始化NetSignServer
		String Dnstr = new String(ns.getDefaultSignerDN().getBytes("utf-8"), "utf-8");
		// System.out.println("***********************DN=" + Dnstr);
		ns.NSSetPlainText(signature.getBytes("utf-8"));// 设置明文信息
		byte[] s64codbyte = ns.NSAttachedSign(Dnstr);// 加签
		int ret = ns.getLastErrnum();
		if (ret == 0) {
			s64code = new String(s64codbyte);
		}
		return s64codbyte;
	}

}
