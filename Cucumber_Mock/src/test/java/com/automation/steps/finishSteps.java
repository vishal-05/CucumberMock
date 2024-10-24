package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.FinishPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class finishSteps {
    FinishPage finishPage = new FinishPage();

    @Then("verify finish page is displayed")
    public void verify_cart_page_is_displayed() {
        Assert.assertEquals("Cart Page is not displayed.", (finishPage.finishPageTitle()), "Checkout: Overview");
    }

    @When("user clicks finish button")
    public void user_clicks_checkout_button() {
        finishPage.clickFinishBtn();
    }

}
