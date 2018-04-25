package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qa.firstkid.ro/customer/account/create/")

public class CheckOutPage extends BasePage {

    @FindBy(css = ".logo > img:nth-child(2)")
    public WebElementFacade clickLogo;

    public void setClickLogo() { clickOn(clickLogo); }

    @FindBy(id = "empty_cart_button")
    public WebElementFacade checkOutButton;

    public void clickCheckOutButton() {
        clickOn(checkOutButton);
    }





}
