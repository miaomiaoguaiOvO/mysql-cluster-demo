package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/2/6
 * @Description:
 */
public enum ReleaseTypeEnum {
    ABNORMAL_RELEASE(0,"异常放行"),
    CHARGE_RELEASE(1,"收费放行"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ReleaseTypeEnum(Integer num, String desc){
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
