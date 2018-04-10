package com.fastkid.steps.serenity;


import com.fastkid.pages.RegistryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


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
