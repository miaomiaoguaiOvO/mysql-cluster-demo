package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/1/19
 * @Description:
 */
public enum PropertyTypeEnum {
    PROPERTY(0, "产权"),
    CIVIL_DEFENSE(1, "人防"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PropertyTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

}
