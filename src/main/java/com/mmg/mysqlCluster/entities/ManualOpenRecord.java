package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.LiftTypeEnums;
import com.mmg.mysqlCluster.enums.ReleaseReasonEnum;
import com.mmg.mysqlCluster.enums.ReleaseTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2022/7/28
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manual_open_record")
public class ManualOpenRecord {
    @TableId(value = "manual_open_record_id", type = IdType.ASSIGN_ID)
    private Long manualOpenRecordId;
    private Long userId;
    private Long parkingRecordId;
    private Long channelId;
    private String orderId;
    private Date createAt;
    private LiftTypeEnums liftType;
    private Long parkingLotId;
    private Long vehicleId;
    private Long vehicleExtId;
    private ReleaseTypeEnum releaseType;
    private String imageUrl;
    private ReleaseReasonEnum releaseReason;

}
