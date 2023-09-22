package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ParkingRecordStatusEnum {
    PRE_ARRIVAL(0, "预入场"),
    ARRIVAL(1, "确认入场"),
    PRE_DEPARTURE(2, "预出场"),
    DEPARTURE(3, "确认出场"),
    EXCEPTION_RECORD(4, "异常出场"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ParkingRecordStatusEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }
}
