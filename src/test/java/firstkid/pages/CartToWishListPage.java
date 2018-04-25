package firstkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CartToWishListPage extends PageObject {

    @FindBy(css = ".logo > img:nth-child(2)")
    public WebElementFacade clickLogo;

    public void clickOnLogo() {
        clickOn(clickLogo);
    }

    @FindBy(css = "li.menu-full-width:nth-child(3) > a:nth-child(1)")
    public WebElementFacade clickItem;

    public void clickOnItem() {
        clickOn(clickItem);
    }

    @FindBy(css = "li.item:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(2) > span:nth-child(2)")
    public WebElementFacade addProduct;

    public void addProductToCard() {
        clickOn(addProduct);
    }

    @FindBy(css = ".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")
    public WebElementFacade verMessage;

    public void verVallidMessage() {
        String thisString = verMessage.getText();
        assertThat("Valid Message!", verMessage.getText(), is("Produsul Bara de jucarii universala a fost adăugat în coş."));
    }

    @FindBy(css = ".link-wishlist")
    public WebElementFacade mouveToWish;

    public void mouveToWishList() {
        clickOn(mouveToWish);
    }

    @FindBy(css = ".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")
    public WebElementFacade verTheMessage;

    public void verifyValidMessage() {
        String thisString = verTheMessage.getText();
        assertThat("Valid Message!", verTheMessage.getText(), is("Bara de jucarii universala has been moved to wishlist Wishlist"));
    }

}
