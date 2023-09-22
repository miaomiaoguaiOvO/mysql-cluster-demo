package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tp_charge_record")
public class TpChargeRecord {
    @TableId(value = "record_id",type = IdType.ASSIGN_ID)
    private Long recordId;
    private String outTradeId;
    private Long parkingLotId;
    private Long vehicleId;
    private Date startTime;
    private Date endTime;
    private BigDecimal payAmount;
    private Date uploadTime;
}
