package com.autoinsy.mall.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table
@Entity(name = "customer_balance_log")
public class CustomerBalanceLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "balance_id",columnDefinition = "bigint(20) auto_increment comment '余额日志ID'")
    private long balanceId;

    @Column(name = "customer_id",columnDefinition = "bigint(20) null comment '用户ID'")
    private long customerId;

    @Column(name = "source",columnDefinition = "int(3) null comment '记录来源：1订单，2退货单'")
    private int source;

    @Column(name = "source_sn",columnDefinition = "int(10) null comment '相关单据ID'")
    private int sourceSn;

    @Column(name = "create_time",columnDefinition = "timestamp(0) null comment '记录生成时间'")
    private Timestamp createTime;

    @Column(name = "amount",columnDefinition = "decimal(8) null comment '变动金额'")
    private BigDecimal amount;

    public long getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(long balanceId) {
        this.balanceId = balanceId;
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

    public int getSourceSn() {
        return sourceSn;
    }

    public void setSourceSn(int sourceSn) {
        this.sourceSn = sourceSn;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
