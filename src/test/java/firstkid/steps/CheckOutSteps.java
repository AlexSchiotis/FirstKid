package firstkid.steps;

import firstkid.pages.CheckOutPage;
import firstkid.utils.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.FindBy;

public class CheckOutSteps extends ScenarioSteps {
    CheckOutPage checkOutPage;

    @Step
    public void openPage() {
        checkOutPage.open(); }

        @Step
    public void clickCheckOut() {
        checkOutPage.clickCheckOutButton();
        }
}
