package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/8/8
 * @Description:
 */
public enum NotOpenReasonEnum {
    REMAIN_NULL(0, "车位已满"),
    NOT_WHITE_LIST(1, "非白名单车辆"),
    UNLICENSED(2, "请扫码"),
    OCCUPIED(3, "车位已占"),
    LEASE_ONLY(4, "限租赁车可进"),
    PLATE_NUM_INCORRECT(5, "车牌格式有误"),
    ;

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String desc;

    NotOpenReasonEnum(Integer code, String desc) {
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
