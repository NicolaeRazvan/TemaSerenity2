package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade loginHelloMessageElement;

    public void checkUserLoggedIn(String userName) {
        loginHelloMessageElement.shouldContainOnlyText("Hello, " + userName + "!");
    }
}
