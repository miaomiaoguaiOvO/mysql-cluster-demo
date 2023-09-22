package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/5/24
 * @Description:
 */
@Data
@TableName("order_invoice_notice")
public class OrderInvoiceNotice {
    @TableId(value = "invoice_notice_id", type = IdType.ASSIGN_ID)
    private Long invoiceNoticeId;
    private String invoiceNoticePhone;
    private Long shopInvoiceId;
    private Date bindTime;
}