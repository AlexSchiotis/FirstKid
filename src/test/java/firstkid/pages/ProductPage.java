package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@DefaultUrl("https://qa.firstkid.ro/index.php/super-admin")
public class ProductPage extends BasePage {

    @FindBy(id = "username")
    public WebElementFacade userNameField;

    @FindBy(id = "login")
    public WebElementFacade loginField;

    @FindBy(css = ".form-button")
    public WebElementFacade loginButton;

    @FindBy(css = ".message-popup-head > a:nth-child(1) > span:nth-child(1)")
    public WebElementFacade closePopup;

    @FindBy(id = "id_f428e508b6716916695b7c815452b3b3")
    public WebElementFacade addButton;


    public void userName() {
        typeInto(userNameField, "fasttrackit");
    }

    public void logField() {
        typeInto(loginField, "parola11");
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void closePopup() {
        clickOn(closePopup);
    }

    private String newPagePath = "https://qa.firstkid.ro/index.php/super-admin/catalog_product/index/key/308b8ec48ae07c2779485987d6f855c6/";

    public void openAccountPage() {
        getDriver().get(newPagePath);
    }

    public void clickAddButton() {
        clickOn(addButton);
    }

    public void mySelect() {
        Select dropDown = new Select(getDriver().findElement(By.id("attribute_set_id")));

        dropDown.selectByVisibleText("Carti");
    }


}



