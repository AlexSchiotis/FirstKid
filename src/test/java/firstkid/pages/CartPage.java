package firstkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.List;


@DefaultUrl("https://qa.firstkid.ro/")
public class CartPage extends PageObject {

    @FindBy(css = "li.menu-full-width:nth-child(2) > a:nth-child(1)")
    private WebElementFacade selectProduct;

    public void clickProduct() {
        clickOn(selectProduct);
    }

    @FindBy(css = "li.has-no-children:nth-child(2) > a:nth-child(1)")
    private WebElementFacade selectBiberoane;

    public void clickBiberoane() {
        clickOn(selectBiberoane);
    }

    @FindBy(css = "li.item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(2)")
    private WebElementFacade addItemToCart;

    public void clickAddItem() {
        clickOn(addItemToCart);
    }

    @FindBy(css = ".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")
    private WebElementFacade verifyMessage;

    public void verifyIfMessageAppear() {
        String thisString = verifyMessage.getText();
        assertThat("Valid Message!",verifyMessage.getText(),is("Produsul Biberon ActiveFlow din plastic incasabil 150 ml a fost adăugat în coş."));
    }

}


