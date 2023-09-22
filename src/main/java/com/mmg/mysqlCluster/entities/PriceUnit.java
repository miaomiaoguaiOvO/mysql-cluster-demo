package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.TimeUnitEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceUnit {
    @TableId(value = "unit_id",type = IdType.ASSIGN_ID)
    private Long unitId;
    private Long priceId;
    private Long detailId;
    private Integer fromTime;
    private Integer toTime;
    private TimeUnitEnum countUnit;
    private BigDecimal chargeAmount;
    private Integer chargeTime;
    private TimeUnitEnum chargeUnit;
}
