package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Table
@Entity(name = "customer_login")
public class CustomerLogin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id",columnDefinition = "bigint(20) auto_increment comment '用户ID'")
    private long customerId;

    @Column(name = "username",columnDefinition = "varchar(255) null comment '用户登录名'")
    private String username;

    @Column(name = "password",columnDefinition = "varchar(255) null comment 'md5加密的密码'")
    private String password;

    @Column(name = "user_stats",columnDefinition = "int(4) null comment '用户状态'")
    private int userStats;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) null comment '最后修改时间'")
    private Timestamp modifiedTime;

    @Column(name = "customer_code",columnDefinition = "varchar(0) null comment '最后修改时间'",insertable=false,updatable=false)
    private long customerCode;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_code",referencedColumnName = "customer_id")
    private CustomerInfo customerInfo;

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(long customerCode) {
        this.customerCode = customerCode;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserStats() {
        return userStats;
    }

    public void setUserStats(int userStats) {
        this.userStats = userStats;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
