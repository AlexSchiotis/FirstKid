package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




@DefaultUrl("https://qa.firstkid.ro/customer/account/index/")
public class LogInPage extends BasePage {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordFiled;

    @FindBy(css = ".my-account-link")
    private WebElement myAccount;

    @FindBy(css = ".mini-my-account-link-logout-link")
    private WebElementFacade logOut;

    @FindBy(id = "send2")
    private WebElementFacade sendKey;


    public void checkLogInPage() {
    }
    public void checkEmailFiled(String email) {
    }
    public void checkPassFiled(String pass) {
    }
    public void logOut(){
        logOut.click();
    }
    public void logInButton(){
        sendKey.click();
    }
    public void openMyAccount() {
        mouseOver(myAccount);

    }
}
