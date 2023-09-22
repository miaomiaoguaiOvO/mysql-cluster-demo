package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BalanceRecordType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(value = "user_balance_record")
public class UserBalanceRecord {
    @TableId(value = "record_id", type = IdType.ASSIGN_ID)
    private Long recordId;
    private Long unionId;
    private BalanceRecordType recordType;
    private BigDecimal amountChange;
    private BigDecimal amountRemain;
    private Date recordTime;
    private String orderId;
    private String plateNum;
}
