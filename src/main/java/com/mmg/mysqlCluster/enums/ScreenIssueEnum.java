package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Auther: fan
 * @Date: 2022/8/4
 * @Description:
 */
public enum ScreenIssueEnum {

    DDXX(0, null, "点点行行", false, null, null),
    PLATE_NUM(1, null, "车牌号", false, null, IssueTypeEnum.DYNAMIC),
    VEHICLE_TYPE(2, null, "车辆类型", false, null, IssueTypeEnum.DYNAMIC),
    EXPRIATION_TIME(3, null, "过期时间", false, null, IssueTypeEnum.DYNAMIC),
    CHARGE_AMOUNT(4, ChannelTypeEnum.EXPORT, "收费金额", false, null, IssueTypeEnum.DYNAMIC),
    PARKING_TIME(5, ChannelTypeEnum.EXPORT, "停车时长", false, null, IssueTypeEnum.DYNAMIC),
    ARRIVE_TIME(6, null, "入场时间", false, null, IssueTypeEnum.DYNAMIC),
    PARKING_LOT_NAME(7, null, "停车场名称", false, null, null),
    REMAIN_PARKING_SPACE(8, null, "剩余车位", false, null, null),
    CURRENT_DATE(9, null, "当前日期", false, null, null),
    CURRENT_TIME(10, null, "当前时间", false, ScreenTypeEnum.LED, null),
    WEEK_TIME(11, null, "当前星期", false, ScreenTypeEnum.LED, null),
    WELCOME(12, null, "欢迎光临", false, null, null),
    SAFE_JOURNEY(13, ChannelTypeEnum.EXPORT, "一路平安", false, null, null),
    WELCOME_TO_USE(14, null, "欢迎使用", false, null, null),
    LEAVE_TIME(15, ChannelTypeEnum.EXPORT, "出场时间", false, null, IssueTypeEnum.DYNAMIC),
    NOT_OPEN_REASON(16, null, "不开闸原因", true, null, IssueTypeEnum.DYNAMIC),
    CUSTOM(17, null, "自定义", false, null, null),
    ;

    @EnumValue
    private final Integer code;
    private final ChannelTypeEnum channelType;
    @JsonValue
    private final String desc;
    private final Boolean primary;
    private final ScreenTypeEnum screenType;
    private final IssueTypeEnum issueType;

    ScreenIssueEnum(Integer code, ChannelTypeEnum channelType, String desc, Boolean primary, ScreenTypeEnum screenType, IssueTypeEnum issueType) {
        this.code = code;
        this.channelType = channelType;
        this.desc = desc;
        this.primary = primary;
        this.screenType = screenType;
        this.issueType = issueType;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public ChannelTypeEnum getChannelType() {
        return channelType;
    }

    public ScreenTypeEnum getScreenType() {
        return screenType;
    }

    public IssueTypeEnum getIssueType() {
        return issueType;
    }

    public static ScreenIssueEnum getEnumByCode(Integer code) {
        for (ScreenIssueEnum value : ScreenIssueEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return ScreenIssueEnum.DDXX;
    }
}
