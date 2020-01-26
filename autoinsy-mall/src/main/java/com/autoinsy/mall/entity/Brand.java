package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "brand_info")
public class Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id",columnDefinition = "bigint(20) auto_increment comment '品牌Id'")
    private long brandId;

    @Column(name = "brand_name",columnDefinition = "varchar(255) null comment '品牌名称'")
    private String brandName;

    @Column(name = "telephone",columnDefinition = "varchar(255) null comment '联系电话'")
    private String telephone;

    @Column(name = "brand_web",columnDefinition = "varchar(255) null comment '品牌网络'")
    private String brand_web;

    @Column(name = "brand_logo",columnDefinition = "varchar(255) null comment '品牌logo URL'")
    private String brand_logo;

    @Column(name = "brand_desc",columnDefinition = "varchar(255) null comment '品牌描述'")
    private String brand_desc;

    @Column(name = "brand_status",columnDefinition = "tinyint(4) null comment '品牌状态,0禁用,1启用'")
    private int brand_status;

    @Column(name = "brand_order",columnDefinition = "tinyint(4) null comment '排序'")
    private int brand_order;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) null comment '最后修改时间'")
    private Timestamp modified_time;

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBrand_web() {
        return brand_web;
    }

    public void setBrand_web(String brand_web) {
        this.brand_web = brand_web;
    }

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public String getBrand_desc() {
        return brand_desc;
    }

    public void setBrand_desc(String brand_desc) {
        this.brand_desc = brand_desc;
    }

    public int getBrand_status() {
        return brand_status;
    }

    public void setBrand_status(int brand_status) {
        this.brand_status = brand_status;
    }

    public int getBrand_order() {
        return brand_order;
    }

    public void setBrand_order(int brand_order) {
        this.brand_order = brand_order;
    }

    public Timestamp getModified_time() {
        return modified_time;
    }

    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }
}
