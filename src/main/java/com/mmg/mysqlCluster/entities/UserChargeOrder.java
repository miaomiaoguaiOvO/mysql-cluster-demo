package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.OrderStatusEnum;
import com.mmg.mysqlCluster.enums.PlatformTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_charge_order")
public class UserChargeOrder {
    @TableId(value = "order_id")
    private String orderId;
    private Long unionId;
    private PlatformTypeEnum platformType;
    private Date orderTime;
    private Date payTime;
    private BigDecimal payAmount;
    private BigDecimal totalPrice;
    private OrderStatusEnum orderStatus;
    private BigDecimal refundAmount;
    private String outTradeId;
}
