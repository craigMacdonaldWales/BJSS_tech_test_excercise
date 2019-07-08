package BJSS_tech_test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HerokuHomePage extends PageObject {

    public HerokuHomePage(WebDriver driver) {
        super(driver);
    }

    //TODO - implement conditional wait for page load

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDOMLink;

    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoadingLink;

    public boolean isInitialized() {
        return challengingDOMLink.isDisplayed();
    }

    public HerokuChallengingDOMPage clickChallengingDOMLink(){
        challengingDOMLink.click();
        return new HerokuChallengingDOMPage(driver);
    }

    public HerokuDynamicPage clickDynamicLoadingLink(){
        dynamicLoadingLink.click();
        return new HerokuDynamicPage(driver);
    }

}
