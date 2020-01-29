package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "product_sub_category")
public class ProductSubCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sub_category_id",columnDefinition = "bigint(20) auto_increment comment '子分类ID'")
    private long subCategoryId;

    @Column(name = "sub_category_name",columnDefinition = "varchar(255) auto_increment comment '子分类名称'")
    private String subCategoryName;

    @Column(name = "sub_category_code",columnDefinition = "varchar(255) auto_increment comment '子分类编号'")
    private String subCategoryCode;

    @Column(name = "modified_time",columnDefinition = "timestamp(255) auto_increment comment '子分类名称'")
    private Timestamp modifiedTime;

    @Column(name = "sub_category_logo",columnDefinition = "varchar(255) auto_increment comment '子分类名称'")
    private String subCategoryLogo;

    public long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryCode() {
        return subCategoryCode;
    }

    public void setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getSubCategoryLogo() {
        return subCategoryLogo;
    }

    public void setSubCategoryLogo(String subCategoryLogo) {
        this.subCategoryLogo = subCategoryLogo;
    }
}
