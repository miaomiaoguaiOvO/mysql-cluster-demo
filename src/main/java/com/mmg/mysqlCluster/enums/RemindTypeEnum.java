package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/8/3
 * @Description:
 */
public enum RemindTypeEnum {
    INVOICE(0, "开具发票"),
    ;

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    RemindTypeEnum(Integer code, String desc) {
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
