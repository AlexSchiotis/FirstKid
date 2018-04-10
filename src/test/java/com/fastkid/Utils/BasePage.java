package com.fastkid.Utils;

import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject{

    protected String getRandomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    protected void checkAndCloseCookies(){
        By cookiesBarCloseIcon = By.id("giant-cookielaw-close-button");
        try{
            waitForAngularRequestsToFinish();
            getDriver().findElement(cookiesBarCloseIcon).click();
        }catch (Exception e){
            System.out.println("Cookies bar not found");
        }
    }

}
