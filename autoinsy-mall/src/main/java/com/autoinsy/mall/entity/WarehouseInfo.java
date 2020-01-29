package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "warehouse_info")
public class WarehouseInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "w_id",columnDefinition = "bigint(20) auto_increment comment '仓库ID'")
    private long wId;

    @Column(name = "warehouse_sn", columnDefinition = "varchar(5) auto_increment comment '仓库编码'")
    private String warehouseSn;

    @Column(name = "warehouse_name", columnDefinition = "varchar(10) auto_increment comment '仓库名称'")
    private String warehouseName;

    @Column(name = "warehouse_phone", columnDefinition = "varchar(20) auto_increment comment '仓库电话'")
    private String warehousePhone;

    @Column(name = "contact", columnDefinition = "varchar(10) auto_increment comment '仓库联系人'")
    private String contact;

    @Column(name = "province", columnDefinition = "varchar(6) auto_increment comment '省'")
    private String province;

    @Column(name = "city", columnDefinition = "varchar(6) auto_increment comment '市'")
    private String city;

    @Column(name = "district", columnDefinition = "varchar(6) auto_increment comment '区'")
    private String district;

    @Column(name = "address", columnDefinition = "varchar(20) auto_increment comment '仓库地址'")
    private String address;

    @Column(name = "warehouse_status", columnDefinition = "int(4) auto_increment comment '仓库状态：0禁用，1启用'")
    private int warehouseStatus;

    @Column(name = "modified_time", columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getwId() {
        return wId;
    }

    public void setwId(long wId) {
        this.wId = wId;
    }

    public String getWarehouseSn() {
        return warehouseSn;
    }

    public void setWarehouseSn(String warehouseSn) {
        this.warehouseSn = warehouseSn;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehousePhone() {
        return warehousePhone;
    }

    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWarehouseStatus() {
        return warehouseStatus;
    }

    public void setWarehouseStatus(int warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
