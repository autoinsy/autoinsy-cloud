package com.autoinsy.mall.entity;

import org.bouncycastle.util.Times;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "supplier_info")
public class SupplierInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id",columnDefinition = "bigint(20) auto_increment comment '供应商ID'")
    private long supplierId;

    @Column(name = "supplier_code", columnDefinition = "varchar(8) auto_increment comment '供应商编码'")
    private String supplierCode;

    @Column(name = "supplier_name", columnDefinition = "varchar(50) auto_increment comment '供应商名称'")
    private String supplierName;

    @Column(name = "supplier_type", columnDefinition = "int(4) auto_increment comment '供应商类型：1.自营，2.平台'")
    private int supplierType;

    @Column(name = "link_man", columnDefinition = "varchar(10) auto_increment comment '供应商联系人'")
    private String linkMan;

    @Column(name = "phone_number", columnDefinition = "varchar(50) auto_increment comment '联系电话'")
    private String phoneNumber;

    @Column(name = "bank_name", columnDefinition = "varchar(50) auto_increment comment '供应商开户银行名称'")
    private String bankName;

    @Column(name = "bank_account", columnDefinition = "varchar(255) auto_increment comment '银行账号'")
    private String bankAccount;

    @Column(name = "address", columnDefinition = "varchar(255) auto_increment comment '供应商地址'")
    private String address;

    @Column(name = "supplier_status", columnDefinition = "int(4) auto_increment comment '状态：0禁止，1启用'")
    private int supplierStatus;

    @Column(name = "modified_time", columnDefinition = "varchar(255) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(int supplierType) {
        this.supplierType = supplierType;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(int supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
