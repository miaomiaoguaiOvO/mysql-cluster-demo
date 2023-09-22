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
 * @Date: 2022/6/29
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "vehicle_color_record")
public class VehicleColorRecord {
    @TableId(value = "color_record_id", type = IdType.ASSIGN_ID)
    private Long colorRecordId;
    private Long vehicleId;
    private Date createAt;
    private String vehicleColor;
    private String vehicleLastColor;
}
