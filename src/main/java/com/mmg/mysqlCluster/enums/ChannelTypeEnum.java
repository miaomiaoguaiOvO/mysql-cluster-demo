package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelTypeEnum {

    ENTRANCE(0, "入口"),
    EXPORT(1, "出口"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ChannelTypeEnum(Integer num, String desc) {
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
