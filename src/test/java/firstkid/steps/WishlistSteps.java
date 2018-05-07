package firstkid.steps;


import firstkid.pages.WishlistPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class WishlistSteps extends ScenarioSteps {

    WishlistPage wishlistPage;



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
    public void selectArticoleMamici(){
        wishlistPage.astaEOMetodaDeTestSITreStearsa("Articole mamici");
    }

    @Step
    public void selectFirstProduct(){
        wishlistPage.firstProductFromList("Boxeri modelatori Crem");
    }
    @Step
    public void selectSecondItem(){
        wishlistPage.secondProductFromList("Centura Abdominala Postnatala - BabyOno - XL");
    }

    @Step
    public void openWishlist(){
        wishlistPage.clickOnWishlist();
    }

}
