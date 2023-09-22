package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BoolEnum {
    NO(0,"否"),
    YES(1,"是");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    BoolEnum(Integer num, String desc){
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
