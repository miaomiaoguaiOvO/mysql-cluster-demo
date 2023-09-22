package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiftTypeEnums {

    SYSTEM(0, "系统"),
    ARTIFICIAL(1, "人为"),
    REMOTE_CONTROL(2, "遥控"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    LiftTypeEnums(Integer num, String desc) {
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
