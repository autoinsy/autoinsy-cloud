package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_level_info")
public class CustomerLevelInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_level_id",columnDefinition = "bigint(20) auto_increment comment '会员级别ID'")
    private long customerLevelId;

    @Column(name = "level_name",columnDefinition = "varchar(255) null comment '会员级别名称'")
    private String levelName;

    @Column(name = "min_point",columnDefinition = "int(10) null comment '该级别最低积分'")
    private int minPoint;

    @Column(name = "max_point",columnDefinition = "int(10) null comment '该级别最高积分'")
    private int maxPoint;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) null comment '最后修改时间'")
    private Timestamp modifiedTime;

    @Column(name = "customer_level",columnDefinition = "int(4) null comment '会员级别'")
    private Timestamp customerLevel;

    public long getCustomerLevelId() {
        return customerLevelId;
    }

    public void setCustomerLevelId(long customerLevelId) {
        this.customerLevelId = customerLevelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(int minPoint) {
        this.minPoint = minPoint;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Timestamp getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Timestamp customerLevel) {
        this.customerLevel = customerLevel;
    }
}
