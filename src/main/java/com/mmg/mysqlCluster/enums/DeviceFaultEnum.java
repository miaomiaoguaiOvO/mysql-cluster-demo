package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/7/14
 * @Description:
 */
public enum DeviceFaultEnum {

    ENCODER_EXCEPTION(22008, "编码器信号异常"),
    MOTOR_RUNNING_TIMEOUT(22009, "电机运行超时"),
    MOTOR_STALL(22010, "电机堵转"),
    INFRARED_BLOCKED(22011, "红外被物体挡住"),
    PRESSURE_WAVE_BLOCKED(22012, "压力波被物体挡住"),
    RELAY_EXCEPTION(22013, "继电器异常"),
    DEVICE_RUNNING_TIMEOUT(22014, "设备运行超时"),
    OPEN_SLUICE_BLOCKED(22015, "开闸运行时遇阻"),
    COMMUNICATION_FAIL(22016, "内部通讯故障"),
    DISPLAY_EXCEPTION(22017, "显示屏异常"),
    ABNORMAL_POWER(22018, "电源异常"),

    ;

    @EnumValue
    private Integer num;
    @JsonValue
    private String desc;

    DeviceFaultEnum(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    public static DeviceFaultEnum getEnum(Integer num) {
        DeviceFaultEnum[] values = DeviceFaultEnum.values();
        for (DeviceFaultEnum value : values) {
            if (value.getNum().equals(num)) {
                return value;
            }
        }
        return null;
    }
}
