package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2021/12/15
 * @Description:
 */
public enum LeaseTypeEnum {

    YEAR(0, "按年"),
    MONTH(1, "按月"),
    DAY(2, "按日"),
    PERMANENT(3, "永久"),
    MEMBER(10, "业主"),
    THIRD_PARTY(11,"第三方");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    LeaseTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }
}
