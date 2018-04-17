package firstkid.features;

import firstkid.steps.RegistrySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class RegistryTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    String newEmail;
    String newPassword;

    @Steps
    RegistrySteps registrySteps;

    @Test
    public void registerUser(){
        registrySteps.openPage();
        newEmail = registrySteps.setEmailAdress();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();

    }

    @Test
    public void negativeRegisterUser(){
        registrySteps.openPage();
        registrySteps.negEmail();
        registrySteps.confirmRegistry();
        registrySteps.correctEmailAdress();
        registrySteps.confirmRegistry();
        newEmail = registrySteps.setEmailAdress();
        registrySteps.shortPassword();
        registrySteps.confirmRegistry();
        registrySteps.correctPassWordField();
        registrySteps.wrongConfirmation();
        registrySteps.correctConfirmation();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();
    }
    }








