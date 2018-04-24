package firstkid.steps;


import firstkid.pages.RegistryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class RegistrySteps extends ScenarioSteps {

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
    public void registryButton(){
        registryPage.registerButton();
    }

    @Step
    public void negEmail(){
        registryPage.setNegEmail();
    }
    @Step
    public void correctEmailAdress() {
        registryPage.checkEmailAddress();
        registryPage.clearEmailFiled();
        registryPage.setRandomEmailAdressField();
    }

    @Step
    public void negativeFirstName(){
        registryPage.invalidFirstName();
        registryPage.checkFirstnameField();
        registryPage.clearFirsNameField();
        registryPage.setfirstNameField();
    }

    @Step
    public void negativeLastName(){
        registryPage.invalidLastName();
        registryPage.checkLastnameField();
        registryPage.clearLastNameField();
        registryPage.setlastNameField();
    }

    @Step
    public void shortPassword(){
        registryPage.setShortPassword();

    }
    @Step
    public void repairPassword(){
        registryPage.checkPasswordFiled();
        registryPage.clearPasswordFiled();
        registryPage.setRandomPassword();
    }
    @Step
    public void wrongConfirmation(){
        registryPage.setWrongConfirmation();

    }
    @Step
    public void repairConfirmation(){
        registryPage.checkConfirmation();
        registryPage.clearConfirmationField();
    }
    @Step
    public void confirmation(String password){
        registryPage.clearConfirmationField();
        registryPage.setConfirmationField(password);
    }

}
