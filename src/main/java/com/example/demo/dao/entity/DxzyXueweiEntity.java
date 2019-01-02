package com.example.demo.dao.entity;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 大象中医-穴位(DXZY_XUEWEI)
 * 
 * @author yaochao
 * @version 1.0.0 2018-12-20
 */
@Entity
@Table(name = "DXZY_XUEWEI")
public class DxzyXueweiEntity {
    /** 版本号 */
    private static final long serialVersionUID = 8011388060323525461L;

    /** 主键，自增id */
    @Id
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** 穴位名称 */
    @Column(name = "NAME", nullable = false, length = 80)
    private String name;

    /** 拼音 */
    @Column(name = "PINYIN", nullable = false, length = 80)
    private String pinyin;

    /** 国际编码 */
    @Column(name = "GUOJIBIANMA", nullable = false, length = 80)
    private String guojibianma;

    /** 图片url */
    @Column(name = "IMG_URL", nullable = false, length = 500)
    private String imgUrl;

    /** 所属经络 */
    @Column(name = "SUSHUOJINGLUO", nullable = false, length = 80)
    private String sushuojingluo;

    /** 所属经络关联id */
    @Column(name = "JINGLUOID", nullable = false, length = 10)
    private Integer jingluoid;

    /** 特定穴 */
    @Column(name = "TEDINGXUE", nullable = false, length = 80)
    private String tedingxue;

    /** 功效 */
    @Column(name = "GONGXIAO", nullable = false, length = 500)
    private String gongxiao;

    /** 主治 */
    @Column(name = "ZHUZHI", nullable = false, length = 500)
    private String zhuzhi;

    /** 取穴-取穴方法 */
    @Column(name = "QUXUE1", nullable = false, length = 500)
    private String quxue1;

    /** 取穴-简便取穴法 */
    @Column(name = "QUXUE2", nullable = false, length = 500)
    private String quxue2;

    /** 解剖图片url */
    @Column(name = "JIEPOU_IMG_URL", nullable = false, length = 500)
    private String jiepouImgUrl;

    /** 解剖说明 */
    @Column(name = "JIEPOU_INFO", nullable = false, length = 500)
    private String jiepouInfo;

    /** 穴位配伍 */
    @Column(name = "XUEWEIPEIWU", nullable = false, length = 500)
    private String xueweipeiwu;

    /** 针刺方法 */
    @Column(name = "ZHENCIFANGFA", nullable = false, length = 500)
    private String zhencifangfa;

    /** 按压方式 */
    @Column(name = "ANYAFANGSHI", nullable = false, length = 500)
    private String anyafangshi;

    /** 创建时间戳 */
    @Column(name = "CREATED_AT", nullable = false, length = 26)
    private Timestamp createdAt;

    /** 更新时间戳 */
    @Column(name = "UPDATED_AT", nullable = false, length = 26)
    private Timestamp updatedAt;

    /**
     * 获取主键，自增id
     * 
     * @return 主键
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置主键，自增id
     * 
     * @param id
     *          主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取穴位名称
     * 
     * @return 穴位名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置穴位名称
     * 
     * @param name
     *          穴位名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取拼音
     * 
     * @return 拼音
     */
    public String getPinyin() {
        return this.pinyin;
    }

    /**
     * 设置拼音
     * 
     * @param pinyin
     *          拼音
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * 获取国际编码
     * 
     * @return 国际编码
     */
    public String getGuojibianma() {
        return this.guojibianma;
    }

    /**
     * 设置国际编码
     * 
     * @param guojibianma
     *          国际编码
     */
    public void setGuojibianma(String guojibianma) {
        this.guojibianma = guojibianma;
    }

    /**
     * 获取图片url
     * 
     * @return 图片url
     */
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * 设置图片url
     * 
     * @param imgUrl
     *          图片url
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取所属经络
     * 
     * @return 所属经络
     */
    public String getSushuojingluo() {
        return this.sushuojingluo;
    }

    /**
     * 设置所属经络
     * 
     * @param sushuojingluo
     *          所属经络
     */
    public void setSushuojingluo(String sushuojingluo) {
        this.sushuojingluo = sushuojingluo;
    }

    /**
     * 获取所属经络关联id
     * 
     * @return 所属经络关联id
     */
    public Integer getJingluoid() {
        return this.jingluoid;
    }

