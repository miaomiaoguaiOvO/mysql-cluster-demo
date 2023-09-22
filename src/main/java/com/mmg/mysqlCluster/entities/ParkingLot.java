package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.ParkingLotTypeEnum;
import com.mmg.mysqlCluster.enums.SubjectTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("parking_lot")
public class ParkingLot {
    @TableId(value = "parking_lot_id", type = IdType.ASSIGN_ID)
    private Long parkingLotId;
    private String parkingLotName;
    private String parkingLotAddress;
    private BigDecimal parkingLotLng;
    private BigDecimal parkingLotLat;
    private ParkingLotTypeEnum parkingLotType;
    private SubjectTypeEnum subjectType;
    private String shopId;
    private String staffId;
    private String signPrivate;
    private Integer totalLots;
    private Integer idleLots;
    private Integer fixedLots;
    private Integer entranceNum;
    private Integer exitusNum;
    private String parkingLotPic;
    private String parkingLotTel;
    private String parkpotId;
    private BigDecimal interestRate;
    private BigDecimal taxRate;
    private BoolEnum autoOpen;
    private BoolEnum couponFlag;
    private BoolEnum freeCarFlag;
    private Integer property;
    private Integer civilDefense;
    @JsonIgnore
    @TableLogic(value = "0", delval = "1")
    private Integer delFlag;
    private Long parkingGroupId;
    private Long parkingParentId;
    private Long shopInvoiceId;
    private BoolEnum hasChildren;
    private BoolEnum display;
    private String tpToken;
    private String tpPublic;
    private String account;
    private BoolEnum ignoreRemain;
    private BoolEnum leaseOnly;
    private BoolEnum strictRecord;
    private BoolEnum secondCheckOpen;
    private Long allowTemp;
}
