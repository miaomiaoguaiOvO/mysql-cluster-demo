package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRoleEnum {
    WEB_ADMIN(0,"超级管理员"),
    PARKING_ADMIN(1,"停车场管理员"),
    MERCHANT(2,"商户"),
    MERCHANT_UNION(3,"联合停车场商户");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    UserRoleEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }
}
