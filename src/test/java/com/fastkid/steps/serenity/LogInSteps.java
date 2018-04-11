package com.fastkid.steps.serenity;


import com.fastkid.pages.LogInPage;
import com.fastkid.Utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {

LogInPage logInPage;


    @Step
    public void openPage() {
        logInPage.open();
        logInPage.checkLogInPage();
    }

    @Step
    public void setEmail(String email){
        logInPage.setEmailFiled(email);
    }

    @Step
    public void setPass(String pass){
        logInPage.setPassFiled(pass);
    }

    @Step

    public void sendKey(){

    }
}
