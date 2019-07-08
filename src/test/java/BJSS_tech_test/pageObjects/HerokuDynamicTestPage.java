package BJSS_tech_test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BJSS_tech_test.EnvironmentConfig;

public class HerokuDynamicTestPage extends PageObject {

    private EnvironmentConfig envConfig = new EnvironmentConfig();

    public HerokuDynamicTestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button")
    private static WebElement startButton;

    @FindBy(id = "finish")
    private static WebElement finishConfirmation;

    @FindBy(css = "h4:nth-child(1)")
    private static WebElement finishMessage;

    public void clickStart(){
        startButton.click();
    }

    public void waitForFinish(){
        WebDriverWait wait = new WebDriverWait(driver, envConfig.getTimeoutInSeconds());
        wait.until(ExpectedConditions.visibilityOf(finishMessage));
    }

    public String getFinishMessageText(){
        return finishMessage.getText();
    }

}
