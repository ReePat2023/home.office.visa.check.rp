package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistener.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> reasonForVisitList;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }

    public void selectReasonForVisit(String reason) {
        Reporter.log("Select Reason For Visit" + reasonForVisitList.toString());
        CustomListeners.test.log(Status.PASS, "Select Reason For Visit" + reasonForVisitList.toString());
        for (WebElement element : reasonForVisitList) {
            if (element.getAttribute("value").equalsIgnoreCase(reason)) {
                element.click();
                break;
            }
        }
    }
}