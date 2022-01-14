package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;

public class ProductPageSteps extends BaseSteps {
    @Step
    public void clickOnColor1(){
        productPage.clickColor1();
    }

    @Step
    public void clickOnSize1(){
        productPage.clickSize1();
    }

    @Step
    public void clickOnColor2(){
        productPage.clickColor2();
    }

    @Step
    public void clickOnSize2(){
        productPage.clickSize2();
    }
}
