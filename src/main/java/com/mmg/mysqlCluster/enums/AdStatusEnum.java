package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/11/2
 * @Description: 广告状态
 */
public enum AdStatusEnum {

    UNDER_REVIEW(0, "审核中"),
    NOT_PASS(1, "审核未通过"),
    PASS(2, "审核通过"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    AdStatusEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }
}
