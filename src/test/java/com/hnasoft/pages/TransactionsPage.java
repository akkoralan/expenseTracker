package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TransactionsPage extends  BasePage {

    public TransactionsPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/h2")
    public WebElement pageName;

    @FindBy(id = "date")
    public WebElement date;

    @FindBy(id = "merchant")
    public WebElement merchant;

    @FindBy(id = "amount")
    public WebElement amount;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/form/div/div[4]/button")
    public WebElement submit;

    @FindBy (css = "table")
    public WebElement table;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/table/thead/tr/th")
    public List<WebElement> tableHeaders;

    public void printTable(){

        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains(merchant.getText()));

    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/table/tbody/tr[12]/td[3]")
    public WebElement merchantName;


}
