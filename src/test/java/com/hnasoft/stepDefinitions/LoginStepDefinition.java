package com.hnasoft.stepDefinitions;

import com.hnasoft.pages.RegisterPage;
import com.hnasoft.utilities.ConfigurationReader;
import com.hnasoft.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginStepDefinition {
    RegisterPage registerPage = new RegisterPage();

    @Given("the user is on the login page and registered")
    public void the_user_is_on_the_login_page_and_registered() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        registerPage.GetStarted.click();

    }

    @When("the user enter login informations")
    public void the_user_enter_login_informations() {

        String userEmail = ConfigurationReader.get("userEmail");
        String userPassword = ConfigurationReader.get("userPassword");
        registerPage.userEmail.click();
        registerPage.userEmail.sendKeys(userEmail);
        registerPage.userPassword.click();
        registerPage.userPassword.sendKeys(userPassword);
        registerPage.Login.click();


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {


    }

}
