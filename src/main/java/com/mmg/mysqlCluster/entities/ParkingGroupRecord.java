package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.ParkingRecordStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2022/8/31
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "parking_group_record")
public class ParkingGroupRecord {
    @TableId(value = "parking_group_record_id",type = IdType.ASSIGN_ID)
    private Long parkingGroupRecordId;
    private Long parkingGroupId;
    private Date serviceStartTime;
    private Date serviceEndTime;
    private Date createAt;
    private ParkingRecordStatusEnum parkingStatus;
    private Long vehicleId;
    private Long vehicleExtId;
    private Long inChannelId;
    private Long outChannelId;
}
