package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homepage = new HomePage();
    AddCustomerPage customerPage = new AddCustomerPage();
    BankManagerLoginPage managerloginpage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage loginPage = new CustomerLoginPage();
    CustomerPage customer = new CustomerPage();
    AccountPage account = new AccountPage();


   @Test
   public void bankManagerShouldAddCustomerSuccessfully(){
       homepage.clickOnHome();
       //click On "Bank Manager Login" Tab
       managerloginpage.clickOnBankManagerLogin();
       //click On "Add Customer" Tab
       customerPage.clickOnAddCustomer();
       //enter FirstName
       customerPage.enterOnFirstName();
       //enter LastName
       customerPage.enterOnLastName();
       //enter PostCode
       customerPage.enterPostCode();
       //click On "Add Customer" Button
       customerPage.clickOnSubmitAddCustomer();
       //popup display
       customerPage.popUpDisplay();
       //verify message "Customer added successfully"
       customerPage.getMessageSuccessfully();
       //click on "ok" button on popup.
       customerPage.okButton();
   }

   @Test
   public void bankManagerShouldOpenAccountSuccessfully(){
       //click On "Bank Manager Login" Tab
      managerloginpage.clickOnBankManagerLogin();
       //click On "Open Account" Tab
       openAccountPage.clickOnOpenAccount();
       //Search customer that created in first test
       openAccountPage.setSearchFirstTest();
       //Select currency "Pound"
       openAccountPage.selectCurrency();
       //click on "process" button
       openAccountPage.clickOnProcess();
       //popup displayed
       customerPage.popUpDisplay();
       //verify message "Account created successfully"
       customerPage.getMessageSuccessfully();
       //click on "ok" button on popup.
       customerPage.okButton();
   }
   @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
       //click on "Customer Login" Tab
      loginPage.clickOnLoginLink();
       //search customer that you created.
       customer.searchOnCreatedCustomer();
       //click on "Login" Button
       customer.clickOnLogin();
       //verify "Logout" Tab displayed.
//       String expectedText = "Logout";
//       String actualText = customer.verifyOnLogout();
//       Assert.assertEquals(actualText,expectedText,"Login page not displayed");
       //click on "Logout"
       Thread.sleep(1000);
       customer.clickOnLogout();
       //verify "Your Name" text displayed.
       String expectedText1 = "Tina Pathak";
       String actualText1 = customer.verifyYourNameDisplayed();
       Assert.assertEquals(actualText1,expectedText1,"Message not displayed");

   }
   @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {

       //click on "Customer Login" Tab
       loginPage.clickOnLoginLink();
       //search customer that you created.
      customer.searchOnCreatedCustomer();
       //click on "Login" Button
       customer.clickOnLogin();
       Thread.sleep(1000);
       //click on "Deposit" Tab
       account.byDeposit();
       //Enter amount 100
       account.enter100();
       //click on "Deposit" Button
       account.clickOnDeposit();
       //verify message "Deposit Successful"
       String expectedText = "Deposit Successful";
       String actualText = account.verifyDepositText();
       Assert.assertEquals(actualText,expectedText,"Message not displayed");

   }
   @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
       //click on "Customer Login" Tab
       loginPage.clickOnLoginLink();
       //search customer that you created.
       customer.searchOnCreatedCustomer();
       //click on "Login" Button
       customer.clickOnLogin();
       Thread.sleep(1000);
       //click on "Withdrawl" Tab
       account.clickOnWithdrawl();
       //Enter amount 50
       account.deposit50();
       //click on "Deposit" Button
       account.submitWithdrawl();
       //verify message "Transaction Successful"
       String expectedText = "Transaction Successful";
       String actualText = account.verifyTransaction();
       Assert.assertEquals(actualText,expectedText,"Message not displayed");
   }


}
