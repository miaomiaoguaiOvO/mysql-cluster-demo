package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UseFlagEnum {
    NOT_USED(0,"未使用"),
    USED(1,"已使用"),
    SUSPENDED(2,"已锁定"),
    EXPIRED(3,"已过期"),
    REFUNDED(4,"已退款");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    UseFlagEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum(){
        return num;
    }
}
