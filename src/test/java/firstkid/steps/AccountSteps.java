package firstkid.steps;



import firstkid.pages.AccoutPage;
import firstkid.pages.RegistryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountSteps extends ScenarioSteps {

    AccoutPage accoutPage;
    RegistryPage registryPage;

    @Step
    public void openPage() {
        registryPage.open();
    }

    @Step
    public void setCredentials() {
        registryPage.setfirstNameField();
        registryPage.setlastNameField();
    }

    @Step
    public String setEmailAdress() {
        return registryPage.setRandomEmailAdressField();
    }

    @Step
    public String setPassword() {
        String password = registryPage.setRandomPassword();
        registryPage.setConfirmationField(password);
        return password;
    }

    @Step
    public void confirmRegistry() {

        registryPage.clickRegisterButton();
    }

    @Step
    public void registryButton() {
        registryPage.registerButton();
    }

    @Step
    public void passwordChange() {
        accoutPage.passwordChangeButton();
    }

    @Step
    public void checkBox(){
        accoutPage.checkbox();
    }
    @Step
    public void setCurrentPassword(String Password) {
    accoutPage.setPasswordField(Password);
    }

    @Step
    public String changePassword()
    {
        String chagePassword = accoutPage.chagePassword();
        return chagePassword;
    }

   @Step
   public void confirmNewPassword() {
       accoutPage.confirmPassword(changePassword());
   }
    @Step
    public void saveButton(){
        accoutPage.saveNewPassword();
    }
}