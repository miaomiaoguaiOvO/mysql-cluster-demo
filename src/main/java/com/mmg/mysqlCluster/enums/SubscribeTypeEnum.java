package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/8/11
 * @Description:
 */
public enum SubscribeTypeEnum {

    SCREEN(0, "大屏"),
    TALK(1, "通话");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    SubscribeTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public static SubscribeTypeEnum getByNum(Integer num) {
        for (SubscribeTypeEnum subscribeTypeEnum : SubscribeTypeEnum.values()) {
            if (subscribeTypeEnum.getNum().equals(num)) {
                return subscribeTypeEnum;
            }
        }
        return SCREEN;
    }
}
