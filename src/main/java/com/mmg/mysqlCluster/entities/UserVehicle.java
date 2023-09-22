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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_vehicle")
public class UserVehicle {
    @TableId(value = "user_vehicle_id", type = IdType.ASSIGN_ID)
    private Long userVehicleId;
    private Long unionId;
    private Long vehicleId;
    private BoolEnum isDefault;
    private BoolEnum autoDeduct;
    private Date deductTime;
    private Date bindTime;
}
