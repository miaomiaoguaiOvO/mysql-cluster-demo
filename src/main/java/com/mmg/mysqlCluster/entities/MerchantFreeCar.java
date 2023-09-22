package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.LeaseTypeEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName(value = "merchant_free_car")
public class MerchantFreeCar {
    @TableId(value = "car_id", type = IdType.ASSIGN_ID)
    private Long carId;
    private Long parkingLotId;
    private Long merchantId;
    private Long vehicleId;
    private String contactName;
    private String contactPhone;
    private LeaseTypeEnum releaseType;
    private BigDecimal releaseAmount;
    private BigDecimal availableAmount;
    private BigDecimal suspendAmount;
    private String remark;
    @JsonIgnore
    @TableLogic(value = "0",delval = "1")
    private Integer delFlag;
}
