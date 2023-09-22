package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/6/27
 * @Description: 停车记录推送第三方平台枚举
 */
public enum PushPlatformEnum {

    YCTC(0, "甬城泊车"),
    THIRD_PARTY(1, "平台协议第三方"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PushPlatformEnum(Integer num, String desc) {
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
