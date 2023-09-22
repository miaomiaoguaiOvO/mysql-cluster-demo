package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.LeaseTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "vehicle_lease")
public class VehicleLease {
    @TableId(value = "lease_id", type = IdType.ASSIGN_ID)
    private Long leaseId;
    private Long parkingLotId;
    private Long vehicleId;
    private Date startTime;
    private Date endTime;
    private Long priceId;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Long seatGroupId;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private LeaseTypeEnum leaseType;
    private String remarks;
    private String contactPhone;
    private String contacts;
    private String subjectName;
    private BoolEnum alwaysOpen;
    private BoolEnum needPay;
    private BoolEnum suspendFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleLease that = (VehicleLease) o;
        return Objects.equals(parkingLotId, that.parkingLotId) &&
                Objects.equals(vehicleId, that.vehicleId) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(priceId, that.priceId) &&
                Objects.equals(seatGroupId, that.seatGroupId) &&
                leaseType == that.leaseType &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(contactPhone, that.contactPhone) &&
                Objects.equals(contacts, that.contacts) &&
                Objects.equals(subjectName, that.subjectName) &&
                Objects.equals(alwaysOpen, that.alwaysOpen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingLotId, vehicleId, startTime, endTime, priceId, seatGroupId, leaseType, remarks, contactPhone, contacts, subjectName, alwaysOpen);
    }
}
