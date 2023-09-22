package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/5/15
 * @Description:
 */
public enum ReleaseReasonEnum {
    OFFICIAL_VEHICLE(0, "军、警等公务车辆"),
    CHARTER_CAR(1, "包月车"),
    RECORD_FAILURE(2, "记录异常，无入场匹配信息"),
    NOT_LIFT_AFTER_PAY(3, "缴费后未抬杆"),
    DEVICE_FAILURE_OR_TRAFFIC_PLUG(4, "因场地或其他故障原因导致交通堵塞"),
    OTHER(5, "其他原因"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ReleaseReasonEnum(Integer num, String desc) {
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
