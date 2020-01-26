package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_addr")
public class CustomerAddress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_addr_id",columnDefinition = "bigint(20) auto_increment comment '客户地址ID'")
    private long customerAddrId;

    @Column(name = "customer_id",columnDefinition = "bigint(20) null comment 'customer_login表的自增ID'")
    private long customerId;

    @Column(name = "zip",columnDefinition = "smallint(6) null comment '邮编'")
    private int zip;

    @Column(name = "province",columnDefinition = "varchar(255) null comment '地区表中省份'")
    private String province;

    @Column(name = "city",columnDefinition = "varchar(255) null comment '地区表中城市'")
    private String city;

    @Column(name = "district",columnDefinition = "varchar(255) null comment '地区表中'")
    private String district;

    @Column(name = "address",columnDefinition = "varchar(255) null comment '具体的地址门牌号'")
    private String address;

    @Column(name = "is_default",columnDefinition = "varchar(255) null comment '具体的地址门牌号'")
    private int is_default;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) null comment '最后修改时间'")
    private Timestamp modified_time;

    public long getCustomerAddrId() {
        return customerAddrId;
    }

    public void setCustomerAddrId(long customerAddrId) {
        this.customerAddrId = customerAddrId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
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

    public int getIs_default() {
        return is_default;
    }

    public void setIs_default(int is_default) {
        this.is_default = is_default;
    }

    public Timestamp getModified_time() {
        return modified_time;
    }

    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }
}
