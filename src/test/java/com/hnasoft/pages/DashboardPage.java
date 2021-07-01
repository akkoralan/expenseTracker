package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  abstract class DashboardPage {

    public DashboardPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//span[@class='open-form']")
    public WebElement Signout;

}
