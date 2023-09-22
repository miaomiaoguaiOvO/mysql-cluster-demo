package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/6/1
 * @Description:
 */
public enum DepartureTypeEnum {
    NORMAL_OUT(0, "临时车"),
    MEMBER_OUT(1, "业主车"),
    LEASE_OUT(2, "租赁车(含产权、人防)"),
    EXCEPTION_OUT(3, "异常车(无入场纪录)"),
    FORCED_OUT(4, "手动强制出场"),
    SYS_FORCED_OUT(5, "系统强制出场"),
    REMOTE_CONTROL_OUT(6, "遥控器开闸出场"),
    UNLICENSED(7, "无牌车扫码出场"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    DepartureTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getNum() {
        return num;
    }
}
