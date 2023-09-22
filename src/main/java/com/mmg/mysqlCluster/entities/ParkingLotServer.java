package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2021/12/24
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "parking_lot_server")
public class ParkingLotServer {
    @TableId(value = "parking_lot_server_id", type = IdType.ASSIGN_ID)
    private Long parkingLotServerId;
    private Long parkingLotId;
    private String parkingLotCode;
    private Long serverId;

}
