package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/11/2
 * @Description: 广告类型
 */
public enum AdTypeEnum {


    DEFAULT(0,"平台"),

    PARKING(1,"停车场"),

    AREA(2,"区域"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    AdTypeEnum(Integer num, String desc) {
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
