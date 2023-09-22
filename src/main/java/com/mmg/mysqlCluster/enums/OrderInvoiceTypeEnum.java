package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/5/22
 * @Description:
 */
public enum OrderInvoiceTypeEnum {
    PARKING_ORDER_INVOICE(0, "停车订单"),
    MERCHANT_ORDER_INVOICE(1, "商户充值订单");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    OrderInvoiceTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
