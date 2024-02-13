package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.digitalextremes.DigitalExtremesPage;
import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.solvd.carinatestautomation.web.warframe.components.Footer;
import com.solvd.carinatestautomation.web.warframe.components.Header;
import com.solvd.carinatestautomation.web.youtube.PlayWarframeYouTubePage;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;
    @FindBy(id = "footer")
    private Footer footer;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url"));
    }

    public boolean isHeaderPresent() {
        return header.isUIObjectPresent(1);
    }

    public boolean isFooterPresent() {
        return footer.isUIObjectPresent(1);
    }

    public RotatingPage pressRotatingButton() {
        return header.pressRotatingButton();
    }

    public PlayWarframeYouTubePage pressVideosButton() {
        return header.pressVideosButton();
    }

    public DigitalExtremesPage pressNewsButton() {
        return header.pressHeaderNavButton().pressNewsButton();
    }

    public ForumsPage pressForumsButton() {
        return header.pressForumsButton();
    }

    public TermsOfUsePage pressTermsOfUseButton() {
        return footer.pressTermsOfUseButton();
    }

    public PrivacyPolicyPage pressPrivacyPolicyButton() {
        return footer.pressPrivacyPolicyButton();
    }

    public EndUserLicenseAgreementPage pressEulaButton() {
        return footer.pressEulaButton();
    }
}
