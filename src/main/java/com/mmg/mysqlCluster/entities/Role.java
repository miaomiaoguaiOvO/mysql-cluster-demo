package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("role")
public class Role {
    @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;
    private String roleName;
    private String roleDetail;
    private Date createAt;
    private Date updateAt;
}
