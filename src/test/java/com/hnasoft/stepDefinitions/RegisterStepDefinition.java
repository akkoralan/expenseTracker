package com.hnasoft.stepDefinitions;

import com.hnasoft.pages.RegisterPage;
import com.hnasoft.utilities.BrowserUtils;
import com.hnasoft.utilities.ConfigurationReader;
import com.hnasoft.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
    RegisterPage registerPage = new RegisterPage();

    @Given("user on register page")
    public void user_on_register_page() {

        registerPage.GetStarted.click();
        BrowserUtils.waitFor(3);
        registerPage.Register1.click();
    }


    @When("user enter {string} {string} {string}")
    public void user_enter(String userName, String userEmail, String userPassword) {
        registerPage.Name.click();
        registerPage.Name.sendKeys(userName);
        registerPage.Email.click();
        registerPage.Email.sendKeys(userEmail);
        registerPage.Password.click();
        registerPage.Password.sendKeys(userPassword);
        registerPage.Register2.click();
        BrowserUtils.waitFor(2);
        registerPage.Login.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should be able to register and on the login page")
    public void user_should_be_able_to_register_and_on_the_login_page() {

    }
}
