package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "warehouse_product")
public class WarehouseProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wp_id",columnDefinition = "bigint(20) auto_increment comment '商品库存ID'")
    private long wpId;

    @Column(name = "product_id", columnDefinition = "bigint(20) auto_increment comment '商品ID'")
    private long productId;

    @Column(name = "w_id", columnDefinition = "bigint(20) auto_increment comment '仓库ID'")
    private long wId;

    @Column(name = "current_cnt", columnDefinition = "int(10) auto_increment comment '当前商品数量'")
    private int currentCnt;

    @Column(name = "lock_cnt", columnDefinition = "int(10) auto_increment comment '当前占用数据'")
    private int lockCnt;

    @Column(name = "in_transit_cnt", columnDefinition = "int(10) auto_increment comment '在途数据'")
    private int inTransitCnt;

    @Column(name = "average_cost", columnDefinition = "decimal(8) auto_increment comment '移动加权成本'")
    private BigDecimal averageCost;

    @Column(name = "modified_time", columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getWpId() {
        return wpId;
    }

    public void setWpId(long wpId) {
        this.wpId = wpId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getwId() {
        return wId;
    }

    public void setwId(long wId) {
        this.wId = wId;
    }

    public int getCurrentCnt() {
        return currentCnt;
    }

    public void setCurrentCnt(int currentCnt) {
        this.currentCnt = currentCnt;
    }

    public int getLockCnt() {
        return lockCnt;
    }

    public void setLockCnt(int lockCnt) {
        this.lockCnt = lockCnt;
    }

    public int getInTransitCnt() {
        return inTransitCnt;
    }

    public void setInTransitCnt(int inTransitCnt) {
        this.inTransitCnt = inTransitCnt;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
