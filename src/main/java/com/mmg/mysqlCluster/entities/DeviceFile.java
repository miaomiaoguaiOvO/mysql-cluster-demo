package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BoolEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/4/21
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "device_file")
public class DeviceFile {
    @TableId(value = "device_file_id", type = IdType.ASSIGN_ID)
    private Long deviceFileId;
    private Long deviceId;
    private String fileName;
    private String fileMdCode;
    private Date createAt;
    private BoolEnum playFlag;
    private Integer playIndex;
}
