package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2022/8/24
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "parking_seat_group")
public class ParkingSeatGroup {
    @TableId(value = "seat_group_id", type = IdType.ASSIGN_ID)
    private Long seatGroupId;
    private String seatGroupName;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Long companyId;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String owner;
    private Integer quantityLimit;
    private BoolEnum chargeAdmission;
    private Long parkingLotId;
    private String contacts;
    private String contactPhone;
    private String remarks;
}
