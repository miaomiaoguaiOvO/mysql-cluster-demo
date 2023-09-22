package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.InvoiceStatusEnum;
import com.mmg.mysqlCluster.enums.OrderStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ChargeOrder {
    @TableId(value = "order_id")
    private String orderId;
    private Long merchantId;
    private String openId;
    private Date orderTime;
    private Date payTime;
    private BigDecimal payAmount;
    private BigDecimal totalPrice;
    private OrderStatusEnum orderStatus;
    private String outTradeId;
    private InvoiceStatusEnum invoiceStatus;
    @TableField(exist = false)
    private BoolEnum parkingInvoiceable;
}
