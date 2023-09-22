package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@AllArgsConstructor
@NoArgsConstructor
@TableName("device_channel")
public class DeviceChannel {
    @TableId(value = "device_channel_id", type = IdType.ASSIGN_ID)
    private Long deviceChannelId;
    private Long channelId;
    private Long deviceId;


}
