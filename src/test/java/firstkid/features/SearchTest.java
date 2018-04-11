package firstkid.features;

import firstkid.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchTest(){
        searchSteps.openPage();
        searchSteps.setSearchField();

    }
}
