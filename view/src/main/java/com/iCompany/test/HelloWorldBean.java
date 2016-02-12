package com.iCompany.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by Lukasz Franczuk on 12.02.16.
 */
@ManagedBean
@ViewScoped
public class HelloWorldBean {

    private String testString = "Hello World";

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
