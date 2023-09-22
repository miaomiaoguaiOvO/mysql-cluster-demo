package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/11/2
 * @Description: 广告位置
 */
public enum AdPositionEnum {

    HOME(0,"首页活动"),
    PAYMENT(1,"支付广告"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    AdPositionEnum(Integer num, String desc) {
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
