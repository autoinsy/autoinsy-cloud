package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Table
@Entity(name = "customer_info")
public class CustomerInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_info_id",columnDefinition = "bigint(20) auto_increment comment '自增主键ID'")
    private long customerInfoId;

    @Column(name = "customer_id",columnDefinition = "bigint(20) null comment 'customer_login表的自增ID'")
    private long customerId;

    @Column(name = "customer_name",columnDefinition = "varchar(255) null comment '用户真实姓名'")
    private String customerName;

    @Column(name = "identity_card_type",columnDefinition = "tinyint(4) null comment '证件类型：1 身份证，2 军官证，3 护照'")
    private int identityCardType;

    @Column(name = "identity_card_no",columnDefinition = "varchar(255) null comment '证件号码'")
    private String identityCardNo;

    @Column(name = "mobile_phone",columnDefinition = "int(255) null comment '手机号'")
    private int mobilePhone;

    @Column(name = "customer_email",columnDefinition = "varchar(255) null comment '邮箱'")
    private String customerEmail;

    @Column(name = "gender",columnDefinition = "varchar(1) null comment '性别'")
    private String gender;

    @Column(name = "user_point",columnDefinition = "int(11) null comment '用户积分'")
    private int user_point;

    @Column(name = "register_time",columnDefinition = "timestamp(0) null comment '注册时间'")
    private Timestamp registerTime;

    @Column(name = "birthday",columnDefinition = "datetime(0) null comment '会员生日'")
    private Date birthday;

    @Column(name = "customer_level",columnDefinition = "int(4) null comment '会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石'")
    private int customerLevel;

    @Column(name = "user_money",columnDefinition = "decimal(8) null comment '用户余额'")
    private BigDecimal userMoney;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) null comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(long customerInfoId) {
        this.customerInfoId = customerInfoId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getIdentityCardType() {
        return identityCardType;
    }

    public void setIdentityCardType(int identityCardType) {
        this.identityCardType = identityCardType;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUser_point() {
        return user_point;
    }

    public void setUser_point(int user_point) {
        this.user_point = user_point;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(int customerLevel) {
        this.customerLevel = customerLevel;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
