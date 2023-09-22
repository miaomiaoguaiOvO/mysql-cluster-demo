package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ParkingLotTypeEnum {
    UNDERGROUND(0, "地下停车场"),
    GROUND(1, "地面停车场"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ParkingLotTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
