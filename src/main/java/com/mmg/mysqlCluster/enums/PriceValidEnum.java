package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2021/12/15
 * @Description:
 */
public enum PriceValidEnum {

    VALID(0, "正常"),
    EXPIRED(1, "过期"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PriceValidEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
