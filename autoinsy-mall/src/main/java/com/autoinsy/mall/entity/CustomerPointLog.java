package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_login_log")
public class CustomerPointLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "point_id",columnDefinition = "bigint(20) auto_increment comment '积分日志ID'")
    private long pointId;

    @Column(name = "customer_id", columnDefinition = "bigint(20) auto_increment comment '用户ID'")
    private long customerId;

    @Column(name = "source", columnDefinition = "int(3) auto_increment comment '积分来源：0订单，1登陆，2活动'")
    private int source;

    @Column(name = "refer_number", columnDefinition = "int(10) auto_increment comment '积分来源相关编号'")
    private int referNumber;

    @Column(name = "change_point", columnDefinition = "int(6) auto_increment comment '变更积分数'")
    private int changePoint;

    @Column(name = "create_time", columnDefinition = "int(6) auto_increment comment '积分日志生成时间'")
    private Timestamp createTime;

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getReferNumber() {
        return referNumber;
    }

    public void setReferNumber(int referNumber) {
        this.referNumber = referNumber;
    }

    public int getChangePoint() {
        return changePoint;
    }

    public void setChangePoint(int changePoint) {
        this.changePoint = changePoint;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
