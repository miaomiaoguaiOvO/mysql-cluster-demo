package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "business_circle")
public class BusinessCircle {
    @TableId(value = "business_circle_id", type = IdType.ASSIGN_ID)
    private Long businessCircleId;
    private String businessCircleName;
    private BigDecimal businessCircleLng;
    private BigDecimal businessCircleLat;
    private String businessCircleAddress;

}
