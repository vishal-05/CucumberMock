package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("verify cart page is displayed")
    public void verify_cart_page_is_displayed() {
        Assert.assertEquals("Cart Page is not displayed.", cartPage.cartPageTitle(), "Your Cart");
    }

    @When("user clicks checkout button")
    public void user_clicks_checkout_button() {
        cartPage.clickCheckoutBtn();
    }

}
