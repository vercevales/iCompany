package com.iCompany.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by Karol Dziegiel on 15.02.16.
 *
 */
@ManagedBean
@ViewScoped
public class AddContractorBean {
    private String companyName;
    private String shortCoompanyName;
    private String address;
    private String nip;
    private String regon;
    private String krs;
    private String telephone;
    private String mail;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyNamy(String companyName) {
        this.companyName = companyName;
    }

    public String getShortCoompanyName() {
        return shortCoompanyName;
    }

    public void setShortCoompanyName(String shortCoompanyName) {
        this.shortCoompanyName = shortCoompanyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
