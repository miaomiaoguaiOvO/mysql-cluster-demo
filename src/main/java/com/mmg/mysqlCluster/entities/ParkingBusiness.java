package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "parking_business")
public class ParkingBusiness {
    @TableId(value = "parking_business_id", type = IdType.ASSIGN_ID)
    private Long parkingBusinessId;
    private Long parkingLotId;
    private Long businessCircleId;
}
