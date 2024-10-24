package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {
    @FindBy(xpath = "(//span[@class = 'title'])")
    WebElement infoPageTitle;

    @FindBy(xpath = "(//input[@id = 'continue'])")
    WebElement continueBtn;

    @FindBy(xpath = "(//input[@id = 'finish'])")
    WebElement finishBtn;

    @FindBy(xpath = "(//input[@placeholder = 'First Name'])")
    WebElement firstNameInput;

    @FindBy(xpath = "(//input[@placeholder = 'Last Name'])")
    WebElement lastNameInput;

    @FindBy(xpath = "(//input[@placeholder = 'Zip/Postal Code'])")
    WebElement zipCodeInput;


    public String infoPageTitle() {
        return infoPageTitle.getText();
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }
    public void clickFinishBtn() {
        finishBtn.click();
    }
    public void fillUserAddress(String fname, String lname, String zipCode){
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        zipCodeInput.sendKeys(zipCode);
    }

}
