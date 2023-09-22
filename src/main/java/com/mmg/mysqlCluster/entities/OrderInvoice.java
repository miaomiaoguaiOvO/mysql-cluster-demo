package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.InvoiceStatusEnum;
import com.mmg.mysqlCluster.enums.InvoiceSubjectEnum;
import com.mmg.mysqlCluster.enums.InvoiceTypeEnum;
import com.mmg.mysqlCluster.enums.OrderInvoiceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("order_invoice")
public class OrderInvoice {
    @TableId(value = "order_invoice_id", type = IdType.ASSIGN_ID)
    private Long orderInvoiceId;
    private Long userUnionId;
    private String orderId;
    private String invoiceSerialNum;
    private String taxNum;
    private InvoiceStatusEnum status;
    private String failCause;
    private String invoiceCode;
    private String invoiceNo;
    private Date invoiceTime;
    private String paperUrl;
    private String pdfUrl;
    private InvoiceTypeEnum invoiceType;
    private String invoiceTitle;
    private Integer pushMode;
    private String phoneNum;
    private String emailAddress;
    private BigDecimal invoiceAmountPrice;
    private InvoiceSubjectEnum invoiceSubjectType;
    private String buyerName;
    private String buyerTaxNum;
    private String buyerAddress;
    private String buyerPhone;
    private String buyerEmail;
    private String buyerAccount;
    private Long parkingLotId;
    private Long vehicleId;
    private BigDecimal payValue;
    private OrderInvoiceTypeEnum orderInvoiceType;
}
