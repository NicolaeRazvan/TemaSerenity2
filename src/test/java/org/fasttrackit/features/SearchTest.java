package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchTest(){
        searchSteps.executeSearch(" ");
    }

    @Test
    public void executeSearchForProductTest(){
        searchSteps.executeSearch("necklace");
        searchSteps.searchForSpecificItem("SILVER DESERT NECKLACE");
        searchSteps.findAndOpenProduct("SILVER DESERT NECKLACE");//assert//
    }

    @Test
    public void searchByPriceTest(){
        searchSteps.executeSearch("linen");
        searchSteps.executeSort();
        searchSteps.priceAscendingWithAssert();
    }
}
