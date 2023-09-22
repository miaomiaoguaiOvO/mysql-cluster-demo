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
 * @Auther: fan
 * @Date: 2022/4/7
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "channel_vehicle")
public class ChannelVehicle {
    @TableId(value = "channel_vehicle_id", type = IdType.ASSIGN_ID)
    private Long channelVehicleId;
    private Long vehicleId;
    private Long parkingLotId;
    private Long channelId;
    private BoolEnum isEnable;
    private Date createDate;
    private Date expirationDate;
    private Integer white;
}
