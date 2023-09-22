package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PriceTypeEnum {
    PER_TIME_UNIT(0,"按时长收费"),
    CHARGE_ONCE(1,"按次收费"),
    COMBINED(2,"组合收费");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PriceTypeEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }
}
