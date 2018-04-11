package com.fastkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qa.firstkid.ro/")
public class SearchPage extends PageObject{

    @FindBy(id = "search")
    private WebElementFacade searchField;

    public void setSearchField() {

    typeInto(searchField,"carucior");}
}
