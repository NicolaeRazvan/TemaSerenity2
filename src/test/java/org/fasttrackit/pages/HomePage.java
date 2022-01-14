package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css ="[title='Search']")
    private WebElementFacade searchIcon;

    @FindBy(css = ".skip-cart .label")
    private WebElementFacade cartIcon;

    @FindBy(css = ".cart-link")
    private WebElementFacade viewShoppingCartLink;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }


    public void clickOnCartIcon() {
        clickOn(cartIcon);
    }

    public void clickOnViewShoppingCartLink() {
        waitFor(viewShoppingCartLink);
        clickOn(viewShoppingCartLink);
    }
}
