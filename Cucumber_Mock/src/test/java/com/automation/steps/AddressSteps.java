package com.automation.steps;

import com.automation.pages.AddressPage;
import com.automation.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddressSteps  {
    AddressPage addressPage = new AddressPage();

    @Then("verify address page is displayed")
    public void verify_cart_page_is_displayed() {
        Assert.assertEquals("Info Page is not displayed.", addressPage.infoPageTitle(), "Checkout: Your Information");
    }

    @When("user enters his details")
    public void user_enters_his_details(){
        addressPage.fillUserAddress("Tony", "Lee", "586");
    }
    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        addressPage.clickContinueBtn();
    }
    @Then("finish button")
    public void finish_button() {
        addressPage.clickFinishBtn();
    }


}