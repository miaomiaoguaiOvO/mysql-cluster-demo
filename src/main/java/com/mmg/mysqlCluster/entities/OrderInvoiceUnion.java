package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@TableName("order_invoice_union")
public class OrderInvoiceUnion {
    @TableId(value = "invoice_union_id", type = IdType.ASSIGN_ID)
    private Long invoiceUnionId;
    private String invoiceRequestId;
    private String actualOrderId;
    private Date createdAt;
}
