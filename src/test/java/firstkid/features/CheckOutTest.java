package firstkid.features;

import firstkid.steps.CartToWishListSteps;
import firstkid.steps.CheckOutSteps;
import firstkid.steps.RegistrySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckOutTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    String newEmail;
    String newPassword;

    @Steps
    CheckOutSteps checkOutSteps;
    @Steps
    RegistrySteps registrySteps;
    @Steps
    CartToWishListSteps cartToWishListSteps;

    @Test
    public void CheckOutSteps(){
        checkOutSteps.openPage();
        newEmail = registrySteps.setEmailAdress();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();
        cartToWishListSteps.clickOnLogo();
        cartToWishListSteps.clickOnItem();
        cartToWishListSteps.addProductToCard();
        cartToWishListSteps.verMessage();
        checkOutSteps.clickCheckOut();


    }
}
