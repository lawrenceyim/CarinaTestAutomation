package com.solvd.carinatestautomation.web.warframe.components;

import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.solvd.carinatestautomation.web.warframe.HomePage;
import com.solvd.carinatestautomation.web.youtube.PlayWarframeYouTubePage;
import com.solvd.carinatestautomation.web.warframe.RotatingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//div[@id='header']//a[contains(@href, 'https://www.warframe.com')]")
    private ExtendedWebElement headerNavButton;
    @FindBy(xpath = "//div[@id='header']//div[@class='HeaderMenuItem is-highlighted']")
    private ExtendedWebElement rotatingButton;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//div[@id='drpNavCommunity']")
    private ExtendedWebElement communityDropdownLabel;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://forums.warframe.com')]")
    private ExtendedWebElement forumsButton;
    @FindBy(xpath = "//div[@id='header']/div[@class='HeaderNavigationBar is-desktop']//div[@class='HeaderDesktopMenu']/div[@class='HeaderMenuItem HeaderMenuItem--external']/a")
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


    public ForumsPage pressForumsButton() {
        communityDropdownLabel.hover();
        forumsButton.clickIfPresent(1);
        return new ForumsPage(getDriver());
    }

    public PlayWarframeYouTubePage pressVideosButton() {
        videosButton.click();
        return new PlayWarframeYouTubePage(getDriver());
    }
}