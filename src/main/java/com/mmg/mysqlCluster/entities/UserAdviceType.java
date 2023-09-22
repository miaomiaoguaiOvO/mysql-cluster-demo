package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user_advice_type")
public class UserAdviceType {
	@TableId(value = "advice_type_id",type = IdType.ASSIGN_ID)
	private Long adviceTypeId;
    private String adviceName;
}
