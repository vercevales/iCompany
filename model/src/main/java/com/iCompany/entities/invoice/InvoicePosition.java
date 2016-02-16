package com.iCompany.entities.invoice;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Lukasz Franczuk on 14.02.16.
 */
@Entity
@Table(name = "INVOICE_POSITION", schema = "PUBLIC")
public class InvoicePosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_POSITION_ID", unique = true, nullable = false)
    private Long invoicePositionId;

    @Column(name = "POSITION_NAME")
    private Integer positionNumber;

    @Column(name = "SERVICE_PRODUCT_NAME")
    private String serviceProductName;

    @Column(name = "SERVICE_PRODUCT_AMOUNT")
    private Integer serviceProductAmount;

    @Column(name = "SERVICE_PRODUCT_PRICE_NET")
    private BigDecimal serviceProductPriceNet;

    @Column(name = "SERVICE_PRODUCT_PRICE_GROSS")
    private BigDecimal serviceProductPriceGross;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VAT_RATE_ID")
    private VATRate vatRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
    private Invoice invoice;

    public Long getInvoicePositionId() {
        return invoicePositionId;
    }

    public void setInvoicePositionId(Long invoicePositionId) {
        this.invoicePositionId = invoicePositionId;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getServiceProductName() {
        return serviceProductName;
    }

    public void setServiceProductName(String serviceProductName) {
        this.serviceProductName = serviceProductName;
    }

    public Integer getServiceProductAmount() {
        return serviceProductAmount;
    }

    public void setServiceProductAmount(Integer serviceProductAmount) {
        this.serviceProductAmount = serviceProductAmount;
    }

    public BigDecimal getServiceProductPriceNet() {
        return serviceProductPriceNet;
    }

    public void setServiceProductPriceNet(BigDecimal serviceProductPriceNet) {
        this.serviceProductPriceNet = serviceProductPriceNet;
    }

    public BigDecimal getServiceProductPriceGross() {
        return serviceProductPriceGross;
    }

    public void setServiceProductPriceGross(BigDecimal serviceProductPriceGross) {
        this.serviceProductPriceGross = serviceProductPriceGross;
    }

    public VATRate getVatRate() {
        return vatRate;
    }

    public void setVatRate(VATRate vatRate) {
        this.vatRate = vatRate;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
