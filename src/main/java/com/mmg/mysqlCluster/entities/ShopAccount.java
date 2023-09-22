package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Auther: fan
 * @Date: 2022/2/11
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "shop_account")
public class ShopAccount {
    @TableId(value = "user_id")
    private Long userId;
    private Long parkingLotId;
    private BigDecimal accountBalance;
    private BigDecimal availableBalance;
    private BigDecimal ticketBalance;
    private BigDecimal ticketAvailable;
    private BigDecimal ticketPerMonth;
    private String shopName;
    private String shopAddress;
    private BigDecimal averageConsumption;
    private BoolEnum rentFree;
    private String shopRemarks;
    private Long parentUserId;
    @JsonIgnore
    private String aesKey;
    //二维码有效期
    private Integer codeExpireMinutes;
    //同一张二维码是否允许领取多次
    private BoolEnum codeMultiUse;
}
