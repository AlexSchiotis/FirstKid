package firstkid.features;

import firstkid.steps.CartSteps;
import firstkid.steps.CartToWishListSteps;
import firstkid.steps.LogInSteps;
import firstkid.steps.RegistrySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CartTest {
    @Managed(uniqueSession = true)
    public WebDriver webDriver;
    String newEmail;
    String newPassword;

    @Steps
    CartSteps cartSteps;
    @Steps
    LogInSteps logInSteps;
    @Steps
    CartToWishListSteps cartToWishListSteps;
    @Steps
    RegistrySteps registrySteps;

    @Test
    public void cartTest() {
        cartSteps.openPage();
        cartSteps.clickProduct();
        cartSteps.clickBiberoane();
        cartSteps.clickAddItem();
        cartSteps.verifyMessage();

    }

    @Test
    public void cartToWishListPage() {
        registrySteps.openPage();
        newEmail = registrySteps.setEmailAdress();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();
        cartToWishListSteps.clickOnLogo();
        cartToWishListSteps.clickOnItem();
        cartToWishListSteps.addProductToCard();
        cartToWishListSteps.verMessage();
        cartToWishListSteps.mouveProduct();
        cartToWishListSteps.verifyValidMess();
    }

}



