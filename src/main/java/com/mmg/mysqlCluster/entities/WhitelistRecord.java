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
 * @Author: fan
 * @Date: 2023/4/26
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "whitelist_record")
public class WhitelistRecord {
    @TableId(value = "whitelist_record_id",type = IdType.ASSIGN_ID)
    private Long whitelistRecordId;
    private Long vehicleId;
    private Long parkingLotId;
    private Date createAt;
    private Long inChannelId;
    private Long outChannelId;
    private Date arriveTime;
    private Date leaveTime;
    private String arriveImage;
    private String leaveImage;
    private ParkingRecordStatusEnum parkingStatus;

}
