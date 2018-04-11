package firstkid.steps;


import firstkid.pages.RegistryNegPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class RegistryNegSteps extends PageObject {


    RegistryNegPage registryNegPage;


    @Step
    public void openPage() {
        registryNegPage.open();

    }
    @Step
    public void setCredentials() {
        registryNegPage.setfirstNameField();
        registryNegPage.setlastNameField();
    }

    @Step
    public String setEmailAdress() {
        return registryNegPage.setEmailAdressField();
    }
        @Step
        public String setPassword() {
            String password = registryNegPage.setRandomPassword();
            registryNegPage.setConfirmationField(password);
            return password;
        }
        @Step
        public void confirmRegistry(){
            registryNegPage.clickRegisterButton();
        }

    }


