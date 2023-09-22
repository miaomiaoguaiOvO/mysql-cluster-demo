package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2022/7/26
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "parking_user_subscribe")
public class ParkingUserSubscribe {
    @TableId(value = "parking_user_subscribe_id")
    private Long parkingUserSubscribeId;
    private Long parkingLotId;
    private Long userId;
}
