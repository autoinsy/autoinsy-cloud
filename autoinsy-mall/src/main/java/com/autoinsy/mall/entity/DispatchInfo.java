package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "dispatch_info")
public class DispatchInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dispatch_id",columnDefinition = "bigint(20) auto_increment comment '主键ID'")
    private long dispatchId;

    @Column(name = "dispatch_name",columnDefinition = "varchar(20) auto_increment comment '物流公司名称'")
    private String dispatchName;

    @Column(name = "dispatch_contact",columnDefinition = "varchar(20) auto_increment comment '物流公司联系人'")
    private String dispatchContact;

    @Column(name = "telephone",columnDefinition = "varchar(20) auto_increment comment '物流公司联系电话'")
    private String telephone;

    @Column(name = "price",columnDefinition = "decimal(20) auto_increment comment '配送价格'")
    private BigDecimal price;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(long dispatchId) {
        this.dispatchId = dispatchId;
    }

    public String getDispatchName() {
        return dispatchName;
    }

    public void setDispatchName(String dispatchName) {
        this.dispatchName = dispatchName;
    }

    public String getDispatchContact() {
        return dispatchContact;
    }

    public void setDispatchContact(String dispatchContact) {
        this.dispatchContact = dispatchContact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
