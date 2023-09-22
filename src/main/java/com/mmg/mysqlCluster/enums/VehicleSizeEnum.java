package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VehicleSizeEnum {

    SMALL(1, "小型车"),
    LARGE(2, "大型车"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    VehicleSizeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static VehicleSizeEnum getEnum(Integer num) {
        VehicleSizeEnum[] values = VehicleSizeEnum.values();
        for (VehicleSizeEnum value : values) {
            if (value.getNum().equals(num)) {
                return value;
            }
        }
        return null;
    }
}
