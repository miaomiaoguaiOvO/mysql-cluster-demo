package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.CouponTypeEnum;
import com.mmg.mysqlCluster.enums.LeaseTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "coupon_issue_plan")
public class CouponIssuePlan {
    @TableId(value = "plan_id", type = IdType.ASSIGN_ID)
    private Long planId;
    private Long parkingLotId;
    private Long merchantId;
    private Integer couponHours;
    private BigDecimal couponValue;
    private CouponTypeEnum couponType;
    private String couponName;
    private Integer maxIssue;
    private Integer expireDays;
    private LeaseTypeEnum releaseType;
    private Integer releaseNum;
    private BoolEnum renewable;
    private BoolEnum firstMonthIssued;
    private Date createAt;
    @JsonIgnore
    @TableLogic(value = "0",delval = "1")
    private Integer delFlag;
}
