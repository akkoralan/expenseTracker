package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  abstract class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//span[@class='open-form']")
    public WebElement Signout;

    @FindBy(xpath = "//*[@id=\"navbarNavAltMarkup\"]/div/a[1]")
    public WebElement transactionsOption;

    @FindBy(xpath = "//*[@id=\"navbarNavAltMarkup\"]/div/a[2]")
    public WebElement filtersOption;

    @FindBy(xpath = "//*[@id=\"navbarNavAltMarkup\"]/div/a[3]")
    public WebElement loansOption;
}
