package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeUnitEnum {
    MINUTE(1,"分钟"),
    HOUR(2,"小时");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    TimeUnitEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum(){
        return num;
    }
}
