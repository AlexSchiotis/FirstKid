package firstkid.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    protected Actions mouseOver(WebElement webElement) {
        Actions actions = new Actions(getDriver());

        actions.moveToElement(webElement)
                .build()
                .perform();

        return actions;
    }


}
