package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.LiftTypeEnums;
import com.mmg.mysqlCluster.enums.ParkingRecordStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("device_record")
public class DeviceRecord {

    @TableId(value = "device_record_id", type = IdType.ASSIGN_ID)
    private Long deviceRecordId;
    private Long vehicleId;
    private Long vehicleExtId;
    private Long channelId;
    private Long parkingLotId;
    private Long parkingRecordId;
    private Date createAt;
    private LiftTypeEnums liftType;
    private String imageUrl;
    private ParkingRecordStatusEnum recordStatus;

}
