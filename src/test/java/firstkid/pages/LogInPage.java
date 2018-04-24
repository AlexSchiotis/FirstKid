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
    private WebElementFacade passwordField;

    @FindBy(css = ".my-account-link")
    private WebElement myAccount;

    @FindBy(id = "send2")
    private WebElementFacade sendKey;


    public void checkLogInPage() {

    }
    public void checkEmailFiled(String email) {
    }
    public void checkPassFiled(String pass) {
    }
    public void checkButton(){
        checkButton();
    }
    public void logInButton(){
        sendKey.click();
    }
    public void openMyAccount() {
        mouseOver(myAccount);
    }
        public String emailFiled () {
            String newEmailAdress = getRandomString(6) + "@" + getRandomString(4) + ".com";
            typeInto(emailField, newEmailAdress);
            return newEmailAdress;
    }

    public String setRandomPassword() {
        String password = getRandomString(7);
        typeInto(passwordField, password);
        return password;
    }
    private String pagePath = "https://qa.firstkid.ro/customer/account/logout/";
    public void openLogoutPage() {
        getDriver().get(pagePath);
    }

    private String newPagePath = "https://qa.firstkid.ro/customer/account/login/";
    public void openAccountPage(){
        getDriver().get(newPagePath);
    }

    public void setEmailAdressField(String email){
        typeInto(emailField, email);
    }
    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }
}
