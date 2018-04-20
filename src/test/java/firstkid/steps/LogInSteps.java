package firstkid.steps;


import firstkid.pages.LogInPage;
import firstkid.pages.RegistryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import firstkid.utils.BasePage;
import javax.swing.*;

public class LogInSteps extends ScenarioSteps {

LogInPage logInPage;
RegistryPage registryPage;

    @Step
    public void openPage() {
        logInPage.open();
        logInPage.checkLogInPage();
    }

    @Step
    public void setEmail(String email){
        logInPage.checkEmailFiled(email);
        registryPage.setEmailAdressField();
    }

    @Step
    public void setPass(String pass){
        logInPage.checkPassFiled(pass);
        registryPage.setRandomPassword();
    }

    @Step
    public void openAccount(){
        logInPage.openMyAccount();
    }

    @Step
    public void logOutButton(){
        logInPage.logOut();
    }
    @Step
    public void logIn(){
        logInPage.logInButton();
    }

    }

