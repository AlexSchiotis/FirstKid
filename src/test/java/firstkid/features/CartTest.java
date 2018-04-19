package firstkid.features;

import firstkid.steps.CartSteps;
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

   @Steps
    CartSteps cartSteps;

    @Test
    public  void cartTest(){
    cartSteps.openPage();
    cartSteps.clickProduct();
    cartSteps.clickBiberoane();
    cartSteps.clickAddItem();
    cartSteps.verifyMessage();


    }

}
