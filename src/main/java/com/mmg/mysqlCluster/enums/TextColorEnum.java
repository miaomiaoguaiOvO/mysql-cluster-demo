package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/12/9
 * @Description: 屏幕显示下发的文本颜色
 */
public enum TextColorEnum {
    GREEN(0, "绿色"),
    RED(1, "红色"),
    YELLOW(2, "黄色"),
    ;

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    TextColorEnum(Integer code, String desc) {
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
