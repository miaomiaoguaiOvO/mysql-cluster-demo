package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/4/25
 * @Description:
 */
public enum OrderTypeEnum {

    DDXX(0,"点点行行"),
    YCTC(1,"涌城泊车"),
    THIRD_PARTY_PARTIAL(2,"第三方平台"),
    THIRD_PARTY_COMPLETE(3,"第三方平台"),
            ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    OrderTypeEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
