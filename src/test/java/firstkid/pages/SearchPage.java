package firstkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@DefaultUrl("https://qa.firstkid.ro/")
public class SearchPage extends PageObject {

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "button.button:nth-child(4)")
    private WebElementFacade searchButton;

    @FindBy(css = ".note-msg")
    private WebElementFacade errorMessage;


    public void setSearchField() {

        typeInto(searchField, "carucior");
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void checkErrorMessage() {
        String thisString = errorMessage.getText();
        assertThat("Error Message!", errorMessage.getText(),is("Căutarea nu a returnat niciun rezultat."));




    }

}
