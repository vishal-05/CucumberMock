package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "(//span[@class = 'title'])")
    WebElement cartPageTitle;

    @FindBy(xpath = "(//button[@id = 'checkout'])")
    WebElement checkoutBtn;

    public String cartPageTitle() {
        return cartPageTitle.getText();
    }
    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }
}
