package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/8/25
 * @Description: 黑白名单开启状态
 */
public enum WhiteBlackEnableEnum {
    NOT_ENABLE(0, "未启用"),
    WHITE(1, "白名单"),
    BLACK(2, "黑名单");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    WhiteBlackEnableEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getNum() {
        return num;
    }
}
