package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.PlatformTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileUserUnion implements Serializable{
    @TableId(value = "union_id",type = IdType.ASSIGN_ID)
    private Long unionId;
    private String bindPhone;
    private String userCredential;
    private BigDecimal accountBalance;
    private BigDecimal suspendBalance;
    private BigDecimal refundBalance;
    private PlatformTypeEnum lastPlatformType;
    private Date lastLogin;
}
