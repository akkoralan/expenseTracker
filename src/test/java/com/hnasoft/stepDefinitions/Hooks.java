package com.hnasoft.stepDefinitions;

import com.hnasoft.pages.LoginPage;
import com.hnasoft.pages.RegisterPage;
import com.hnasoft.utilities.BrowserUtils;
import com.hnasoft.utilities.ConfigurationReader;
import com.hnasoft.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
LoginPage loginPage = new LoginPage();
RegisterPage registerPage =new RegisterPage();
    @Before
    public void setUp() {
        String url = ConfigurationReader.getProperty("url");
        Driver.get().get(url);

        BrowserUtils.waitFor(2);
        registerPage.GetStarted.click();

        String userEmail = ConfigurationReader.getProperty("userEmail");
        String userPassword = ConfigurationReader.getProperty("userPassword");
        loginPage.userEmail.click();
       // BrowserUtils.waitFor(2);
        loginPage.userEmail.sendKeys(userEmail);
       // BrowserUtils.waitFor(2);
        loginPage.userPassword.click();
       // BrowserUtils.waitFor(2);
        loginPage.userPassword.sendKeys(userPassword);
       // BrowserUtils.waitFor(2);
        loginPage.Login.click();
        BrowserUtils.waitFor(2);



       // System.out.println("\tthis is coming from before");
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        //Driver.closeDriver();
    }
}


