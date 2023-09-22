package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/2/15
 * @Description: 显示器下发
 */
public enum DeviceIssuedEnum {

    LOGO(0, "Logo"),
    VIDEO_OR_IMG(1, "视频或图片"),
    TEXT(2, "文字");

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    DeviceIssuedEnum(Integer num, String desc) {
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
