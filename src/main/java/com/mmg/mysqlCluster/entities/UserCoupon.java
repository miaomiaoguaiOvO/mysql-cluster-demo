package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.CouponTypeEnum;
import com.mmg.mysqlCluster.enums.UseFlagEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_coupon")
public class UserCoupon {
    @TableId(value = "user_coupon_id", type = IdType.ASSIGN_ID)
    private Long userCouponId;
    private Long userId;
    private Long vehicleId;
    private Long couponId;
    private Long parkingLotId;
    private BoolEnum couponCase;
    private Integer couponHours;
    private BigDecimal couponValue;
    private BigDecimal ticketValue;
    private CouponTypeEnum couponType;
    private String couponName;
    private Long issuerId;
    private Date issueTime;
    private Date expireTime;
    private BoolEnum systemRelease;
    private UseFlagEnum useFlag;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private BigDecimal useValue;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private BigDecimal ticketUseValue;
    private Integer timeInSeconds;
}
