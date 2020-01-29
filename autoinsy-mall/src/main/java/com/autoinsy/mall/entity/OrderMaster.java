package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_login")
public class OrderMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id",columnDefinition = "bigint(20) auto_increment comment '订单ID'")
    private long orderId;

    @Column(name = "order_sn",columnDefinition = "bigint(20) auto_increment comment '订单编号 yyyymmddnnnnnnnn'")
    private long orderSn;

    @Column(name = "customer_id",columnDefinition = "bigint(20) auto_increment comment '下单人ID'")
    private long customerId;

    @Column(name = "shipping_user",columnDefinition = "varchar(10) auto_increment comment '收货人姓名'")
    private String shippingUser;

    @Column(name = "province",columnDefinition = "varchar(20) auto_increment comment '省'")
    private String province;

    @Column(name = "city",columnDefinition = "varchar(20) auto_increment comment '市'")
    private String city;

    @Column(name = "district",columnDefinition = "varchar(20) auto_increment comment '区'")
    private String district;

    @Column(name = "address",columnDefinition = "varchar(100) auto_increment comment '地址'")
    private String address;

    @Column(name = "payment_method",columnDefinition = "int(4) auto_increment comment '支付方式：1现金，2余额，3网银，4支付宝，5微信'")
    private int paymentMethod;

    @Column(name = "order_money",columnDefinition = "decimal(8) auto_increment comment '订单金额'")
    private BigDecimal orderMoney;

    @Column(name = "district_money",columnDefinition = "decimal(8) auto_increment comment '优惠金额'")
    private BigDecimal districtMoney;

    @Column(name = "shipping_money",columnDefinition = "decimal(8) auto_increment comment '运费金额'")
    private BigDecimal shippingMoney;

    @Column(name = "payment_money",columnDefinition = "decimal(8) auto_increment comment '支付金额'")
    private BigDecimal paymentMoney;

    @Column(name = "shipping_comp_name",columnDefinition = "varchar(10) auto_increment comment '快递公司名称'")
    private String shippingCompName;

    @Column(name = "shipping_sn",columnDefinition = "varchar(50) auto_increment comment '快递单号'")
    private String shippingSn;

    @Column(name = "create_time",columnDefinition = "timestamp(0) auto_increment comment '下单时间'")
    private Timestamp createTime;

    @Column(name = "shipping_time",columnDefinition = "timestamp(0) auto_increment comment '发货时间'")
    private Timestamp shippingTime;

    @Column(name = "pay_time",columnDefinition = "timestamp(0) auto_increment comment '支付时间'")
    private Timestamp payTime;

    @Column(name = "receive_time",columnDefinition = "timestamp(0) auto_increment comment '收货时间'")
    private Timestamp receiveTime;

    @Column(name = "order_status",columnDefinition = "int(4) auto_increment comment '订单状态'")
    private int orderStatus;

    @Column(name = "order_point",columnDefinition = "int(10) auto_increment comment '订单积分'")
    private int orderPoint;

    @Column(name = "invoice_time",columnDefinition = "varchar(100) auto_increment comment '发票抬头'")
    private String invoiceTime;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(long orderSn) {
        this.orderSn = orderSn;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getShippingUser() {
        return shippingUser;
    }

    public void setShippingUser(String shippingUser) {
        this.shippingUser = shippingUser;
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

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getDistrictMoney() {
        return districtMoney;
    }

    public void setDistrictMoney(BigDecimal districtMoney) {
        this.districtMoney = districtMoney;
    }

    public BigDecimal getShippingMoney() {
        return shippingMoney;
    }

    public void setShippingMoney(BigDecimal shippingMoney) {
        this.shippingMoney = shippingMoney;
    }

    public BigDecimal getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(BigDecimal paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getShippingCompName() {
        return shippingCompName;
    }

    public void setShippingCompName(String shippingCompName) {
        this.shippingCompName = shippingCompName;
    }

    public String getShippingSn() {
        return shippingSn;
    }

    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Timestamp shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(int orderPoint) {
        this.orderPoint = orderPoint;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
