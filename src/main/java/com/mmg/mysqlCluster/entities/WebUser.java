package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.UserRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebUser {
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Long userId;
    private String username;
    private String password;
    private UserRoleEnum userRole;
    private String contactName;
    private String contactPhone;
    private Date lastLogin;
    private String clientId;
    private Long roleId;
    private BoolEnum accountFreeze;
    @JsonIgnore
    @TableLogic(value = "0",delval = "1")
    private Integer delFlag;
    @TableField(exist = false)
    private List<String> authorities;

}
