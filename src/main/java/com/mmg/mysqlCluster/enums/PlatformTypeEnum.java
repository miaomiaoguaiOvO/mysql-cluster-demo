package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PlatformTypeEnum {
    WX_OPEN_USER(0,"微信公众号"),
    WX_MINI_USER(1,"微信小程序"),
    CASH_PAYMENT(2,"现金支付"),
    ALI_MINI_USER(10,"支付宝小程序"),
    APP_USER(20,"App"),
    YCTC(30,"甬城泊车"),
    THIRD_PARTY(40,"第三方平台"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    PlatformTypeEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
