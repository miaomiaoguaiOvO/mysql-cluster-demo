package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2021/12/17
 * @Description:
 */
public enum DateEnum {
    DAY(0, "今日"),
    WEEK(1, "本周"),
    MONTH(2, "本月"),
    YEAR(3, "今年"),
    SEASON(4, "本季"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    DateEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }
}
