package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.DepartureTypeEnum;
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
@TableName("parking_record")
public class ParkingRecord {

    @TableId(value = "parking_record_id", type = IdType.ASSIGN_ID)
    private Long parkingRecordId;
    private Long parkingLotId;
    private Long vehicleId;
    private Long vehicleExtId;
    private Long vehicleLeaveId;
    private Long inChannelId;
    private Long outChannelId;
    private ParkingRecordStatusEnum parkingStatus;
    private String arrivalImage;
    private String departureImage;
    private Date preArrivalTime;
    private Date arrivalTime;
    private Date preDepartureTime;
    private Date departureTime;
    private BoolEnum unlicensed;
    private DepartureTypeEnum departureType;
    private Date createAt;
    private BoolEnum invalid;
    private Long parkingGroupRecordId;
    private Long parkingGroupId;
    private Long parentParkingRecordId;
    private BoolEnum hasParent;
    private BoolEnum hasChargeRecord;
    private Long forceOutUserId;

    @JsonIgnore
    public Date getRealArrivalTime() {
        return arrivalTime == null ? preArrivalTime : arrivalTime;
    }

    @JsonIgnore
    public Date getExpectDepartureTime(){
        return preDepartureTime == null ? new Date() : preDepartureTime;
    }
}
