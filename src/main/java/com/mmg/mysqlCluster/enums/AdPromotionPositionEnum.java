package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/7/31
 * @Description:
 */
public enum AdPromotionPositionEnum {
    HOME(0, "首页"),
    LIFE(1, "车主生活"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    AdPromotionPositionEnum(Integer num, String desc) {
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
