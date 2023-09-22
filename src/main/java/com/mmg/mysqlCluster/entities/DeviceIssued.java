package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.DeviceIssuedEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "device_issued")
public class DeviceIssued {
    @TableId(value = "device_issued_id",type = IdType.ASSIGN_ID)
    private Long deviceIssuedId;
    private Long deviceId;
    private DeviceIssuedEnum issuedType;
    private String issuedFilePath;
    private String issuedFileName;
    private String issuedText;
    private BoolEnum issuedFlag;
}
