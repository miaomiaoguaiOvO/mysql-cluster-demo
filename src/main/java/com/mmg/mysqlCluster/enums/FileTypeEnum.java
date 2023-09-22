package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2023/7/28
 * @Description:
 */
public enum FileTypeEnum {

    PIC(0, "图片"),
    VIDEO(1, "视频"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    FileTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

}
