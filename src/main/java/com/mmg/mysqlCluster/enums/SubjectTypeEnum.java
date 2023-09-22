package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/1/20
 * @Description:
 */
public enum SubjectTypeEnum {
    COMMERCIAL_COMPLEX(0, "商业综合体"),
    OFFICE_BUILDING(1, "写字楼"),
    COMMUNITY(2, "小区"),
    HOTEL(3, "酒店"),
    SCENIC_SPOT(4, "景区"),
    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    SubjectTypeEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
