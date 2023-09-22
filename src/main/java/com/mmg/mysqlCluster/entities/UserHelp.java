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
@TableName("user_help")
public class UserHelp {
	 @TableId(value = "help_id",type = IdType.ASSIGN_ID)
	 private Long helpId;
	 private String question;
	 private String answer;
}
