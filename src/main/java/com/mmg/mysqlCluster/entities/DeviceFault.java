package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2022/7/14
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "device_fault")
public class DeviceFault {
    @TableId(value = "device_fault_id", type = IdType.ASSIGN_ID)
    private Long deviceFaultId;
    private Long deviceId;
    private String faultDetail;
    private Date faultTime;
}
