package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mmg.mysqlCluster.enums.PlatformTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobileUser implements Serializable{
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Long userId;
    private String userToken;
    private PlatformTypeEnum platformType;
    private String platformUserId;
    private String platformUserName;
    private String platformAvatarUrl;
    private Long bindUnionId;
    private Date lastLogin;
}
