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
    public String setEmailAdress(){
      return registryPage.setEmailAdressField();

    }
    @Step
    public String setPassword() {
        String password = registryPage.setRandomPassword();
        registryPage.setConfirmationField(password);
        return password;
    }
    @Step
    public void confirmRegistry(){
        registryPage.clickRegisterButton();
    }

}
