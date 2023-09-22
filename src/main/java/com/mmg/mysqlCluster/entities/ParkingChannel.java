package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mmg.mysqlCluster.enums.BoolEnum;
import com.mmg.mysqlCluster.enums.ChannelTypeEnum;
import com.mmg.mysqlCluster.enums.WhiteBlackEnableEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("parking_channel")
public class ParkingChannel {
    @TableId(value = "channel_id", type = IdType.ASSIGN_ID)
    private Long channelId;
    private String channelName;
    private ChannelTypeEnum channelType;
    private String channelAddress;
    private Long parkingLotId;
    private Date createAt;
    private WhiteBlackEnableEnum whiteEnable;
    private Integer soundVolume;
    private BoolEnum parkingAisle;
    private BoolEnum unlicensedPass;
    private BoolEnum disableIccIssue;
    @JsonIgnore
    @TableLogic(value = "0", delval = "1")
    private Integer delFlag;

}
