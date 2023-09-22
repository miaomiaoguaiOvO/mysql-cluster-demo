package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CouponTypeEnum {

    PER_TIME_UNIT(0, "按时间"),
    PER_CHARGE(1, "按金额"),
    ONCE_CHARGE(2, "单次免费")
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    CouponTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
