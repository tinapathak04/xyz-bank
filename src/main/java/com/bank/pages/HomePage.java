package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    By homeButton = By.xpath("//button[normalize-space()='Home']");
    public void clickOnHome(){
        clickOnElement(homeButton);
    }
}
