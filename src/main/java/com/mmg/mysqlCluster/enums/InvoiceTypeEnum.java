package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/2/23
 * @Description:
 */
public enum InvoiceTypeEnum {
    BLUE(0, "蓝票"),
    RED(1, "红票");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    InvoiceTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
