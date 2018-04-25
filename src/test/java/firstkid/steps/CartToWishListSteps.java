package firstkid.steps;

import firstkid.pages.CartToWishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class CartToWishListSteps extends ScenarioSteps {

    private CartToWishListPage cartToWishListPage;


    @Step
    public void clickOnLogo() {
        cartToWishListPage.clickOnLogo();
    }

    @Step
    public void clickOnItem() {
        cartToWishListPage.clickOnItem();
    }

    @Step
    public void addProductToCard() {
        cartToWishListPage.addProductToCard();
    }

    @Step
    public void verMessage() {
        cartToWishListPage.verVallidMessage();}

        @Step
        public void mouveProduct() {
            cartToWishListPage.mouveToWishList();
        }

        @Step
    public void verifyValidMess(){
        cartToWishListPage.verifyValidMessage();
        }

    }





