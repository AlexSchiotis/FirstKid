package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.apache.tools.ant.util.FileUtils;
import java.util.Random;


@DefaultUrl("https://qa.firstkid.ro/customer/account/create/")

public class CheckOutPage extends BasePage {

    @FindBy(css = ".logo > img:nth-child(2)")
    public WebElementFacade clickLogo;

    // public void setClickLogo() { clickOn(clickLogo); }

    @FindBy(css = ".page-title > ul:nth-child(2) > li:nth-child(1) > button:nth-child(1)")
    public WebElementFacade checkOutButton;

    public void clickCheckOutButton() {
         clickOn(checkOutButton);}
         // checkAndCloseCookies();
    //waitFor(checkOutButton);.totals.btn-checkout

    @FindBy(id = "billing_city")
    public WebElementFacade selectOras;

    public String setRandomOras() {
        String orasField = getRandomString(6);
        typeInto(selectOras, orasField);
        return orasField;
    }

    @FindBy(id = "billing_street1")
    public WebElementFacade adressField;

    public String setRandomAdress() {
        String firstAdressField = getRandomString(6);
        typeInto(adressField, firstAdressField);
        return firstAdressField;
    }

    @FindBy(id = "billing_telephone")
    public WebElementFacade telephoneField;

    public int setRandomNumber() {
        int phoneNumber = getRandomInt(10);
        typeInto(telephoneField, String.valueOf(phoneNumber));
        return phoneNumber;
    }

    @FindBy(id = "submit-btn")
    public WebElementFacade comandaButton;

    public void clickOnComandaButton() {
        clickOn(comandaButton);
    }


}
