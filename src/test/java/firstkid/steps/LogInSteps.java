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
        logInPage.emailFiled();
    }

    @Step
    public void setPass(String pass){
        logInPage.checkPassFiled(pass);
       logInPage.setRandomPassword();
    }

    @Step
    public void openAccount(){
        logInPage.openMyAccount();
    }

    @Step
    public void logIn(){
        logInPage.logInButton();
    }
    @Step
    public void logoutPage(){
        waitABit(4000);
        logInPage.openLogoutPage();
    }

    }

