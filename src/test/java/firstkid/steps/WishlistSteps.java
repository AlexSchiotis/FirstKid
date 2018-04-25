package firstkid.steps;


import firstkid.pages.WishlistPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class WishlistSteps extends ScenarioSteps {

    WishlistPage wishlistPage;

    @Step
    public void firstItem(){
        wishlistPage.firstItem();
    }

    @Step
    public void secondItem(){
        wishlistPage.secondItem();
    }

    @Step
    public void addToWishlist(){
       wishlistPage.addToWishlist();
    }

    @Step
    public void addToCart(){
        wishlistPage.setAddToCart();
    }
   @Step
    public void openNewHomepage(){
        wishlistPage.openHomepage();
   }
    @Step
    public void extendMenu(){
        wishlistPage.openMenu();
    }

    @Step
    public void openWishlist(){
        wishlistPage.clickOnWishlist();
    }

}
