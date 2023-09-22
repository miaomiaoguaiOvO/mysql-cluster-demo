package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.PriceTypeEnum;
import com.mmg.mysqlCluster.enums.PriceVersionEnum;
import com.mmg.mysqlCluster.enums.TimeUnitEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingPrice {
    @TableId(value = "price_id",type = IdType.ASSIGN_ID)
    private Long priceId;
    private Long parkingLotId;
    private PriceVersionEnum priceVersion;
    private PriceTypeEnum priceType;
    private String priceName;
    private String priceComment;
    private Integer freeDuration;
    private TimeUnitEnum freeUnit;
    private Integer freeIncluded;
    private Integer freeLeaveMinutes;
    private Integer periodHours;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer onceDuration;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private TimeUnitEnum onceUnit;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private BigDecimal onceCharge;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private BigDecimal highestCharge;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private BigDecimal vehicleTopCharge;
    private BoolEnum countWithArrival;
    private BoolEnum allowDoubleCharge;
    private Date createdAt;
    private Long createdBy;
    @JsonIgnore
    @TableLogic(value = "0",delval = "1")
    private Integer delFlag;
}
