package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.RefundStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("order_refund_request")
public class OrderRefundRequest {
    @TableId(value = "refund_id", type = IdType.ASSIGN_ID)
    private Long refundId;
    private Long userId;
    private String orderId;
    private RefundStatusEnum refundSuccess;
    private BigDecimal requestAmount;
    private BigDecimal requestWalletAmount;
    private Date appliedAt;
    private String applyRemark;
    private Date checkedAt;
    private String handleRemark;
}
