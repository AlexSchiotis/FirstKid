package firstkid.pages;

import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@DefaultUrl("https://qa.firstkid.ro/customer/account/create/")

public class RegistryPage extends BasePage {


    @FindBy(css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAdressFiled;

    @FindBy(id = "advice-required-entry-firstname")
    private WebElementFacade firstnameValidationDiv;

    @FindBy(id = "advice-required-entry-lastname")
    private WebElementFacade lastnameValidationDiv;

    @FindBy(id = "advice-validate-email-email_address")
    private WebElementFacade emailValidationDiv;

    @FindBy(id = "advice-validate-password-password")
    private WebElementFacade passwordValidationDiv;

    @FindBy(id = "advice-validate-cpassword-confirmation")
    private WebElementFacade confirmationDiv;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = "button[title='Trimite']")
    private WebElementFacade registerButton;


    public void setfirstNameField() {
        typeInto(firstNameField, getRandomString(6));
    }

    public void setlastNameField() {
        typeInto(lastNameField, getRandomString(6));
    }

    public String setEmailAdressField() {
        String emailAdress = getRandomString(6) + "@" + getRandomString(4) + ".com";
        typeInto(emailAdressFiled, emailAdress);
        return emailAdress;
    }
    public void setNegEmail(){
        String emailAdress = getRandomString((8));
        typeInto (emailAdressFiled, emailAdress);
    }
    public void clearEmailFiled(){
        emailAdressFiled.clear();
    }

    public void checkEmailAddress(){
        String actualString = emailAdressFiled.getText();
        assertThat("Unexpected error message", emailValidationDiv.getText(), is("Introdu o adresa de email valida."));
    }

    public String setRandomPassword() {
        String password = getRandomString(7);
        typeInto(passwordField, password);
        return password;
    }

    public String setShortPassword(){
        String password = getRandomString(5);
        typeInto(passwordField, password);
        return password;
    }

    public void checkPasswordFiled(){
        String actualString = passwordField.getText();
        assertThat("Unexpected error message", passwordValidationDiv.getText(), is("Please enter 6 or more characters without leading or trailing spaces") );
    }

    public void checkConfirmation(){
        String actualString = confirmationField.getText();
        assertThat("Unexpected error message", confirmationDiv.getText(), is ("Asigură-te că parolele coincid."));
    }

    public void checkFirstnameField(){
        String actualString = firstNameField.getText();
        assertThat("Unexpected error message", firstnameValidationDiv.getText(), is ("Acest câmp este obligatoriu."));
    }

    public void checkLastnameField(){
        String actualString = lastNameField.getText();
        assertThat("Unexpected error message", lastnameValidationDiv.getText(), is ("Acest câmp este obligatoriu"));

    }

    public String setWrongConfirmation(){
        String confirmation = getRandomString(6);
        typeInto(confirmationField, getRandomString(6));
        return confirmation;
    }
    public void setConfirmationField(String password) {
        typeInto(confirmationField, password);
    }

    public void clickRegisterButton() {
        checkAndCloseCookies();
        waitFor(registerButton);
        clickOn(registerButton);
    }

    public void clearPasswordFiled() {
        passwordField.clear();
    }

    public void clearConfirmationField() {
        confirmationField.clear();
    }

    public void clearFirsNameField() {
        firstNameField.clear();
    }

    public void invalidFirstName() {
        firstNameField.type("");
    }

    public void invalidLastName(){
        lastNameField.type("");
    }
}