    /**
     * 设置所属经络关联id
     * 
     * @param jingluoid
     *          所属经络关联id
     */
    public void setJingluoid(Integer jingluoid) {
        this.jingluoid = jingluoid;
    }

    /**
     * 获取特定穴
     * 
     * @return 特定穴
     */
    public String getTedingxue() {
        return this.tedingxue;
    }

    /**
     * 设置特定穴
     * 
     * @param tedingxue
     *          特定穴
     */
    public void setTedingxue(String tedingxue) {
        this.tedingxue = tedingxue;
    }

    /**
     * 获取功效
     * 
     * @return 功效
     */
    public String getGongxiao() {
        return this.gongxiao;
    }

    /**
     * 设置功效
     * 
     * @param gongxiao
     *          功效
     */
    public void setGongxiao(String gongxiao) {
        this.gongxiao = gongxiao;
    }

    /**
     * 获取主治
     * 
     * @return 主治
     */
    public String getZhuzhi() {
        return this.zhuzhi;
    }

    /**
     * 设置主治
     * 
     * @param zhuzhi
     *          主治
     */
    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi;
    }

    /**
     * 获取取穴-取穴方法
     * 
     * @return 取穴-取穴方法
     */
    public String getQuxue1() {
        return this.quxue1;
    }

    /**
     * 设置取穴-取穴方法
     * 
     * @param quxue1
     *          取穴-取穴方法
     */
    public void setQuxue1(String quxue1) {
        this.quxue1 = quxue1;
    }

    /**
     * 获取取穴-简便取穴法
     * 
     * @return 取穴-简便取穴法
     */
    public String getQuxue2() {
        return this.quxue2;
    }

    /**
     * 设置取穴-简便取穴法
     * 
     * @param quxue2
     *          取穴-简便取穴法
     */
    public void setQuxue2(String quxue2) {
        this.quxue2 = quxue2;
    }

    /**
     * 获取解剖图片url
     * 
     * @return 解剖图片url
     */
    public String getJiepouImgUrl() {
        return this.jiepouImgUrl;
    }

    /**
     * 设置解剖图片url
     * 
     * @param jiepouImgUrl
     *          解剖图片url
     */
    public void setJiepouImgUrl(String jiepouImgUrl) {
        this.jiepouImgUrl = jiepouImgUrl;
    }

    /**
     * 获取解剖说明
     * 
     * @return 解剖说明
     */
    public String getJiepouInfo() {
        return this.jiepouInfo;
    }

    /**
     * 设置解剖说明
     * 
     * @param jiepouInfo
     *          解剖说明
     */
    public void setJiepouInfo(String jiepouInfo) {
        this.jiepouInfo = jiepouInfo;
    }

    /**
     * 获取穴位配伍
     * 
     * @return 穴位配伍
     */
    public String getXueweipeiwu() {
        return this.xueweipeiwu;
    }

    /**
     * 设置穴位配伍
     * 
     * @param xueweipeiwu
     *          穴位配伍
     */
    public void setXueweipeiwu(String xueweipeiwu) {
        this.xueweipeiwu = xueweipeiwu;
    }

    /**
     * 获取针刺方法
     * 
     * @return 针刺方法
     */
    public String getZhencifangfa() {
        return this.zhencifangfa;
    }

    /**
     * 设置针刺方法
     * 
     * @param zhencifangfa
     *          针刺方法
     */
    public void setZhencifangfa(String zhencifangfa) {
        this.zhencifangfa = zhencifangfa;
    }

    /**
     * 获取按压方式
     * 
     * @return 按压方式
     */
    public String getAnyafangshi() {
        return this.anyafangshi;
    }

    /**
     * 设置按压方式
     * 
     * @param anyafangshi
     *          按压方式
     */
    public void setAnyafangshi(String anyafangshi) {
        this.anyafangshi = anyafangshi;
    }

    /**
     * 获取创建时间戳
     * 
     * @return 创建时间戳
     */
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    /**
     * 设置创建时间戳
     * 
     * @param createdAt
     *          创建时间戳
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取更新时间戳
     * 
     * @return 更新时间戳
     */
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * 设置更新时间戳
     * 
     * @param updatedAt
     *          更新时间戳
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}