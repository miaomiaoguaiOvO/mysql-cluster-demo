package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ParkingOrder {
    @TableId(value = "order_id")
    private String orderId;
    private Long unionId;
    private PlatformTypeEnum platformType;
    private Long parkingLotId;
    private Long parkingRecordId;
    private Long vehicleId;
    private Long priceId;
    private Date serviceStartTime;
    private Date serviceEndTime;
    private Date orderTime;
    private Date payTime;
    private Integer payMethod;
    private BigDecimal payAmount;
    private BigDecimal walletAmount;
    private BigDecimal freeCarAmount;
    private BigDecimal totalPrice;
    private BigDecimal refundAmount;
    private OrderStatusEnum orderStatus;
    private RefundStatusEnum refundStatus;
    private InvoiceStatusEnum invoiceStatus;
    private OrderTypeEnum orderType;
    private TpPayMethodEnum tpPayMethod;
    private String outTradeId;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Long userCouponId;
    private Long channelId;
    private BoolEnum extendPay;
    private BoolEnum couponUsed;
    private Long freeCarId;
    private String payId;
    private String refundId;
    private String parentOrderId;
    private Long parkingGroupId;
    private Long parkingGroupRecordId;
    private ReleaseTypeEnum releaseType;
}
