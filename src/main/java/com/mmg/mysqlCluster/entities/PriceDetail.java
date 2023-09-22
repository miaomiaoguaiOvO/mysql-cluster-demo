package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.PriceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceDetail {
    @TableId(value = "detail_id",type = IdType.ASSIGN_ID)
    private Long detailId;
    private Long priceId;
    private PriceTypeEnum priceType;
    private Integer timeStart;
    private Integer timeEnd;
    private BigDecimal onceCharge;
    private BigDecimal highestCharge;
}
