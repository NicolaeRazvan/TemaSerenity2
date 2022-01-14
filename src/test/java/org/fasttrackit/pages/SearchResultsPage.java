package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".category-products > .toolbar .sorter select")
    private WebElementFacade sortPrice;


    @FindBy(id = "product-price-421")
    private WebElementFacade neckPrice;

    @FindBy(id = "product-price-406")
    private WebElementFacade dressPrice;

    @FindBy(id = "product-collection-image-553")
    private WebElementFacade necklaceClick;

    @FindBy(id = "product-collection-image-421")
    private WebElementFacade knitClick;

    @FindBy(id = "product-collection-image-406")
    private WebElementFacade linenClick;

    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a"));
                return true;
            }
        }
        return false;
    }

     public void filterByPrice() {
         Select options = new Select(sortPrice);
         options.selectByVisibleText("Price");
    }


    public void priceCompareSearch() {
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts) {
            int a = Integer.parseInt(element.findElement(By.cssSelector("product-price-421")).getText());
            int b = Integer.parseInt(element.findElement(By.cssSelector("product-price-406")).getText());
            if (a > b) {
                System.out.println("Sorting by price is not working.");
            } else Assert.assertTrue("The first product is always smaller then the last product",a<b);
                System.out.println("Price filtering works. The first item has a lower price than the second one.");
        }

    }

    public void clickOnNeck(){
        clickOn(necklaceClick);
    }

    public void clickOnKnit(){
        clickOn(knitClick);
    }

    public void clickOnLinen(){
        clickOn(linenClick);
    }


}
