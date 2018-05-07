package firstkid.features;

import firstkid.steps.ProductSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)

public class ProductTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    ProductSteps productSteps;


    @Test
    public void productTest() {
        productSteps.openPage();
        productSteps.userFieldType();
        productSteps.passwordFieldType();
        productSteps.clickOnLoginButton();
        productSteps.clickClosePopup();
        productSteps.openAddProductPage();
        productSteps.clickOnAddProductButton();
        // productSteps.mySelectProduct();

    }

}