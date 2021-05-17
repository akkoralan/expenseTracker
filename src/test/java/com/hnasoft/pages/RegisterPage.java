package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class RegisterPage extends DashboardPage {

    @FindBy(xpath = "//a[text()='Get Started']")
    public WebElement GetStarted;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Login;



    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/form/a")
    public WebElement Register1;







    public RegisterPage(){ PageFactory.initElements(Driver.get(), this); }

    // public String getPageSubTitle() {
    //ant time we are verifying page name, or page subtitle, loader mask appears
    //   waitUntilLoaderScreenDisappear();
    //   BrowserUtils.waitForStaleElement(pageSubTitle);
    //  return pageSubTitle.getText();
    // }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    // public void waitUntilLoaderScreenDisappear() {
    //   try {
    //       WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
    //        wait.until(ExpectedConditions.invisibilityOf(loaderMask));
    // } catch (Exception e) {
    //      e.printStackTrace();
    //  }

    // }

    //  public String getUserName(){
    // waitUntilLoaderScreenDisappear();
    //    BrowserUtils.waitForVisibility(userNameInput, 5);
    //  return userNameInput.getText();
    // }



    //public void logOut(){
    //  BrowserUtils.waitFor(2);
    //BrowserUtils.clickWithJS(userNameInput);
    // BrowserUtils.clickWithJS(logOutLink);
    //}
    //public void goToMyUser(){
    // waitUntilLoaderScreenDisappear();
    //  BrowserUtils.waitForClickablility(userNameInput, 5).click();
    // BrowserUtils.waitForClickablility(myUser, 5).click();

    //}

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */





}

