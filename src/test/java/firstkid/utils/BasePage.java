package firstkid.utils;

import java.util.Random;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BasePage extends PageObject {

    protected String getRandomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    protected int getRandomInt(int lenght) {
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 10; iCount++) {
            int randomNumber = objGenerator.nextInt(100);
        }
        return lenght;
    }



    protected void checkAndCloseCookies() {
        By cookiesBarCloseIcon = By.id("giant-cookielaw-close-button");
        try {
            waitForAngularRequestsToFinish();
            getDriver().findElement(cookiesBarCloseIcon).click();
        } catch (Exception e) {
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
