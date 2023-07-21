package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistener.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "response")
    WebElement nationalityDropDownList;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectNationality(String nationality) throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Select Nationality" + nationalityDropDownList.toString());
        CustomListeners.test.log(Status.PASS, "Select Nationality" + nationalityDropDownList.toString());
       // mouseHoverToElementAndClick(nationalityDropDownList);
        try {
            driver.findElement(By.tagName("select"));
        }
        catch (NullPointerException e){

        }
       selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }
    public void clickNextStepButton(){
        Reporter.log("Click On Next Button" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next Button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
