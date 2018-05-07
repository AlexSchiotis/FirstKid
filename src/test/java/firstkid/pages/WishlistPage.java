package firstkid.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://qa.firstkid.ro/")
public class WishlistPage extends PageObject {

    @FindBy(css = ".logo img")
    private WebElementFacade homePage;


    @FindBy(css = ".menu-container .side-menu>li")
    private List<WebElementFacade> menuCategories;


    @FindBy(css = ".item-area div h2 a")
    private List<WebElementFacade> firstProduct;

    @FindBy(css = ".item-area div h2 a)")
    private List <WebElementFacade> secondProduct;

    @FindBy(css = ".link-wishlist span")
    private WebElementFacade wishlistButton;

    @FindBy(css =".btn-add")
    private WebElementFacade addToCart;

    @FindBy(className = ".top-menu-wishlist")
    private WebElementFacade wishlistPage;



    public void clickOnWishlist(){
        wishlistPage.click();
    }

   public void  openHomepage(){
       homePage.click();
   }



    public void addToWishlist(){
        wishlistButton.click();
    }

    public void setAddToCart(){
        addToCart.click();
    }


    public void astaEOMetodaDeTestSITreStearsa(String categoryName){
        for (WebElementFacade element : menuCategories){
            if (element.containsText(categoryName)) {
                element.click();
                break;
            }
        }
    }

    public void firstProductFromList(String productName){
        for (WebElementFacade element : firstProduct){
            if (element.containsText(productName)){
                element.click();
                break;
            }
        }
    }
    public void secondProductFromList(String secondProductName){
        for (WebElementFacade element : secondProduct) {
            if (element.containsText(secondProductName)) {
                element.click();
                break;
            }
        }
    }
}

