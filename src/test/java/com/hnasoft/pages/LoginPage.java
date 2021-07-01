package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DashboardPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(name = "email")
    public WebElement userEmail;

    @FindBy(name = "password")
    public WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Login;

}
