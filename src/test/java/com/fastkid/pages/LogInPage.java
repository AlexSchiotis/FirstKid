package com.fastkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qa.firstkid.ro/customer/account/login/")
public class LogInPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordFiled;

    @FindBy(id = "send2")
    private WebElementFacade sendKey;

    public void checkLogInPage() {
    }

    public void setEmailFiled(String email) {
    }

    public void setPassFiled(String pass) {
    }
}
