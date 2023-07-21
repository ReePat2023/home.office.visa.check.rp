package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistener.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @FindBy(xpath = "//input[@type='radio']")
    WebElement selectJobtypeList;

    public void selectJobType(String job){
        Reporter.log("Enter Job title" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job title" + nextStepButton.toString());
        sendTextToElement(nextStepButton,job);
    }
    public void clickNextStepButton(){
        Reporter.log("Enter Job title" + selectJobtypeList.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job title" + selectJobtypeList.toString());
        clickOnElement(selectJobtypeList);
    }
}
