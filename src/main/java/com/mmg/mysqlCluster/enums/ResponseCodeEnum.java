package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponseCodeEnum {
    SUCCESS(0, "成功"),
    FAIL(1, "失败"),
    BAD_REQUEST(400, "参数缺失"),
    ILLEGAL_ARGUMENT(401, "参数不合法"),
    ACCESS_DENIED(403, "token无效，拒绝访问"),
    METHOD_NOT_ALLOWED(405, "请求方法错误"),
    ACCOUNT_FREEZE(406, "账号已冻结"),
    INTERNAL_ERROR(500, "内部错误"),
    INSERT_FAIL(506, "添加失败"),
    UPDATE_FAIL(507, "修改失败"),
    DELETE_FAIL(508, "删除失败"),
    DUPLICATE_REQUEST(510, "重复请求，请稍后再试"),
    QUERY_TOO_MANY_RESULTS(511, "查询结果过多，请完善查询条件"),

    THIRD_PARTY_AUTH_FAIL(101, "第三方平台鉴权失败"),
    THIRD_PARTY_ACCESS_TOKEN_FAIL(102, "第三方获取access token失败"),
    THIRD_PARTY_PLATE_NUM_MISSING(103,"车牌号缺失"),
    THIRD_PARTY_OUT_TRADE_ID_MISSING(104,"第三方订单号缺失"),
    THIRD_PARTY_OUT_TRADE_ID_REPEATED(0,"第三方订单号重复上送"),
    THIRD_PARTY_PARKING_NOT_BIND(105,"账号未绑定该停车场"),
    THIRD_PARTY_VEHICLE_LEASE_NOT_EXIST(106,"固定车不存在"),

    THIRD_PARTY_WRONG_ACCESS_TOKEN(101,"第三方token异常"),
    THIRD_PARTY_DECRYPTION_ERROR(102,"数据解密失败"),
    THIRD_PARTY_VERIFICATION_FAIL(103,"数据验签不通过"),

    PARKING_PRICE_NOT_EXIST(201, "未设置收费标准"),
    PARKING_NOT_EXIST(202, "停车场不存在"),
    PARKING_SERVER_NOT_EXIST(203, "停车场服务器未知"),
    PARKING_PRICE_NOT_COMPLETE(204, "收费标准不完整"),
    PARKING_PRICE_ILLEGAL(205, "收费标准不合法"),
    PARKING_PRICE_MAX_INVALID(206, "单日最高收费金额设置过高"),
    PARKING_PRICE_SAME_VERSION_EXIST(207, "已设置同类型收费标准，请勿重复添加"),
    DEVICE_PARKING_BING_EXIST(208, "该出入口已绑定其他停车场"),
    PARKING_CHANNEL_NOT_EXIST(209, "该出入口不存在"),
    PARKING_LOT_EXIST(210, "停车场已存在"),
    PARKING_RECORD_ROLLBACK_FAIL(211, "停车状态回滚失败"),
    PARKING_ICC_NOT_EXIST(212, "ICC停车场不存在"),
    PARKING_LOT_LESS_ZERO(213, "车位不足"),
    PARKING_VEHICLE_NOT_IDENTIFY(214, "未识别到车辆"),
    DEVICE_CHANNEL_EXIST(215, "该设备已绑定出入口"),
    CHANNEL_VEHICLE_EXIST(216, "出入口白名单已添加该车辆"),
    CHANNEL_VEHICLE_EXPIRED(217, "非白名单车辆或已过期"),
    PARKING_LOT_NOT_EXIST(218, "停车场不存在"),
    PARKING_IDLE_MORE_THAN_TOTAL(219, "余位大于总停车位"),
    PARKING_FIXED_MORE_THAN_TOTAL(220, "固定车位大于总停车位"),
    WS_TALK_EXIST(221, "该设备正在通话中"),
    WS_TALK_ILLEGAL(222, "非法talkId"),
    SERVER_BUSY(221, "服务器忙,请稍后再试"),
    ADVICE_NOT_EXIST(222, "反馈不存在"),
    SEAT_GROUP_NOT_FOUND(223, "分组不存在"),
    PARKING_SEAT_GROUP_QUANTITY_LIMIT(224, "超过车位组数量限制"),
    BLACK_WHITE_CONFLICT(225, "黑白名单冲突"),
    OVER_TIME_SPAN(256, "超过时间限制"),
    INCORRECT_TIME(257, "时间有误"),
    ICC_TALK_ILLEGAL(258, "发起通话失败"),
    START_TIME_LATER_THAN_END_TIME(259, "开始时间晚于结束时间"),

    DEVICE_EXIST(301, "该设备已存在"),
    DEVICE_NOT_EXIST(302, "该设备不存在"),
    SERVER_NOT_EXIST(303, "该服务器不存在"),
    MANUAL_OPENING_FAIL(304, "开闸失败"),
    SERVER_EXIST(305, "该服务器已存在"),
    DEVICE_TYPE_ERROR(306, "设备类型错误"),
    DEVICE_ISSUED_LIMIT(306, "请先删除部分文件"),
    SERVER_CONNECTION_FAILED(307, "服务器连接失败"),
    ICC_CLIENT_CONNECTION_FAIL(308, "icc请求失败，请重试"),
    SOUND_VOLUME_ILLEGAL(309, "音量范围为0-100"),
    FILE_IS_PLAY(310, "删除文件前请先确保文件已移出播放列表"),
    DEVICE_NOT_SUPPORT_PLAY(311, "该设备不支持投放文件"),
    REMOTE_FILE_DELETE_ERROR(312, "文件删除失败"),
    SET_DISPLAY_ERROR(313, "显示设置失败"),
    REMOTE_IP_EXIST(314, "该IP已存在"),

    ROLE_EXIST(601, "该权限已存在"),
    ROLE_NOT_EXIST(602, "该权限不存在"),
    ROLE_USED(603, "权限已被使用"),


    PLATE_NUM_INVALID(1101, "车牌格式有误"),
    BIND_CAR_TOO_MANY(1102, "每个账号最多绑定10辆车"),
    PHONE_NUM_INVALID(1103, "手机号格式错误"),
    USER_NOT_FOUND(1104, "未找到该用户"),
    PLATE_BUN_EXIST(1105, "车牌已存在"),
    PRICE_NOT_EXIST(1106, "停车场暂无该收费标准"),
    VEHICLE_PRICE_EXIST(1107, "已绑定该停车场套餐"),
    PARKING_SERVER_EXIST(1108, "该服务器信息已存在"),
    PARKING_VEHICLE_LEASE_EXIST(1109, "该车辆已经绑定停车场套餐"),
    PARKING_VEHICLE_LEASE_NOT_EXIST(1110, "该车辆套餐不存在"),
    PARKING_VEHICLE_EXIST(1111, "该车辆已在场内"),
    PARKING_VEHICLE_NOT_EXIST(1112, "车辆不在场内，请确认输入车牌是否正确"),
    VEHICLE_NOT_EXIST(1113, "未找到该车辆"),
    VEHICLE_AUTO_DEDUCT_EXIST(1114, "该车辆已绑定自动扣费"),
    COUPON_ISSUE_PLAN_NOT_EXIST(1115, "系统发放计划不存在"),
    MERCHANT_FREE_CAR_EXIST(1116, "该挂单车已存在"),
    MERCHANT_FREE_CAR_NOT_EXIST(1117, "该挂单车不存在"),
    AVAILABLE_EXCEED_RELEASE(1118, "可用金额不能超过发放金额"),
    COUPON_ISSUE_PLAN_ISSUED(1119,"已发放当月优惠券"),
    COUPON_ISSUE_PLAN_ISSUE_NOT_ALLOWED(1120,"非创建当月无法执行发放计划"),
    THIRD_PARTY_LEASE_CANNOT_MODIFY(1121,"第三方租赁无法修改"),
    WALLET_INSUFFICIENT_BALANCE(1200, "钱包余额不足"),
    VALIDATE_CODE_INCORRECT(1201, "验证码有误"),

    PARKING_ORDER_NOT_EXIST(2001, "未找到订单号对应订单"),
    RSA_CRYPT_ERROR(2002, "RSA信息配置错误"),
    SIGN_VERIFICATION_ERROR(2003, "支付验签失败"),
    PAYMENT_ERROR(2004, "交易失败"),
    WX_JSAPI_ERROR(2005, "微信签名错误"),
    REFUND_AMOUNT_TOO_MUCH(2006, "退款金额不能超过支付金额"),
    PARKING_RECORD_NOT_EXIST(2007, "停车记录不存在"),
    PARKING_NO_NEED_TO_PAY(2008, "无需支付停车费"),
    PARKING_COUPON_NOT_EXIST(2009, "未找到对应的停车优惠券"),
    PARKING_COUPON_AVAILABLE_NUM_ZERO(2010, "停车优惠券剩余张数0"),
    USER_COUPON_LIMIT_EXCEED_MAXIMUM(2011, "该优惠券领取数量已到上限"),
    USER_COUPON_USED(2012, "优惠券已使用"),
    USER_COUPON_EXPIRED(2013, "优惠券已过期"),
    MERCHANT_ACCOUNT_INSUFFICIENT_BALANCE(2014, "商户账号可用余额不足"),
    PARKING_COUPON_QRCODE_FORMAT_ERROR(2015, "二维码格式错误"),
    PARKING_COUPON_QRCODE_EXPIRED(2016, "二维码已失效"),
    FAIL_TO_GET_OPENID(2017, "获取openid失败"),
    PLEASE_LEAVE(2018, "请出场"),
    PASSWORD_MISMATCH(2020, "密码不匹配"),
    INVALID_REFUND_AMOUNT(2021, "退款金额不能为0"),
    REFUNDING_PLEASE_WAIT(2022, "退款申请中，请稍后"),
    UNLICENSED_CAR_PAY_AT_DOOR(2023, "无牌车请在道闸口扫码支付"),
    AUTO_RELEASE_COUPON_CANNOT_CHANGE(2024, "无法更改系统优惠券"),
    PARKING_GROUP_RECORD_NOT_EXIST(2025, "联合停车记录不存在"),
    CAR_TOO_MANY(2026,"每次请求车牌不能大于500个，请分包处理"),
    PAY_AMOUNT_ZERO(2027,"订单金额必须大于0"),
    NEW_PASSWORD_SAME(2028,"新旧密码一致"),
    ORDER_CANNOT_BE_CANCELLED(2029,"订单无法取消"),

    FILE_NULL(2201, "文件为空"),
    FILE_TOO_LARGE(2202, "文件大小不能超过10M"),
    FILE_EXTENSION_INVALID(2203, "文件格式不正确"),
    FILE_UPLOAD_ERROR(2204, "文件上传失败"),
    FILE_NOT_EXIST(2205, "文件不存在"),
    FILE_EXPORT_EXIST(2206, "导出失败"),
    NO_DATA_TO_EXPORT(2207, "没有数据可导出"),
    FILE_NAME_WRONGFUL(2208, "文件名不合法"),
    FILE_MD5_ERROR(2209, "md5计算错误"),
    VIDEO_INFO_READ_ERROR(2210, "视频信息读取失败"),
    FILE_READ_ERROR(2211, "文件读取失败"),

    ORDER_REFUND_REQUEST_SUBMITTED(3001, "订单退款申请已提交"),
    ORDER_REFUND_NOT_FOUND(3002, "未找到退款申请"),
    ORDER_REFUND_HANDLED(3003, "订单退款申请已处理"),

    INVOICE_REQUEST_FAIL(3301, "开票申请失败"),
    INVOICE_NOT_ALLOWED(3302, "停车场未授予平台开票权限或未填写销方税号"),
    INVOICE_DELIVERY_FAIL(3303, "发票重新交付失败"),
    INVOICE_AUTH_FREQUENT(3304, "授权过于频繁，请稍后再试"),
    INVOICE_ORDER_NOT_PAY(3305, "订单未支付或已退款"),
    INVOICE_INFO_GET_ERROR(3306, "获取发票信息失败"),
    INVOICE_EXIST(3307, "重复开票"),
    CHILD_ORDER_CANNOT_INVOICE(3308,"子订单无法开票"),
    INVOICE_RED_EXIST(3309, "该发票已冲红"),
    INVOICE_CANT_CANCEL(3310, "该发票不是蓝票或未开票成功"),
    INVOICE_WAITING(3311, "等待开票中，请稍后查看"),
    INVOICE_CLOSE(3312, "账单结算中，请在三个工作日后重试"),
    INVOICE_NOT_EXIST(3313,"开票主体缺失"),
    INVOICE_HAS_EXIST(3314, "税号重复"),
    INVOICE_NOT_CONSISTENT(3315,"开票主体不一致，无法合并开票"),
    INVOICE_CONTENT_EMPTY(3316,"开票内容为空"),
    INVOICE_AMOUNT_OVER(3317,"开票金额不能超过999.99元"),

    NOT_AUTHORIZED(4001, "无权操作"),
    NOT_ADMIN_AUTHORIZED(4002, "停车场管理员仅能导出半年内的数据"),

    USER_EXIST(4101, "用户已存在"),
    USER_NOT_EXIST(4102, "用户不存在"),

    METHOD_ERROR(10001, "方法配置错误"),
    JSON_PARSE_ERROR(10002, "协议格式错误，无法解析json"),

    ;

    @EnumValue
    private Integer code;
    @JsonValue
    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ResponseCodeEnum getEnum(Integer code) {
        ResponseCodeEnum[] values = ResponseCodeEnum.values();
        for (ResponseCodeEnum value : values) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return FAIL;
    }


}
