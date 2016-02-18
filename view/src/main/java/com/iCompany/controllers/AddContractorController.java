package com.iCompany.controllers;

import com.iCompany.beans.AddContractorBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by Karol Dziegiel on 18.02.16.
 */
@ManagedBean
@RequestScoped
public class AddContractorController {
    @ManagedProperty(value = "#{addContractorBean}")
    AddContractorBean addContractorBean;


}
