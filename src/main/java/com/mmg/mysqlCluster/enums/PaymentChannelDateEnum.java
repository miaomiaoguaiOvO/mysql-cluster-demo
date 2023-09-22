package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2021/12/21
 * @Description:
 */
public enum PaymentChannelDateEnum {
    ALL(0, "全部"),
    DAY(1, "今日"),
    MONTH(2, "本月"),
    SEASON(3, "本季"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PaymentChannelDateEnum(Integer num, String desc) {
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
