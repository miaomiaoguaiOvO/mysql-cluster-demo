package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.RemindTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/8/3
 * @Description:
 */
@Data
@TableName("remind")
public class Remind {
    @TableId(value = "remind_id", type = IdType.AUTO)
    private Integer remindId;
    private RemindTypeEnum remindType;
    private String remindDesc;
    private Date expireTime;

}
