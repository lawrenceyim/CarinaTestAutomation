package com.solvd.carinatestautomation.web.components;

import com.solvd.carinatestautomation.web.HomePage;
import com.solvd.carinatestautomation.web.PlayWarframeYouTubePage;
import com.solvd.carinatestautomation.web.RotatingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/a")
    private ExtendedWebElement headerNavButton;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[1]/a")
    private ExtendedWebElement rotatingButton;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[6]")
    private ExtendedWebElement videosButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage pressHeaderNavButton() {
        headerNavButton.click();
        return new HomePage(getDriver());
    }

    public RotatingPage pressRotatingButton() {
        rotatingButton.click();
        return new RotatingPage(getDriver());
    }

    public PlayWarframeYouTubePage pressVideosButton() {
        videosButton.click();
        return new PlayWarframeYouTubePage(getDriver());
    }
}
