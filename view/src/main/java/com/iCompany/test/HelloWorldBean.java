package com.iCompany.test;

import com.iCompany.user.NewUserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by Lukasz Franczuk on 12.02.16.
 */
@ManagedBean
@ViewScoped
public class HelloWorldBean {

    @ManagedProperty(value = "#{newUserService}")
    private NewUserService newUserService;

    private String testString = "Hello World";

    public void testDB() {
        newUserService.saveTestUser();
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public void setNewUserService(NewUserService newUserService) {
        this.newUserService = newUserService;
    }
}
