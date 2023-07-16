package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By clickAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName =By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By submitAddCustomer = By.xpath("//button[@type='submit']");


    public void clickOnAddCustomer(){
        clickOnElement(clickAddCustomer);
    }
    public void enterOnFirstName(){
        sendTextToElement(firstName,"Tannu");
    }
    public void enterOnLastName(){
        sendTextToElement(lastName,"Patil");
    }
    public void enterPostCode(){
        sendTextToElement(postCode,"HA3 7FD");
    }
    public void clickOnSubmitAddCustomer(){
        clickOnElement(submitAddCustomer);
    }
    public void popUpDisplay(){
        driver.switchTo().alert();
    }
    public void getMessageSuccessfully(){
        System.out.println(getTextFromAlert());
    }
    public void okButton(){
        acceptAlert();
    }

}
