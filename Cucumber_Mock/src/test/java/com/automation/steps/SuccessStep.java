package com.automation.steps;

import com.automation.pages.SuccessPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SuccessStep {
    SuccessPage successPage = new SuccessPage();

    @Then("verify success message")
    public void verify_success_message() {
        Assert.assertEquals("Success Message is not displayed.", successPage.successMessage(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }
}
