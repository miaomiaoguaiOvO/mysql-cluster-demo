package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WeekEnum {
    Monday(0, "星期一"),
    Tuesday(1, "星期二"),
    Wednesday(2, "星期三"),
    Thursday(3, "星期四"),
    Friday(4, "星期五"),
    Saturday(5, "星期六"),
    Sunday(6, "星期日"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    WeekEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    public static WeekEnum getEnum(Integer num) {
        WeekEnum[] values = WeekEnum.values();
        for (WeekEnum value : values) {
            if (value.getNum().equals(num)) {
                return value;
            }
        }
        return Monday;
    }
}
