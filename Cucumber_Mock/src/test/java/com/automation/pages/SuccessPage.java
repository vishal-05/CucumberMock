package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage{
    @FindBy(xpath = "(//div[@class='complete-text'])")
    WebElement successText;

    public String successMessage() {
        return successText.getText();
    }
}
