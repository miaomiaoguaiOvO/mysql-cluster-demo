package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TpPayMethodEnum {
    WEIXIN(0,"微信支付"),
    PARKING_COUPON(1,"停车券"),
    POINTS_DEDUCT(2,"积分抵扣"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    TpPayMethodEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc(){
        return desc;
    }

    public static TpPayMethodEnum getPayMethod(Integer num){
        if(num == null)  return null;
        for(TpPayMethodEnum method : TpPayMethodEnum.values()){
            if(method.getNum().equals(num)){
                return method;
            }
        }
        return null;
    }
}
