package com.cj.shichangtong.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_validation")
public class TestValidation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 浮点数字
     */
    private Double num;

    /**
     * 整数
     */
    private Integer num2;

    /**
     * 字符串
     */
    private String str;

    /**
     * 邮件
     */
    private String email;

    /**
     * 网址
     */
    private String url;

    /**
     * 日期
     */
    @Column(name = "new_date")
    private Date newDate;

    /**
     * 备注信息
     */
    private String remarks;

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
     * 获取浮点数字
     *
     * @return num - 浮点数字
     */
    public Double getNum() {
        return num;
    }

    /**
     * 设置浮点数字
     *
     * @param num 浮点数字
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * 获取整数
     *
     * @return num2 - 整数
     */
    public Integer getNum2() {
        return num2;
    }

    /**
     * 设置整数
     *
     * @param num2 整数
     */
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    /**
     * 获取字符串
     *
     * @return str - 字符串
     */
    public String getStr() {
        return str;
    }

    /**
     * 设置字符串
     *
     * @param str 字符串
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     * 获取邮件
     *
     * @return email - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取网址
     *
     * @return url - 网址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置网址
     *
     * @param url 网址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取日期
     *
     * @return new_date - 日期
     */
    public Date getNewDate() {
        return newDate;
    }

    /**
     * 设置日期
     *
     * @param newDate 日期
     */
    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}