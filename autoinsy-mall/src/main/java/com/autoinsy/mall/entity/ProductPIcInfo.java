package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "product_pic_info")
public class ProductPIcInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_pic_id",columnDefinition = "bigint(20) auto_increment comment '商品图片ID'")
    private long productPicId;

    @Column(name = "product_id",columnDefinition = "bigint(20) auto_increment comment '商品ID'")
    private long productId;

    @Column(name = "pic_desc",columnDefinition = "varchar(255) auto_increment comment '图片描述'")
    private String picDesc;

    @Column(name = "pic_url",columnDefinition = "varchar(255) auto_increment comment '图片URL'")
    private String picUrl;

    @Column(name = "is_master",columnDefinition = "int(4) auto_increment comment '是否主图：0.非主图1.主图'")
    private int isMaster;

    @Column(name = "pic_order",columnDefinition = "int(4) auto_increment comment '图片排序'")
    private int picOrder;

    @Column(name = "pic_status",columnDefinition = "int(4) auto_increment comment '图片是否有效：0无效 1有效'")
    private int picStatus;

    @Column(name = "modified_time",columnDefinition = "timestamp(00) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getProductPicId() {
        return productPicId;
    }

    public void setProductPicId(long productPicId) {
        this.productPicId = productPicId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(int isMaster) {
        this.isMaster = isMaster;
    }

    public int getPicOrder() {
        return picOrder;
    }

    public void setPicOrder(int picOrder) {
        this.picOrder = picOrder;
    }

    public int getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(int picStatus) {
        this.picStatus = picStatus;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
