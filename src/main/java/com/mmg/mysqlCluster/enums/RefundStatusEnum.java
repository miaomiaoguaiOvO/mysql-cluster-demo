package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RefundStatusEnum {
    APPLIED(0,"申请退款中"),
    APPROVED(1,"已同意"),
    REJECTED(2,"已拒绝")
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    RefundStatusEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public Integer getNum() {
        return num;
    }
}
