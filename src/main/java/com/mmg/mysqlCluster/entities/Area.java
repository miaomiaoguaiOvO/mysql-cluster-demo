package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: fan
 * @Date: 2022/11/2
 * @Description:
 */
@TableName("area")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    @TableId(value = "area_id", type = IdType.ASSIGN_ID)
    private Long areaId;
    private String province;
    private String city;
    private String district;
    private String street;
    private BigDecimal lng;
    private BigDecimal lat;
    @TableField(exist = false)
    private Integer waitReview;
    @TableField(exist = false)
    private Integer adNum;
}
