package com.fastkid.steps.serenity;

import com.fastkid.features.search.SearchTest;
import com.fastkid.pages.RegistryPage;
import com.fastkid.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {


    SearchPage searchPage;

    @Step
    public void openPage() {
        searchPage.open();
    }

    @Step
    public void setSearchField() {
        searchPage.setSearchField();
    }
}
