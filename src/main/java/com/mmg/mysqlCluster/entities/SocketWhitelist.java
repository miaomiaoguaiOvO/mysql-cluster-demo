package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/7/31
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("socket_whitelist")
public class SocketWhitelist {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String remoteIp;
    private Date createAt;
    private Date updateAt;
    private BoolEnum allowRegistration;
    private String remarks;
}
