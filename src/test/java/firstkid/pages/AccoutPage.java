package firstkid.pages;


import firstkid.utils.BasePage;
import firstkid.pages.RegistryPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qa.firstkid.ro/customer/account/create/")

public class AccoutPage extends BasePage{


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

    @FindBy(css = ".box-content p a")
    private WebElementFacade passwordChangeLink;

    @FindBy(css = "#current_password")
    private WebElementFacade currentPassword;

    @FindBy (css = ".checkbox")
    private WebElementFacade checkbox;

    @FindBy (css = "#password")
    private WebElementFacade changePasswordField;

    @FindBy (css = "#confirmation")
    private WebElementFacade changeConfirmationField;

    @FindBy (css = ".buttons-set > button:nth-child(3)")
    private WebElementFacade saveButton;



    public void setfirstNameField() {

        typeInto(firstNameField, getRandomString(6));
    }

    public void setlastNameField() {
        typeInto(lastNameField, getRandomString(6));
    }

    public String setRandomEmailAdressField() {
        String emailAdress = getRandomString(6) + "@" + getRandomString(4) + ".com";
        typeInto(emailAdressFiled, emailAdress);
        return emailAdress;
    }

    public String setRandomPassword() {
        String password = getRandomString(7);
        typeInto(passwordField, password);
        return password;
    }
    public void setPasswordField(String password){
        typeInto(currentPassword,password);
    }

    public void setConfirmationField(String password) {
        typeInto(confirmationField, password);
    }

    public void clickRegisterButton() {
        checkAndCloseCookies();
        waitFor(registerButton);
        clickOn(registerButton);
    }

    public void passwordChangeButton(){
        passwordChangeLink.click();
    }

   public boolean checkbox(){
       return checkbox.isSelected();
    }


    public void setCurrentPassword(String password){
        typeInto(currentPassword, password);
    }

    public String chagePassword(){
        String changePassword = getRandomString(7);
        typeInto(changePasswordField, changePassword);
        return changePassword;
    }
    public void confirmPassword(String password){
        typeInto(changeConfirmationField, chagePassword());

    }


    public void saveNewPassword(){
        saveButton.click();
    }
}
