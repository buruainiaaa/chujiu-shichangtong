package com.cj.shichangtong.model;

import javax.persistence.*;

public class Systemconfig {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 邮箱服务器地址
     */
    private String smtp;

    /**
     * 邮箱服务器端口
     */
    private String port;

    /**
     * 系统邮箱地址
     */
    private String mailname;

    /**
     * 系统邮箱密码
     */
    private String mailpassword;

    /**
     * 短信用户名
     */
    private String smsname;

    /**
     * 短信密码
     */
    private String smspassword;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取邮箱服务器地址
     *
     * @return smtp - 邮箱服务器地址
     */
    public String getSmtp() {
        return smtp;
    }

    /**
     * 设置邮箱服务器地址
     *
     * @param smtp 邮箱服务器地址
     */
    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    /**
     * 获取邮箱服务器端口
     *
     * @return port - 邮箱服务器端口
     */
    public String getPort() {
        return port;
    }

    /**
     * 设置邮箱服务器端口
     *
     * @param port 邮箱服务器端口
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 获取系统邮箱地址
     *
     * @return mailname - 系统邮箱地址
     */
    public String getMailname() {
        return mailname;
    }

    /**
     * 设置系统邮箱地址
     *
     * @param mailname 系统邮箱地址
     */
    public void setMailname(String mailname) {
        this.mailname = mailname;
    }

    /**
     * 获取系统邮箱密码
     *
     * @return mailpassword - 系统邮箱密码
     */
    public String getMailpassword() {
        return mailpassword;
    }

    /**
     * 设置系统邮箱密码
     *
     * @param mailpassword 系统邮箱密码
     */
    public void setMailpassword(String mailpassword) {
        this.mailpassword = mailpassword;
    }

    /**
     * 获取短信用户名
     *
     * @return smsname - 短信用户名
     */
    public String getSmsname() {
        return smsname;
    }

    /**
     * 设置短信用户名
     *
     * @param smsname 短信用户名
     */
    public void setSmsname(String smsname) {
        this.smsname = smsname;
    }

    /**
     * 获取短信密码
     *
     * @return smspassword - 短信密码
     */
    public String getSmspassword() {
        return smspassword;
    }

    /**
     * 设置短信密码
     *
     * @param smspassword 短信密码
     */
    public void setSmspassword(String smspassword) {
        this.smspassword = smspassword;
    }
}