package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/4/25
 * @Description: 车辆白名单
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "vehicle_whitelist")
public class VehicleWhitelist {
    @TableId(value = "whitelist_id", type = IdType.ASSIGN_ID)
    private Long whitelistId;
    private Long vehicleId;
    private String plateNum;
    private Long parkingLotId;
    private Date createAt;
    private BoolEnum allParkFree;
}
