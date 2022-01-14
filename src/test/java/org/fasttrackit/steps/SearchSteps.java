package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchResultsPage.openProduct(productName));
    }

    @Step
    public void searchAndSelectProduct(String productName){
        executeSearch(productName);
        findAndOpenProduct(productName);
    }

    @Step
    public void searchForSpecificItem(String name){
      searchResultsPage.openProduct(name);
    }


    @Step
    public void executeSort(){
        searchResultsPage.filterByPrice();
    }


    @Step
    public void getTextAndCompare(){
        searchResultsPage.priceCompareSearch();
    }

    @Step
    public void clickNeck(){
        searchResultsPage.clickOnNeck();
    }

    @Step
    public void clickKnit(){
        searchResultsPage.clickOnKnit();
    }

    @Step
    public void clickLinen(){
        searchResultsPage.clickOnLinen();
    }
}
