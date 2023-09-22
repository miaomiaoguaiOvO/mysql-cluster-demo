package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * 
 * @Author: Xu Kejia
 * @Date: 2022年1月14日
 * @Description:开票时销方信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("shop_invoice")
public class ShopInvoice {
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;
	private String taxNum;
	@JsonIgnore
	private String accessToken;
	@JsonIgnore
	private String refreshToken;
	@JsonIgnore
	private String shopUserId;
	private String salerTel;
	private String salerAddress;
	private String salerAccount;
	private String clerk;
	private BoolEnum enable;
	@JsonIgnore
    @TableLogic(value = "0",delval = "1")
	private Integer delFlag;
	private Date lastAuth;
}
