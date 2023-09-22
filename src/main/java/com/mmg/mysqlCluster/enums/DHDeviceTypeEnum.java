package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author: fan
 * @Date: 2022/11/17
 * @Description: 设备类型枚举
 */
public enum DHDeviceTypeEnum {
    UNKNOW(0, "未知"),
    NET_DVR_NONREALTIME_MACE(1, "非实时MACE"),
    NET_DVR_NONREALTIME(2, "非实时"),
    NET_NVS_MPEG1(3, "网络视频服务器"),
    NET_DVR_MPEG1_2(4, "MPEG1二路录像机"),
    NET_DVR_MPEG1_8(5, "MPEG1八路录像机"),
    NET_DVR_MPEG4_8(6, "MPEG4八路录像机"),
    NET_DVR_MPEG4_16(7, "MPEG4十六路录像机"),
    NET_DVR_MPEG4_SX2(8, "LB系列录像机"),
    NET_DVR_MEPG4_ST2(9, "GB系列录像机"),
    NET_DVR_MEPG4_SH2(10, "HB系列录像机"),
    NET_DVR_MPEG4_GBE(11, "GBE系列录像机"),
    NET_DVR_MPEG4_NVSII(12, "II代网络视频服务器"),
    NET_DVR_STD_NEW(13, "新标准配置协议"),
    NET_DVR_DDNS(14, "DDNS服务器"),
    NET_DVR_ATM(15, "ATM机"),
    NET_NB_SERIAL(16, "二代非实时NB系列机器"),
    NET_LN_SERIAL(17, "LN系列产品"),
    NET_BAV_SERIAL(18, "BAV系列产品"),
    NET_SDIP_SERIAL(19, "SDIP系列产品"),
    NET_IPC_SERIAL(20, "IPC系列产品"),
    NET_NVS_B(21, "NVS B系列"),
    NET_NVS_C(22, "NVS H系列"),
    NET_NVS_S(23, "NVS S系列"),
    NET_NVS_E(24, "NVS E系列"),
    NET_DVR_NEW_PROTOCOL(25, "从QueryDevState中查询设备类型,以字符串格式"),
    NET_NVD_SERIAL(26, "解码器"),
    NET_DVR_N5(27, "N5"),
    NET_DVR_MIX_DVR(28, "混合DVR"),
    NET_SVR_SERIAL(29, "SVR系列"),
    NET_SVR_BS(30, "SVR-BS"),
    NET_NVR_SERIAL(31, "NVR系列"),
    NET_DVR_N51(32, "N51"),
    NET_ITSE_SERIAL(33, "ITSE 智能分析盒"),
    NET_ITC_SERIAL(34, "智能交通像机设备"),
    NET_HWS_SERIAL(35, "雷达测速仪HWS"),
    NET_PVR_SERIAL(36, "便携式音视频录像机"),
    NET_IVS_SERIAL(37, "IVS（智能视频服务器系列）"),
    NET_IVS_B(38, "通用智能视频侦测服务器"),
    NET_IVS_F(39, "人脸识别服务器"),
    NET_IVS_V(40, "视频质量诊断服务器"),
    NET_MATRIX_SERIAL(41, "矩阵"),
    NET_DVR_N52(42, "N52"),
    NET_DVR_N56(43, "N56"),
    NET_ESS_SERIAL(44, "ESS"),
    NET_IVS_PC(45, "人数统计服务器"),
    NET_PC_NVR(46, "pc-nvr"),
    NET_DSCON(47, "大屏控制器"),
    NET_EVS(48, "网络视频存储服务器"),
    NET_EIVS(49, "嵌入式智能分析视频系统"),
    NET_DVR_N6(50, "DVR-N6"),
    NET_UDS(51, "万能解码器"),
    NET_AF6016(52, "银行报警主机"),
    NET_AS5008(53, "视频网络报警主机"),
    NET_AH2008(54, "网络报警主机"),
    NET_A_SERIAL(55, "报警主机系列"),
    NET_BSC_SERIAL(56, "门禁系列产品"),
    NET_NVS_SERIAL(57, "NVS系列产品"),
    NET_VTO_SERIAL(58, "VTO系列产品"),
    NET_VTNC_SERIAL(59, "VTNC系列产品"),
    NET_TPC_SERIAL(60, "TPC系列产品, 即热成像设备"),
    NET_ASM_SERIAL(61, "无线中继设备"),
    NET_VTS_SERIAL(62, "管理机"),

    BAI_SHENG_CAMERA(1001, "百胜摄像头"),
    BAI_SHENG_INTERCOM(1002, "百胜对讲机"),
    ;

    @EnumValue
    private Integer code;
    @JsonValue
    private String desc;

    DHDeviceTypeEnum(Integer num, String desc) {
        this.code = num;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static DHDeviceTypeEnum getEnumByCode(Integer code) {
        for (DHDeviceTypeEnum status : DHDeviceTypeEnum.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return UNKNOW;
    }
}
