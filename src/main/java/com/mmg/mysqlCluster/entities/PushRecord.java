package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.ParkingRecordStatusEnum;
import com.mmg.mysqlCluster.enums.PushPlatformEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: fan
 * @Date: 2022/6/27
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("push_record")
public class PushRecord {
    @TableId(value = "push_record_id", type = IdType.ASSIGN_ID)
    private Long pushRecordId;
    private PushPlatformEnum pushPlatform;
    private Date pushTime;
    private Long parkingRecordId;
    private ParkingRecordStatusEnum pushType;
    private BoolEnum pushResult;

}
