package BJSS_tech_test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HerokuDynamicPage extends PageObject {

    public HerokuDynamicPage(WebDriver driver) {
        super(driver);
    }

    //TODO - implement conditional wait for page load based on element - do we even need this if using pagefactory?

    @FindBy(linkText = "Example 1: Element on page that is hidden")
    private WebElement hiddenElementLink;

    @FindBy(linkText = "Example 2: Element rendered after the fact")
    private WebElement elementRenderedLink;

    public HerokuDynamicTestPage clickDynamicLoadingLink(){
        elementRenderedLink.click();
        return new HerokuDynamicTestPage(driver);
    }

}
