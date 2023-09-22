package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.SubscribeTypeEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName("screen_subscribe")
public class ScreenSubscribe {
    @TableId(value = "subscribe_id", type = IdType.ASSIGN_ID)
    private Long subscribeId;
    private Long userId;
    private String userToken;
    private Long parkingLotId;
    private Date subscribeTime;
    private SubscribeTypeEnum subscribeType;
}
