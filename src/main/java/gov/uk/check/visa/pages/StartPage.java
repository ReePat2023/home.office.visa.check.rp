package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookie;
    @FindBy(xpath = " //a[contains(text(),'Start now')]")
    WebElement startNowButton;
    public void clickOnAcceptCookieButton() {
        clickOnElement(acceptCookie);
    }

    public void clickStartNow() {
        clickOnElement(startNowButton);
    }
}
