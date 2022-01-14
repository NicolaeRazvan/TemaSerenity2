package org.fasttrackit.features;


import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }

    @Test
    public void cartSummaryTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        searchSteps.clickNeck();
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("ELIZABETH KNIT TOP");
        searchSteps.clickKnit();
        productPageSteps.clickOnColor1();
        productPageSteps.clickOnSize1();
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("LINEN BLAZER");
        searchSteps.clickLinen();
        productPageSteps.clickOnColor2();
        productPageSteps.clickOnSize2();
        cartSteps.clickAddProductToCart();
        cartSteps.getTotal();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }
}
