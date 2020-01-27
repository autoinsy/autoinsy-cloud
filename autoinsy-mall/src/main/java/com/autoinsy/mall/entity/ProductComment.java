package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity(name = "product_comment")
public class ProductComment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id",columnDefinition = "bigint(20) auto_increment comment '评论ID'")
    private long commentId;

    @Column(name = "product_id",columnDefinition = "bigint(20) auto_increment comment '商品ID'")
    private long productId;

    @Column(name = "order_id",columnDefinition = "bigint(20) auto_increment comment '订单ID'")
    private long orderId;

    @Column(name = "customer_id",columnDefinition = "bigint(20) auto_increment comment '用户ID'")
    private long customerId;

    @Column(name = "title",columnDefinition = "varchar(50) auto_increment comment '评论标题'")
    private String title;

    @Column(name = "content",columnDefinition = "varchar(300) auto_increment comment '评论内容'")
    private String content;

    @Column(name = "audit_status",columnDefinition = "int(4) auto_increment comment '审核状态：0未审核，1已审核'")
    private int auditStatus;

    @Column(name = "audit_time",columnDefinition = "timestamp(0) auto_increment comment '评论时间'")
    private Timestamp auditTime;

    @Column(name = "modified_time",columnDefinition = "timestamp(0) auto_increment comment '最后修改时间'")
    private Timestamp modifiedTime;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
