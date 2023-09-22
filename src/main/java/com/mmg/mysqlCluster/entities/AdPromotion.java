package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.AdPromotionPositionEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/7/28
 * @Description:
 */
@TableName("ad_promotion")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdPromotion {
    @TableId(value = "promotion_id", type = IdType.ASSIGN_ID)
    private Long promotionId;
    private String mainTitle;
    private String subtitle;
    private Long coverId;
    private Long videoId;
    private String detailUrl;
    private Long userId;
    private Date createAt;
    private AdPromotionPositionEnum position;
}
