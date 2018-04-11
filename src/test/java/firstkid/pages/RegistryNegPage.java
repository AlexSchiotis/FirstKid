package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;



@DefaultUrl("https://qa.firstkid.ro/customer/account/create/")

public class RegistryNegPage extends BasePage {


    @FindBy(css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAdressFiled;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = "button[title='Trimite']")
    private WebElementFacade registerButton;

    public void setfirstNameField() {typeInto(firstNameField, getRandomString(6));
    }

    public void setlastNameField() {typeInto(lastNameField, getRandomString(6));
    }

    public String setEmailAdressField() { String emailAdress = getRandomString(6) + getRandomString(4) + ".com";
        typeInto(emailAdressFiled, emailAdress);
        return emailAdress;
    }

    public String setRandomPassword() {
        String password = getRandomString(7);
        typeInto(passwordField, password);
        return password;
    }

    public void setConfirmationField(String password) {
        typeInto(confirmationField, password);
    }

    public void clickRegisterButton() {
        checkAndCloseCookies();
        waitFor(registerButton);
        clickOn(registerButton);

    }
}
