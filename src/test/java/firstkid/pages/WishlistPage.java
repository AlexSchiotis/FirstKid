package firstkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qa.firstkid.ro/")
public class WishlistPage extends PageObject {

    @FindBy(css = "[src=\"https\\:\\/\\/qa\\.firstkid\\.ro\\/skin\\/frontend\\/sft\\/default\\/images\\/firstkid_logo\\.png\"]")
    private WebElementFacade homePage;

    @FindBy(css = "ul.menu:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
    private WebElementFacade extendMenu;

    @FindBy(css = "li.item:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(2)")
    private WebElementFacade firstProduct;

    @FindBy(css = "li.item:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(2)")
    private WebElementFacade secondProduct;

    @FindBy(css = ".link-wishlist > span:nth-child(2)")
    private WebElementFacade wishlistButton;

    @FindBy(css =".btn-add")
    private WebElementFacade addToCart;

    @FindBy(className = ".top-menu-wishlist")
    private WebElementFacade wishlistPage;


    public void clickOnWishlist(){
        wishlistPage.click();
    }
    public void openMenu(){
        extendMenu.click();
    }
   public void  openHomepage(){
       homePage.click();
   }

    public void firstItem(){
        firstProduct.click();
    }

    public void secondItem(){
        secondProduct.click();
    }

    public void addToWishlist(){
        wishlistButton.click();
    }

    public void setAddToCart(){
        addToCart.click();
    }
}
