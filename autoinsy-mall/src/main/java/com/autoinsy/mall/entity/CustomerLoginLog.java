package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_login_log")
public class CustomerLoginLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login_id",columnDefinition = "bigint(20) auto_increment comment '登陆日志ID'")
    private long loginId;

    @Column(name = "customer_id", columnDefinition = "bigint(20) auto_increment comment '登陆日志ID'")
    private long customerId;

    @Column(name = "login_time", columnDefinition = "timestamp(0) null comment '用户登陆时间'")
    private Timestamp loginTime;

    @Column(name = "login_ip", columnDefinition = "varchar(10) auto_increment comment '登陆IP'")
    private String loginIp;

    @Column(name = "login_type", columnDefinition = "int(10) auto_increment comment '登陆类型：0未成功，1成功'")
    private int loginType;

    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }
}
