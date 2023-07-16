package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By loginLink = By.xpath("//button[normalize-space()='Customer Login']");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
}
