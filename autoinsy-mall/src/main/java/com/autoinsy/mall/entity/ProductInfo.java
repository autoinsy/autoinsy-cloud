package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Table
@Entity(name = "product_info")
public class ProductInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id",columnDefinition = "bigint(20) auto_increment comment '商品ID'")
    private long productId;

    @Column(name = "product_core", columnDefinition = "varchar(20) auto_increment comment '商品编码'")
    private String productCore;

    @Column(name = "product_name", columnDefinition = "varchar(20) auto_increment comment '商品名称'")
    private String productName;

    @Column(name = "bar_code", columnDefinition = "varchar(50) auto_increment comment '国条码'")
    private String barCode;

    @Column(name = "brand_id", columnDefinition = "bigint(20) auto_increment comment '品牌表的ID'")
    private long brandId;

    @Column(name = "one_category_id", columnDefinition = "bigint(20) auto_increment comment '一级分类ID'")
    private long oneCategoryId;

    @Column(name = "two_category_id", columnDefinition = "bigint(20) auto_increment comment '二级分类ID'")
    private long twoCategoryId;

    @Column(name = "supplier_id", columnDefinition = "bigint(20) auto_increment comment '商品的供应商ID'")
    private long supplierId;

    @Column(name = "price", columnDefinition = "decimal(8) auto_increment comment '商品销售价格'")
    private BigDecimal price;

    @Column(name = "average_cost", columnDefinition = "decimal(18) auto_increment comment '商品加权平均成本'")
    private BigDecimal averageCost;

    @Column(name = "publish_status", columnDefinition = "int(4) auto_increment comment '上下架状态：0下架1上架'")
    private int publishStatus;

    @Column(name = "audit_status", columnDefinition = "int(4) auto_increment comment '审核状态：0未审核，1已审核'")
    private int auditStatus;

    @Column(name = "weight", columnDefinition = "float(0) auto_increment comment '商品重量'")
    private float weight;

    @Column(name = "length", columnDefinition = "float(0) auto_increment comment '商品长度'")
    private float length;

    @Column(name = "height", columnDefinition = "float(0) auto_increment comment '商品高度'")
    private float height;

    @Column(name = "width", columnDefinition = "float(0) auto_increment comment '商品宽度'")
    private float width;

    @Column(name = "color_type", columnDefinition = "varchar(255) auto_increment comment '颜色'")
    private String color_type;

    @Column(name = "production_date",columnDefinition = "datetime(0) auto_increment comment '生产日期'")
    private Date productionDate;

    @Column(name = "shelf_life", columnDefinition = "int(11) auto_increment comment '商品有效期'")
    private int shelfLife;

    @Column(name = "description", columnDefinition = "varchar(255) auto_increment comment '商品描述'")
    private String description;

    @Column(name = "indate", columnDefinition = "timestamp(0) auto_increment comment '商品录入时间'")
    private Timestamp indate;

    @Column(name = "modified_time", columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modified_time;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductCore() {
        return productCore;
    }

    public void setProductCore(String productCore) {
        this.productCore = productCore;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public long getOneCategoryId() {
        return oneCategoryId;
    }

    public void setOneCategoryId(long oneCategoryId) {
        this.oneCategoryId = oneCategoryId;
    }

    public long getTwoCategoryId() {
        return twoCategoryId;
    }

    public void setTwoCategoryId(long twoCategoryId) {
        this.twoCategoryId = twoCategoryId;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public int getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(int publishStatus) {
        this.publishStatus = publishStatus;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getColor_type() {
        return color_type;
    }

    public void setColor_type(String color_type) {
        this.color_type = color_type;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    public Timestamp getModified_time() {
        return modified_time;
    }

    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }
}
