package firstkid.steps;

import firstkid.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {


    private SearchPage searchPage;

    @Step
    public void openPage() {
        searchPage.open();
    }

    @Step
    public void setSearchField() {
        searchPage.setSearchField();
    }

    @Step
    public void clickSearch() {
        searchPage.clickSearchButton();
    }

    @Step
    public void checkErrorMessage() {
        searchPage.checkErrorMessage();

    }

}
