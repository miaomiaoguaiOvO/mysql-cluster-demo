package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: fan
 * @Date: 2022/8/31
 * @Description: 停车场分组（联合停车场）
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "parking_group")
public class ParkingGroup {
    @TableId(value = "parking_group_id", type = IdType.ASSIGN_ID)
    private Long parkingGroupId;
    private String groupName;
    private String parkpotId;
}
