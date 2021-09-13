package com.hnasoft.stepDefinitions;

import com.hnasoft.pages.DashboardPage;
import com.hnasoft.pages.TransactionsPage;
import com.hnasoft.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TransactionsStepDefinitions {
    DashboardPage dashboardPage = new DashboardPage();
    TransactionsPage transactionsPage = new TransactionsPage();

    @Given("User is on {string} page")
    public void user_is_on_page(String expectedPageName) {
        BrowserUtils.waitFor(2);
        dashboardPage.transactionsOption.click();
        BrowserUtils.waitFor(2);

        String ectualPageName = transactionsPage.pageName.getText();
        System.out.println(ectualPageName);
        Assert.assertEquals(ectualPageName,expectedPageName);
    }

    @When("user enter {string} {string} and {string}")
    public void user_enter_and(String date, String merchant, String amount) {

        transactionsPage.date.click();
        transactionsPage.date.sendKeys(date);
        BrowserUtils.waitFor(2);
        transactionsPage.merchant.click();
        transactionsPage.merchant.sendKeys(merchant);
        BrowserUtils.waitFor(2);
        transactionsPage.amount.click();
        transactionsPage.amount.sendKeys(amount);
        BrowserUtils.waitFor(2);
    }

    @When("after clicking submit button")
    public void after_clicking_submit_button() {

        transactionsPage.submit.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should see the the entered details on the screen")
    public void user_should_see_the_the_entered_details_on_the_screen() {


        //tablodaki header'lari gosteriyor.
        System.out.println("tableHeaders.size() = " + transactionsPage.tableHeaders.size());
        //print each column name one by one
        for (WebElement headers : transactionsPage.tableHeaders) {
            System.out.println(headers.getText());
        }

        transactionsPage.printTable();  //en son girilen datayi gosteriyor


    }
}
