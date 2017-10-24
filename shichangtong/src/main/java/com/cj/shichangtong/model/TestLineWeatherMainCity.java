package com.cj.shichangtong.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test_line_weather_main_city")
public class TestLineWeatherMainCity {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 日期
     */
    private Date datestr;

    /**
     * 北京最高气温
     */
    @Column(name = "beijing_maxtemp")
    private Double beijingMaxtemp;

    /**
     * 北京最低气温
     */
    @Column(name = "beijing_mintemp")
    private Double beijingMintemp;

    /**
     * 长春最高气温
     */
    @Column(name = "changchun_maxtemp")
    private Double changchunMaxtemp;

    /**
     * 长春最低气温
     */
    @Column(name = "changchun_mintemp")
    private Double changchunMintemp;

    /**
     * 沈阳最高气温
     */
    @Column(name = "shenyang_maxtemp")
    private Double shenyangMaxtemp;

    /**
     * 沈阳最低气温
     */
    @Column(name = "shenyang_mintemp")
    private Double shenyangMintemp;

    /**
     * 哈尔滨最高气温
     */
    @Column(name = "haerbin_maxtemp")
    private Double haerbinMaxtemp;

    /**
     * 哈尔滨最低气温
     */
    @Column(name = "haerbin_mintemp")
    private Double haerbinMintemp;

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
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    /**
     * 获取逻辑删除标记（0：显示；1：隐藏）
     *
     * @return del_flag - 逻辑删除标记（0：显示；1：隐藏）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置逻辑删除标记（0：显示；1：隐藏）
     *
     * @param delFlag 逻辑删除标记（0：显示；1：隐藏）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取日期
     *
     * @return datestr - 日期
     */
    public Date getDatestr() {
        return datestr;
    }

    /**
     * 设置日期
     *
     * @param datestr 日期
     */
    public void setDatestr(Date datestr) {
        this.datestr = datestr;
    }

    /**
     * 获取北京最高气温
     *
     * @return beijing_maxtemp - 北京最高气温
     */
    public Double getBeijingMaxtemp() {
        return beijingMaxtemp;
    }

    /**
     * 设置北京最高气温
     *
     * @param beijingMaxtemp 北京最高气温
     */
    public void setBeijingMaxtemp(Double beijingMaxtemp) {
        this.beijingMaxtemp = beijingMaxtemp;
    }

    /**
     * 获取北京最低气温
     *
     * @return beijing_mintemp - 北京最低气温
     */
    public Double getBeijingMintemp() {
        return beijingMintemp;
    }

    /**
     * 设置北京最低气温
     *
     * @param beijingMintemp 北京最低气温
     */
    public void setBeijingMintemp(Double beijingMintemp) {
        this.beijingMintemp = beijingMintemp;
    }

    /**
     * 获取长春最高气温
     *
     * @return changchun_maxtemp - 长春最高气温
     */
    public Double getChangchunMaxtemp() {
        return changchunMaxtemp;
    }

    /**
     * 设置长春最高气温
     *
     * @param changchunMaxtemp 长春最高气温
     */
    public void setChangchunMaxtemp(Double changchunMaxtemp) {
        this.changchunMaxtemp = changchunMaxtemp;
    }

    /**
     * 获取长春最低气温
     *
     * @return changchun_mintemp - 长春最低气温
     */
    public Double getChangchunMintemp() {
        return changchunMintemp;
    }

    /**
     * 设置长春最低气温
     *
     * @param changchunMintemp 长春最低气温
     */
    public void setChangchunMintemp(Double changchunMintemp) {
        this.changchunMintemp = changchunMintemp;
    }

    /**
     * 获取沈阳最高气温
     *
     * @return shenyang_maxtemp - 沈阳最高气温
     */
    public Double getShenyangMaxtemp() {
        return shenyangMaxtemp;
    }

    /**
     * 设置沈阳最高气温
     *
     * @param shenyangMaxtemp 沈阳最高气温
     */
    public void setShenyangMaxtemp(Double shenyangMaxtemp) {
        this.shenyangMaxtemp = shenyangMaxtemp;
    }

    /**
     * 获取沈阳最低气温
     *
     * @return shenyang_mintemp - 沈阳最低气温
     */
    public Double getShenyangMintemp() {
        return shenyangMintemp;
    }

    /**
     * 设置沈阳最低气温
     *
     * @param shenyangMintemp 沈阳最低气温
     */
    public void setShenyangMintemp(Double shenyangMintemp) {
        this.shenyangMintemp = shenyangMintemp;
    }

    /**
     * 获取哈尔滨最高气温
     *
     * @return haerbin_maxtemp - 哈尔滨最高气温
     */
    public Double getHaerbinMaxtemp() {
        return haerbinMaxtemp;
    }

    /**
     * 设置哈尔滨最高气温
     *
     * @param haerbinMaxtemp 哈尔滨最高气温
     */
    public void setHaerbinMaxtemp(Double haerbinMaxtemp) {
        this.haerbinMaxtemp = haerbinMaxtemp;
    }

    /**
     * 获取哈尔滨最低气温
     *
     * @return haerbin_mintemp - 哈尔滨最低气温
     */
    public Double getHaerbinMintemp() {
        return haerbinMintemp;
    }

    /**
     * 设置哈尔滨最低气温
     *
     * @param haerbinMintemp 哈尔滨最低气温
     */
    public void setHaerbinMintemp(Double haerbinMintemp) {
        this.haerbinMintemp = haerbinMintemp;
    }
}