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
@TableName("user_advice_picture")
public class UserAdvicePicture {
	@TableId(value = "advice_picture_id",type = IdType.ASSIGN_ID)
	private Long advicePictureId;
	private Long adviceId;
	private String advicePicture;
}
