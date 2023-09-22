package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.CouponTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "parking_coupon")
public class ParkingCoupon {
    @TableId(value = "coupon_id", type = IdType.ASSIGN_ID)
    private Long couponId;
    private Long merchantId;
    private Long parkingLotId;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer couponHours;
    private BigDecimal couponValue;
    private CouponTypeEnum couponType;
    private String couponName;
    private BoolEnum isDefault;
    private Integer maxIssue;
    private Date createTime;
    private Integer expireDays;
    private Integer availNum;
    private Integer issuedNum;
    private Integer usedNum;
    private String remark;
    private BoolEnum autoRelease;
    @JsonIgnore
    @TableLogic(value = "0",delval = "1")
    private Integer delFlag;
}
