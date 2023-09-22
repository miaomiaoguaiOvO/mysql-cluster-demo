package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VehicleTypeEnum {
    FUEL(0, "普通"),
    NEW_ENERGY(1, "新能源"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    VehicleTypeEnum(Integer num, String desc) {
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
