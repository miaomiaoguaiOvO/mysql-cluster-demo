package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2021/12/1
 * @Description:
 */
public enum DeviceTypeEnum {
    CAMERA(0, "摄像头"),
    DISPLAY(1, "显示器"),
    BARRIER(2, "道闸"),
    TALK(3,"对讲"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    DeviceTypeEnum(Integer num, String desc) {
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

    public static DeviceTypeEnum getEnum(Integer num) {
        DeviceTypeEnum[] values = DeviceTypeEnum.values();
        for (DeviceTypeEnum value : values) {
            if (value.getNum().equals(num)) {
                return value;
            }
        }
        return null;
    }
}
