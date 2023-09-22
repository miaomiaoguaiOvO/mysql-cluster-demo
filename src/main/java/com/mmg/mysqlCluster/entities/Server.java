package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("server")
public class Server {
    @TableId(value = "server_id", type = IdType.ASSIGN_ID)
    private Long serverId;
    private String serverIp;
    private String serverName;
    private String serverUsername;
    private String serverPassword;
    private String serverClientId;
    private String serverClientSecret;
    @JsonIgnore
    private Integer serverIndex;

}
