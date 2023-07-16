package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By clickOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
    By searchFirstTest = By.xpath("//select[@id='userSelect']");
    By currency = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[normalize-space()='Process']");


    public void clickOnOpenAccount(){
        clickOnElement(clickOpenAccount);
    }
    public void setSearchFirstTest(){
        selectByContainsTextFromDropDown(searchFirstTest,"Tina");
    }
    public void selectCurrency(){
       selectByContainsTextFromDropDown(currency,"Pound");
    }
    public void clickOnProcess(){
        clickOnElement(process);
    }


}
