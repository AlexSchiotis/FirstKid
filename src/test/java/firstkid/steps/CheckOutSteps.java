package firstkid.steps;

import firstkid.pages.CheckOutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckOutSteps extends ScenarioSteps {
    CheckOutPage checkOutPage;

    @Step
    public void openPage() {
        checkOutPage.open();
    }

    @Step
    public void clickCheckOut() {
        checkOutPage.clickCheckOutButton();
    }

    @Step
    public String setOrasField() {
        return checkOutPage.setRandomOras();
    }

    @Step
    public String setAdressField() {
        return checkOutPage.setRandomAdress();
    }

    @Step
    public int firstTelNumber() {
        return checkOutPage.setRandomNumber();
    }

    @Step
    public void checkBox() {
        checkOutPage.checkbox();
    }
    @Step
    public void clickButton() {
        checkOutPage.clickOnComandaButton();
    }
}
