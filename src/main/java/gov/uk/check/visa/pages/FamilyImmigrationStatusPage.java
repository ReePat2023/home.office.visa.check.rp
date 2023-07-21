package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @FindBy(xpath = "")
    WebElement yes;
    @FindBy(xpath = "")
    WebElement no;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;
            default:
        }
    }
}
