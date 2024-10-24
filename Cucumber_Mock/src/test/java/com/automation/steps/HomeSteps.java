package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isCartIconDisplayed());
    }

    @When("user adds 4 distinct items to cart")
    public void user_adds_4_distinct_items_to_cart() {
        for(int i = 0; i<4; i++){
            homePage.clickAddToCartButton();
        }
    }

    @Then("verify total cart quantity")
    public void verify_total_cart_quantity() {
        Assert.assertEquals("Cart quantity does not match the expected value.", homePage.CartQuantity(), "4");
    }

    @When("user clicks on cart icon")
    public void user_clicks_on_cart_icon() {
        homePage.clickCartIcon();
    }
}
