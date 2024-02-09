package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class RotatingPage extends AbstractPage {
    private Header header;

    public RotatingPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("rotating_url"));
    }
}
