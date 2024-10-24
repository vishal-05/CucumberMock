package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
    @FindBy(xpath = "(//input[@id = 'user-name'])")
    WebElement usernameInput;

    @FindBy(xpath = "(//input[@id = 'password'])")
    WebElement passwordInput;

    @FindBy(xpath = "(//input[@id = 'login-button'])")
    WebElement loginBtn;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isLoginPageDisplayed() {
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void sendUsername( String username,String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void pressLoginBtn(){
        loginBtn.click();
    }
}
