package com.cj.shichangtong.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("config/serviceUrl.properties")
public class ServiceUrl {

	@Value("${merNo-${spring.profiles.active}}")
	private String merNo;

	@Value("${SHYJFYJZ-${spring.profiles.active}}")
	private String SHYJFYJZ;

	// 客户发起企业会员资金账号开户
	@Value("${KHFQQYHYZJZHKH-${spring.profiles.active}}")
	private String KHFQQYHYZJZHKH;

	// 客户发起个人会员资金账号开户
	@Value("${KHFQGRHYZJZHKH-${spring.profiles.active}}")
	private String KHFQGRHYZJZHKH;

	// 银行卡相关
	@Value("${YHKXG-${spring.profiles.active}}")
	private String YHKXG;

	// 客户发起企业会员资金账号开户
	@Value("${DGKH-${spring.profiles.active}}")
	private String DGKH;

	// 客户发起企业银行卡绑定
	@Value("${DGBD-${spring.profiles.active}}")
	private String DGBD;

	// 客户发起个人会员资金账号开户
	@Value("${DSKH-${spring.profiles.active}}")
	private String DSKH;

	// 客户发起个人银行卡绑定
	@Value("${DSBD-${spring.profiles.active}}")
	private String DSBD;

	// 客户发起企业资金账户交易密码修改
	@Value("${QYMMXG-${spring.profiles.active}}")
	private String QYMMXG;

	// 客户发起个人资金账户交易密码修改
	@Value("${GRMMXG-${spring.profiles.active}}")
	private String GRMMXG;

	// 客户资金账户提现出金
	@Value("${TXCJ-${spring.profiles.active}}")
	private String TXCJ;

	// 客户发起个人资金账户交易密码修改
	@Value("${RZDZ-${spring.profiles.active}}")
	private String RZDZ;

	// 商户文件生成提醒
	@Value("${WJSCTZ-${spring.profiles.active}}")
	private String WJSCTZ;

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

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

	public String getDGKH() {
		return DGKH;
	}

	public void setDGKH(String dGKH) {
		DGKH = dGKH;
	}

	public String getDGBD() {
		return DGBD;
	}

	public void setDGBD(String dGBD) {
		DGBD = dGBD;
	}

	public String getDSKH() {
		return DSKH;
	}

	public void setDSKH(String dSKH) {
		DSKH = dSKH;
	}

	public String getDSBD() {
		return DSBD;
	}

	public void setDSBD(String dSBD) {
		DSBD = dSBD;
	}

	public String getQYMMXG() {
		return QYMMXG;
	}

	public void setQYMMXG(String qYMMXG) {
		QYMMXG = qYMMXG;
	}

	public String getGRMMXG() {
		return GRMMXG;
	}

	public void setGRMMXG(String gRMMXG) {
		GRMMXG = gRMMXG;
	}

	public String getTXCJ() {
		return TXCJ;
	}

	public void setTXCJ(String tXCJ) {
		TXCJ = tXCJ;
	}

	public String getRZDZ() {
		return RZDZ;
	}

	public void setRZDZ(String rZDZ) {
		RZDZ = rZDZ;
	}

	public String getWJSCTZ() {
		return WJSCTZ;
	}

	public void setWJSCTZ(String wJSCTZ) {
		WJSCTZ = wJSCTZ;
	}

	@Override
	public String toString() {
		return "ServiceUrl [merNo=" + merNo + ", SHYJFYJZ=" + SHYJFYJZ + ", KHFQQYHYZJZHKH=" + KHFQQYHYZJZHKH
				+ ", KHFQGRHYZJZHKH=" + KHFQGRHYZJZHKH + ", YHKXG=" + YHKXG + ", DGKH=" + DGKH + ", DGBD=" + DGBD
				+ ", DSKH=" + DSKH + ", DSBD=" + DSBD + ", QYMMXG=" + QYMMXG + ", GRMMXG=" + GRMMXG + ", TXCJ=" + TXCJ
				+ ", RZDZ=" + RZDZ + ", WJSCTZ=" + WJSCTZ + "]";
	}

}
