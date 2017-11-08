package com.cj.shichangtong.sign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 证书、验签及相关配置信息获取
 * 
 * SignConfig
 * 
 * cody cody 2017年11月7日 下午6:05:49
 * 
 * @version 1.0.0
 *
 */
@Configuration
@PropertySource("netsign.properties")
public class SignConfig {

	@Value("${passwordpfx0}")
	private String passwordpfx0;
	@Value("${pfxdirpath}")
	private String pfxdirpath;// 证书路径
	@Value("${truststore0}")
	private String truststore0;// 公钥地址
	@Value("${pfx0}")
	private String pfx0;// 私钥名称
	@Value("${enccert}")
	private String enccert;// 数字信封加密证书路径
	@Value("${crldir0}")
	private String crldir0;// crl存放目录

	public String getPasswordpfx0() {
		return passwordpfx0;
	}

	public void setPasswordpfx0(String passwordpfx0) {
		this.passwordpfx0 = passwordpfx0;
	}

	public String getPfxdirpath() {
		return pfxdirpath;
	}

	public void setPfxdirpath(String pfxdirpath) {
		this.pfxdirpath = pfxdirpath;
	}

	public String getTruststore0() {
		return truststore0;
	}

	public void setTruststore0(String truststore0) {
		this.truststore0 = truststore0;
	}

	public String getPfx0() {
		return pfx0;
	}

	public void setPfx0(String pfx0) {
		this.pfx0 = pfx0;
	}

	public String getEnccert() {
		return enccert;
	}

	public void setEnccert(String enccert) {
		this.enccert = enccert;
	}

	public String getCrldir0() {
		return crldir0;
	}

	public void setCrldir0(String crldir0) {
		this.crldir0 = crldir0;
	}
}
