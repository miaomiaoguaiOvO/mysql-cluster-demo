package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/11/9
 * @Description:
 */
public enum AdPublishStatusEnum {

    CLOSED(0, "已下架"),
    PUBLISHED(1, "已发布"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    AdPublishStatusEnum(Integer num, String desc) {
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
