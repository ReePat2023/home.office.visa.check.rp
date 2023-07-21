package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;


    public void selectLengthOfStay(String moreOrLess){
        switch (moreOrLess){
            case "six_months_or_less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer_than_six_months":
                clickOnElement(moreThanSixMonths);
                break;
            default:
        }
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
