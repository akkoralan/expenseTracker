package com.hnasoft.pages;

import com.hnasoft.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public  abstract class DashboardPage {
    public DashboardPage(){ PageFactory.initElements(Driver.get(), this); }

}
