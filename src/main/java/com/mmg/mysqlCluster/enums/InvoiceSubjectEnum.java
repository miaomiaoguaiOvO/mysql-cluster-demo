package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;


public enum InvoiceSubjectEnum {
    PERSONAL(0, "个人"),
    ENTERPRISE(1, "企业");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    InvoiceSubjectEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
