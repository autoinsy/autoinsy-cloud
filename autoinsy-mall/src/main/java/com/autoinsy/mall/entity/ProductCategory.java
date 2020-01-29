package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "product_category")
public class ProductCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id",columnDefinition = "bigint(20) auto_increment comment '分类ID'")
    private long categoryId;

    @Column(name = "category_name", columnDefinition = "varchar(255) auto_increment comment '分类名称'")
    private String categoryName;

    @Column(name = "category_code", columnDefinition = "varchar(255) auto_increment comment '分类编码'")
    private String categoryCode;

    @Column(name = "parent_id", columnDefinition = "bigint(20) auto_increment comment '父分类ID'")
    private long parentId;

    @Column(name = "category_level", columnDefinition = "int(4) auto_increment comment '分类层级'")
    private int categoryLevel;

    @Column(name = "category_status", columnDefinition = "int(4) auto_increment comment '分类状态'")
    private int categoryStatus;

    @Column(name = "modified_time", columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    @Column(name = "category_logo", columnDefinition = "varchar(255) auto_increment comment '分类logo'")
    private String categoryLogo;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public int getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(int categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public int getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(int categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCategoryLogo() {
        return categoryLogo;
    }

    public void setCategoryLogo(String categoryLogo) {
        this.categoryLogo = categoryLogo;
    }
}
