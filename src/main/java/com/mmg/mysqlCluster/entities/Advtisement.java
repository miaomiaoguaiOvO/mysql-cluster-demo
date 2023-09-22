package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.AdPositionEnum;
import com.mmg.mysqlCluster.enums.AdPublishStatusEnum;
import com.mmg.mysqlCluster.enums.AdStatusEnum;
import com.mmg.mysqlCluster.enums.AdTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2022/11/2
 * @Description:
 */
@TableName("advtisement")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Advtisement {
    @TableId(value = "advtisement_id", type = IdType.ASSIGN_ID)
    private Long advtisementId;
    private String advtisementName;
    private AdTypeEnum advtisementType;
    private Integer advtisementIndex;
    private AdStatusEnum advtisementStatus;
    private AdPublishStatusEnum publishStatus;
    private AdPositionEnum advtisementPosition;
    private String remarks;
    private Long parkingLotId;
    private Long areaId;
    private String fileName;
    private Date createAt;
    private Long userId;
    private String url;
    private Long picFileId;
}
