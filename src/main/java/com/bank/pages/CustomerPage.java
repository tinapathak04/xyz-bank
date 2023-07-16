package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By createdCustomer = By.xpath("//select[@id='userSelect']");
    By login = By.xpath("//select[@id='userSelect']");
    By verifyLogout = By.xpath("//button[normalize-space()='Logout']");

    By logout = By.xpath("//button[normalize-space()='Logout']");
    By textYourName = By.xpath("//span[@class='fontBig ng-binding']");


    public void searchOnCreatedCustomer() {
        selectByContainsTextFromDropDown(createdCustomer, "Tannu Pathak");
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public String verifyOnLogout(){
        return getTextFromElement(verifyLogout);
    }
    public void clickOnLogout(){
        clickOnElement(logout);
    }
    public String verifyYourNameDisplayed(){
        return getTextFromElement(textYourName);
    }


}
