package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.PlatformTypeEnum;
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
@TableName("user_advice")
public class UserAdvice {
	@TableId(value = "advice_id",type = IdType.ASSIGN_ID)
	private Long adviceId;
    private Long adviceTypeId;
    private Long unionId;
    private PlatformTypeEnum platformType;
    private String adviceText;
    private Date submitAt;
    private String contactPerson;
    private String contactNumber;
    
    //新增字段
    private String orderId;
    private String plateNum;
    private String parkingLotName;
    private Long parkingLotId;
    private String platformUserName;
    private String solution;
    private BigDecimal payAmount;
    private BigDecimal totalPrice;
    private Integer solvedFlag;
    
    
    
}
