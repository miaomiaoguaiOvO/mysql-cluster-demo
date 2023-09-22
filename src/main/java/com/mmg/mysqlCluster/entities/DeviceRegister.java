package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.DHDeviceTypeEnum;
import com.mmg.mysqlCluster.enums.ScreenTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2022/11/17
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "device_register")
public class DeviceRegister {

    @TableId(value = "device_register_id", type = IdType.ASSIGN_ID)
    private Long deviceRegisterId;
    private String deviceCode;
    private String deviceName;
    private String deviceSn;
    private String deviceIp;
    private Integer devicePort;
    private DHDeviceTypeEnum deviceType;
    private Integer channelNum;
    private String username;
    private String password;
    private Long loginHandle;
    private Long subHandle;
    private Long playHandle;
    private BoolEnum initialized;
    private Date createAt;
    private String serverCode;
    @TableField(value = "channel_id", updateStrategy = FieldStrategy.IGNORED)
    private Long channelId;
    private BoolEnum loggedIn;
    private BoolEnum subscribed;
    private ScreenTypeEnum screenType;
    private Integer soundVolume;
    private String token;
    private String localIpAddr;
    private Integer rtspPort;
}
