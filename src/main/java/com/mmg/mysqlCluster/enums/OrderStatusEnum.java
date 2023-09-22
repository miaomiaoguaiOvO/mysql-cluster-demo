package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatusEnum {

    GENERATE(0,"订单生成"),
    WAIT(1,"待支付"),
    SUCCESS(2,"支付成功"),
    FAILED(3,"支付失败"),
    CLOSED(4,"交易关闭"),
    CANCELLED(5,"支付取消"),
    REFUNDED(6,"已退款"),
    PARTIAL_REFUNDED(7,"部分退款"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    OrderStatusEnum(Integer num, String desc){
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
