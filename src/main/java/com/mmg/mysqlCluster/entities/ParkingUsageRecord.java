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
 * @Date: 2022/6/21
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("parking_usage_record")
public class ParkingUsageRecord {

    @TableId(value = "usage_record_id", type = IdType.ASSIGN_ID)
    private Long changeId;
    private Long parkingLotId;
    private Integer totalLots;
    private Integer usedLots;
    private Date createAt;
}
