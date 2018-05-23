package firstkid.features;

import firstkid.steps.LogInSteps;
import firstkid.steps.RegistrySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    String newEmail;
    String newPassword;

    @Steps
    RegistrySteps registrySteps;
    @Steps
    LogInSteps logInSteps;

    @Test
    public void logInUser(){
        registrySteps.openPage();
        newEmail = registrySteps.setEmailAdress();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();
        logInSteps.logoutPage();
        logInSteps.openAccountPage();
        logInSteps.loginEmail(newEmail);
        logInSteps.loginPassword(newPassword);
        logInSteps.logIn();

    }

        @Test

    public void negativeLoginUser() {
            logInSteps.openAccountPage();
            logInSteps.randomLoginEmail();
            logInSteps.loginPassword(newPassword);
            logInSteps.logIn();


        }

}

