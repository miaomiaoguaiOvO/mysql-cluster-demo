package com.mmg.mysqlCluster.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 
 * @Author: Xu Kejia
 * @Date: 2022年1月13日
 * @Description: 发票状态描述，来自诺诺文档
 *  2 :开票完成（ 最终状 态），
 *  其他状态分别为: 20:开票中; 
 *  21:开票成功签章中;
 *  22:开票失败;
 *  24: 开票成功签章失败;
 *  3:发票已作废 31: 发票作废中 
 *  备注：22、24状态时，无需再查询，请确认开票失败原因以及签章失败原因；3、31只针对纸票
 */
public enum InvoiceStatusEnum {
    NOT_INVOICED("0","未开票"),
	SUCCESS("2","开票完成"),
	INVOICING("20","开票中"),
	SIGNING("21","开票成功签章中"),
	FAIL("22","开票失败"),
	SIGN_FAIL("24","开票成功签章失败"),
	INVALID("3","发票已作废"),
	INVALIDING("31","发票作废中");
	
	@EnumValue
    private String code;
    @JsonValue
    private String desc;

    InvoiceStatusEnum(String num, String desc) {
        this.code = num;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public static InvoiceStatusEnum getEnumByCode(String code){
        for (InvoiceStatusEnum status : InvoiceStatusEnum.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return FAIL;
    }
}
