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
@TableName("tp_order_record")
public class TpOrderRecord {
    @TableId(value = "record_id",type = IdType.ASSIGN_ID)
    private Long recordId;
    private Long accountId;
    private String outTradeId;
    private Long parkingRecordId;
    private Long vehicleId;
    private Integer tpPayMethod;
    private BigDecimal payAmount;
    private Date payTime;
    private Date uploadTime;
}
