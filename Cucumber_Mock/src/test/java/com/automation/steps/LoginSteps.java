package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }
    @Then("verify login page is displayed")
    public void verify_login_page_is_displayed() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enters login credentials")
    public void user_enters_login_credentials(){
        loginPage.sendUsername("standard_user", "secret_sauce");
        loginPage.pressLoginBtn();
    }

}
