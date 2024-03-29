package com.solvd.carinatestautomation.web.warframe;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends AbstractPage {
    @FindBy(xpath = "//a[@id='lnkMain']")
    private ExtendedWebElement continueToHomeButton;

    public LandingPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("landing_url"));
    }

    public HomePage pressGoToHomeButton() {
        continueToHomeButton.click();
        return new HomePage(getDriver());
    }

    public ExtendedWebElement getContinueToHomeButton() {
        return continueToHomeButton;
    }
}
