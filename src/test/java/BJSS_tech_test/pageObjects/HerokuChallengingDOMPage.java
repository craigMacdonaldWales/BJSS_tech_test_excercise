package BJSS_tech_test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HerokuChallengingDOMPage extends PageObject {

    public HerokuChallengingDOMPage(WebDriver driver) {
        super(driver);
    }

    //TODO - implement conditional wait for page load based on element - do we even need this if using pagefactory?

    @FindBy(css = "*.button")
    private static WebElement blueButton;

    @FindBy(css =  "*.alert")
    private static WebElement redButton;

    @FindBy(css = "*.success")
    private static WebElement greenButton;

    public boolean isInitialized() {
        return blueButton.isDisplayed();
    }

    public WebElement getBlueButton() {
        return blueButton;
    }

    public WebElement getRedButton() {
        return redButton;
    }

    public WebElement getGreenButton() {
        return greenButton;
    }

    public String getBlueButtonID(){
        return blueButton.getAttribute("id");
    }

    public String getRedButtonID(){
        return redButton.getAttribute("id");
    }

    public String getGreenButtonID(){
        return greenButton.getAttribute("id");
    }
    public static void clickRedButton(){
        redButton.click();
    }

}