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


    @When("user sends POST request to {string}")
    public void user_sends_POST_request_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("status code {int}")
    public void status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("content type should be {string}")
    public void content_type_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("json payload\\/response should contain: {string} message")
    public void json_payload_response_should_contain_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("same data what is posted")
    public void same_data_what_is_posted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
