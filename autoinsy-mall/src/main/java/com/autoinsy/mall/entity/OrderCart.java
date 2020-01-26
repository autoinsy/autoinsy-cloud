package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "order_cart")
public class OrderCart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id",columnDefinition = "bigint(20) auto_increment comment '购物车ID'")
    private long cartId;

    @Column(name = "customer_id",columnDefinition = "bigint(20) auto_increment comment '用户ID'")
    private long customerId;

    @Column(name = "product_id",columnDefinition = "bigint(20) auto_increment comment '商品ID'")
    private long productId;

    @Column(name = "product_amount",columnDefinition = "bigint(11) auto_increment comment '加入购物车商品数量'")
    private int productAmount;

    @Column(name = "price",columnDefinition = "decimal(8) auto_increment comment '商品价格'")
    private BigDecimal price;

    @Column(name = "add_time",columnDefinition = "timestamp(0) auto_increment comment '加入购物车时间'")
    private Timestamp addTime;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
