package com.mmg.mysqlCluster.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PayMethodEnum {
    WX_PAY(1, "微信"),
    ALI_PAY(2, "支付宝"),
    YINLIAN_PAY(3, "银联"),
    COUPON_PAY(4, "优惠券抵扣"),
    CASH_PAY(5, "线下支付"),
    YCTC(6, "甬城泊车"),
    THIRD_PARTY(7,"第三方平台"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PayMethodEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }
}
