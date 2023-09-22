package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/5/12
 * @Description:
 */
public enum LogTypeEnum {
    ADD(0, "添加"),
    EDIT(1, "修改"),
    DELETE(2, "删除"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    LogTypeEnum(Integer num, String desc) {
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
