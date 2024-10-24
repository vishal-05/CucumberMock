package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage {
    @FindBy(xpath = "(//span[@class = 'title'])")
    WebElement finishPageTitle;

    @FindBy(xpath = "(//button[@id = 'finish'])")
    WebElement finishBtn;

    public String finishPageTitle() {
        return finishPageTitle.getText();
    }
    public void clickFinishBtn() {
        finishBtn.click();
    }
}
