package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "(//a[@class = 'shopping_cart_link'])")
    WebElement cartIcon;

    @FindBy(xpath = "(//button[@class = 'btn btn_primary btn_small btn_inventory '])")
    WebElement addToCartBtn;

    @FindBy(xpath = "(//span[@class = 'shopping_cart_badge'])")
    WebElement cartqty;

    public boolean isCartIconDisplayed(){
        return cartIcon.isDisplayed();
    }
    public void clickAddToCartButton(){
        addToCartBtn.click();
    }

    public String CartQuantity() {
        return cartqty.getText();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }

}
