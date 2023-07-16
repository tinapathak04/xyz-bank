package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {


    By deposit = By.xpath("//button[normalize-space()='Deposit']");
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    By clickDeposit = By.xpath("//button[@type='submit']");
    By verifyDepositSuccessfully = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By enter50 = By.xpath("//input[@placeholder='amount']");
    By clickWithdrawl = By.xpath("//button[normalize-space()='Withdraw']");
    By textTransaction = By.xpath("//span[@class='error ng-binding']");





    public void byDeposit(){
        clickOnElement(deposit);
    }
    public void enter100(){
        sendTextToElement(enterAmount,"100");
    }
    public void clickOnDeposit(){
        clickOnElement(clickDeposit);
    }
    public String verifyDepositText(){
        return getTextFromElement(verifyDepositSuccessfully);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawl);
    }
    public void deposit50(){
        sendTextToElement(enter50,"50");
    }
    public void submitWithdrawl(){
        clickOnElement(clickWithdrawl);
    }
    public String verifyTransaction(){
        return getTextFromElement(textTransaction);
    }

}
