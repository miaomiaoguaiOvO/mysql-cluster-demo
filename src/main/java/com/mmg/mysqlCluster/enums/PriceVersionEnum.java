package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PriceVersionEnum {
    NORMAL(0,"普通"),
    MEMBER(1,"业主"),
    TEMP(2,"临时"),//给阪急用，该类型下可有多个收费规则
    CHARGE(3,"充电");//充电车辆收费规则

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PriceVersionEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }
}
