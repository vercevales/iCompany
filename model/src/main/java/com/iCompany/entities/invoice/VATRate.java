package com.iCompany.entities.invoice;

import javax.persistence.*;

/**
 * Created by Lukasz Franczuk on 14.02.16.
 */
@Entity
@Table(name = "VAT_RATE", schema = "PUBLIC")
public class VATRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VAT_RATE_ID")
    private Long vatRateId;

    @Column(name = "RATE_NAME")
    private String rateName;

    @Column(name = "RATE")
    private Double rate;

    public Long getVatRateId() {
        return vatRateId;
    }

    public void setVatRateId(Long vatRateId) {
        this.vatRateId = vatRateId;
    }

    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
