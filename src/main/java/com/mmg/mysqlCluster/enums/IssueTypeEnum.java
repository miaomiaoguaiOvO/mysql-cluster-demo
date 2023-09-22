package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/8/5
 * @Description:
 */
public enum IssueTypeEnum {
    STATIC(0, "普通状态"),
    DYNAMIC(1, "过车状态"),
    VOICE(2, "语音播报"),
    ;

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    IssueTypeEnum(Integer code, String desc) {
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
