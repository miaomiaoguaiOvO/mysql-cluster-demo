package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BalanceRecordType {
    MERCHANT_CHARGE(0, "用户充值"),
    SYSTEM_CHARGE(1, "系统充值"),
    COUPON_ISSUED(2, "优惠券扣款"),
    COUPON_USED(3, "优惠券使用返还"),
    COUPON_EXPIRED(4, "优惠券过期返还"),
    COUPON_REFUND(5, "优惠券退款"),
    PARKING_USED(6, "停车费用抵扣"),
    MERCHANT_REFUND(7, "用户退款"),
    ORDER_REFUND(8, "停车订单退款")
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    BalanceRecordType(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
