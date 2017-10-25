package com.cj.shichangtong.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("config/serviceUrl.properties")
public class ServiceUrl {

	@Value("${SHYJFYJZ-${spring.profiles.active}}")
	private String SHYJFYJZ;

	//客户发起企业会员资金账号开户
	@Value("${KHFQQYHYZJZHKH-${spring.profiles.active}}")
	private String KHFQQYHYZJZHKH;

	//客户发起个人会员资金账号开户
	@Value("${KHFQGRHYZJZHKH-${spring.profiles.active}}")
	private String KHFQGRHYZJZHKH;

	//银行卡相关
	@Value("${YHKXG-${spring.profiles.active}}")
	private String YHKXG;

	public String getSHYJFYJZ() {
		return SHYJFYJZ;
	}

	public void setSHYJFYJZ(String sHYJFYJZ) {
		SHYJFYJZ = sHYJFYJZ;
	}

	public String getKHFQQYHYZJZHKH() {
		return KHFQQYHYZJZHKH;
	}

	public void setKHFQQYHYZJZHKH(String kHFQQYHYZJZHKH) {
		KHFQQYHYZJZHKH = kHFQQYHYZJZHKH;
	}

	public String getKHFQGRHYZJZHKH() {
		return KHFQGRHYZJZHKH;
	}

	public void setKHFQGRHYZJZHKH(String kHFQGRHYZJZHKH) {
		KHFQGRHYZJZHKH = kHFQGRHYZJZHKH;
	}

	public String getYHKXG() {
		return YHKXG;
	}

	public void setYHKXG(String yHKXG) {
		YHKXG = yHKXG;
	}
	
	
}
