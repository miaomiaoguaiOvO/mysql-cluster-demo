package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.VehicleSizeEnum;
import com.mmg.mysqlCluster.enums.VehicleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("vehicle")
public class Vehicle {
    @TableId(value = "vehicle_id", type = IdType.ASSIGN_ID)
    private Long vehicleId;
    private String plateNum;
    private VehicleTypeEnum vehicleType;
    private VehicleSizeEnum vehicleSize;
    private String vehicleColor;
    private String vehicleBrand;
    private Date createdAt;
}
