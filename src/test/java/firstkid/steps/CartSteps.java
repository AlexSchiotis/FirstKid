package firstkid.steps;

import firstkid.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {

    private CartPage cartPage;

    @Step
    public void openPage() {
        cartPage.open();
    }


    @Step
    public void clickProduct() {
        cartPage.clickProduct();
    }


    @Step
    public void clickBiberoane() {
        cartPage.clickBiberoane();
    }

    @Step
    public void clickAddItem() {
        cartPage.clickAddItem();
    }

    @Step
    public void verifyMessage() {
        cartPage.verifyIfMessageAppear();
    }

}


