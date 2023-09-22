package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/12/13
 * @Description:
 */
public enum ScreenTypeEnum {
    UNKNOWN(0,"无"),
    LED(1,"LED"),
    LCD(2,"LCD");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    ScreenTypeEnum(Integer num, String desc){
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum(){
        return num;
    }

    public String getDesc() {
        return desc;
    }
}
