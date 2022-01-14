package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(id = "swatch28")
    private WebElementFacade colorElement1;

    @FindBy(id = "swatch80")
    private WebElementFacade sizeElement1;

    @FindBy(id = "option22")
    private WebElementFacade colorElement2;

    @FindBy(id = "swatch78")
    private WebElementFacade sizeElement2;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickColor1(){
        clickOn(colorElement1);
    }
    public void clickSize1(){
        clickOn(sizeElement1);
    }

    public void clickColor2(){
        clickOn(colorElement2);
    }
    public void clickSize2(){
        clickOn(sizeElement2);
    }
}
