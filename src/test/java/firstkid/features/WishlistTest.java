package firstkid.features;

import firstkid.steps.LogInSteps;
import firstkid.steps.RegistrySteps;
import firstkid.steps.WishlistSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.grid.web.servlet.handler.SeleniumBasedResponse;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class WishlistTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    String newEmail;
    String newPassword;

    @Steps
    RegistrySteps registrySteps;
    @Steps
    LogInSteps logInSteps;
    @Steps
    WishlistSteps wishlistSteps;


    @Test
    public void WishlistTest(){

        registrySteps.openPage();
        newEmail = registrySteps.setEmailAdress();
        newPassword = registrySteps.setPassword();
        registrySteps.setCredentials();
        registrySteps.confirmRegistry();
        wishlistSteps.openNewHomepage();
        wishlistSteps.extendMenu();
        wishlistSteps.firstItem();
        wishlistSteps.addToWishlist();
        wishlistSteps.openNewHomepage();
        wishlistSteps.extendMenu();
        wishlistSteps.secondItem();
        wishlistSteps.addToWishlist();
        wishlistSteps.addToCart();




    }












}