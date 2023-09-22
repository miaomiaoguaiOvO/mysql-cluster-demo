package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.UserRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2022/2/11
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("parking_lot_user")
public class ParkingLotUser {

    @TableId(value = "bind_id", type = IdType.ASSIGN_ID)
    private Long bindId;
    private Long parkingLotId;
    private Long userId;
    private UserRoleEnum userType;
    private Date bind_time;

}
