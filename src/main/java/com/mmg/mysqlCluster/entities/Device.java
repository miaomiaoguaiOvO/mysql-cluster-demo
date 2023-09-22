package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.DeviceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2021/12/24
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "device")
public class Device {

    @TableId(value = "device_id", type = IdType.ASSIGN_ID)
    private Long deviceId;
    private String deviceCode;
    private DeviceTypeEnum deviceType;
    private String deviceName;
    private Long serverId;
}
