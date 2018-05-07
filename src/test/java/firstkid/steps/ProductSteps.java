package firstkid.steps;

import firstkid.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductSteps extends ScenarioSteps {

    ProductPage productPage;

    @Step
    public void openPage() {
        productPage.open();
    }

    @Step
    public void userFieldType() {
        productPage.userName();
    }

    @Step
    public void passwordFieldType() {
        productPage.logField();
    }

    @Step
    public void clickOnLoginButton() {
        productPage.clickLoginButton();
    }

    @Step
    public void clickClosePopup() {
        productPage.closePopup();
    }

    @Step
    public void openAddProductPage() {
        productPage.openAccountPage();
    }

    @Step
    public void clickOnAddProductButton() {
        productPage.clickAddButton();
    }

    @Step
    public void mySelectProduct() {
        productPage.mySelect();
    }


}

