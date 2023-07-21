package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistener.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "")
    WebElement resultMessage;
    @FindBy(xpath = "")
    WebElement confirmResultMessage;

    public  String getResultMessage(){
        Reporter.log("Result Message" + resultMessage.toString());
        CustomListeners.test.log(Status.PASS, "Result Message" + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Confirm Result Message" + confirmResultMessage.toString());
        CustomListeners.test.log(Status.PASS, "Confirm Result Message" + confirmResultMessage.toString());
        String actualMessage = getResultMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"result message are not match");
    }
}
