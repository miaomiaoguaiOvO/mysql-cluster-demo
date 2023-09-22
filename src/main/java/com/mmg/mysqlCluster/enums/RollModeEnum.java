package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/12/9
 * @Description: 滚动模式
 */
public enum RollModeEnum {
    NO(0, "不滚动"),
    LEFT_RIGHT(1, "左右滚动"),
    UP_DOWN(2, "上下翻页滚动"),
    CUT_OUT(3, "截取（超出部分直接截断显示）"),
    ;

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    RollModeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
