package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "order_detail")
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_detail_id",columnDefinition = "bigint(20) auto_increment comment '订单ID'")
    private long orderDetailId;

    @Column(name = "order_id",columnDefinition = "bigint(20) auto_increment comment '订单表ID'")
    private long orderId;

    @Column(name = "product_id",columnDefinition = "bigint(20) auto_increment comment '订单商品ID'")
    private long productId;

    @Column(name = "product_name",columnDefinition = "varchar(50) auto_increment comment '商品名称'")
    private String productName;

    @Column(name = "product_cnt",columnDefinition = "varchar(11) auto_increment comment '购买商品数量'")
    private int productCnt;

    @Column(name = "product_price",columnDefinition = "decimal(8) auto_increment comment '购买商品单价'")
    private BigDecimal productPrice;

    @Column(name = "average_cost",columnDefinition = "decimal(8) auto_increment comment '平均成本价格'")
    private BigDecimal averageCost;

    @Column(name = "weight",columnDefinition = "float(0) auto_increment comment '商品重量'")
    private float weight;

    @Column(name = "fee_money",columnDefinition = "decimal(8) auto_increment comment '优惠分摊金额'")
    private BigDecimal feeMoney;

    @Column(name = "w_id",columnDefinition = "bigint(20) auto_increment comment '仓库ID'")
    private long wId;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCnt() {
        return productCnt;
    }

    public void setProductCnt(int productCnt) {
        this.productCnt = productCnt;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public BigDecimal getFeeMoney() {
        return feeMoney;
    }

    public void setFeeMoney(BigDecimal feeMoney) {
        this.feeMoney = feeMoney;
    }

    public long getwId() {
        return wId;
    }

    public void setwId(long wId) {
        this.wId = wId;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
