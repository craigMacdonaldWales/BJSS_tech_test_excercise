package BJSS_tech_test;

import BJSS_tech_test.pageObjects.HerokuChallengingDOMPage;
import BJSS_tech_test.pageObjects.HerokuHomePage;
import BJSS_tech_test.pageObjects.HerokuDynamicPage;
import BJSS_tech_test.pageObjects.HerokuDynamicTestPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;

import static org.junit.Assert.*;

public class UIStepDefinitions {

    private String blueButtonID;
    private String redButtonID;
    private String greenButtonID;
    private WebDriver driver = new ChromeDriver();
    private HerokuChallengingDOMPage ChallengingDOMPage = new HerokuChallengingDOMPage(driver);
    private HerokuDynamicPage DynamicLoadingPage = new HerokuDynamicPage(driver);
    private HerokuDynamicTestPage ElementRenderPage = new HerokuDynamicTestPage(driver);

    public UIStepDefinitions() {
    }

    @Given("I have clicked {string}")
    public void launch_page_and_click_app(String app) {

        driver.get("https://the-internet.herokuapp.com/");
        HerokuHomePage HerokuHomePage = new HerokuHomePage(driver);

        assertTrue(HerokuHomePage.isInitialized());

        if (app.equals("challenging DOM")){
            ChallengingDOMPage = HerokuHomePage.clickChallengingDOMLink();
        }

        if (app.equals("dynamic loading")){
            DynamicLoadingPage = HerokuHomePage.clickDynamicLoadingLink();
        }

    }

    @Given("The buttons are present and IDs collected")
    public void the_buttons_are_present_and_IDs_collected() {
        HerokuChallengingDOMPage challengingDOMPage = new HerokuChallengingDOMPage(driver);
        assertTrue(ChallengingDOMPage.isInitialized());
        blueButtonID = ChallengingDOMPage.getBlueButtonID();
        redButtonID = ChallengingDOMPage.getRedButtonID();
        greenButtonID = ChallengingDOMPage.getGreenButtonID();
    }

    @When("The red button is clicked")
    public void the_red_button_is_clicked() {
        ChallengingDOMPage.clickRedButton();
    }

    @Then("the blue, red and green button IDs also change")
    public void the_blue_red_and_green_button_IDs_also_change() {
        assertNotEquals(blueButtonID, ChallengingDOMPage.getBlueButtonID());
        assertNotEquals(redButtonID, ChallengingDOMPage.getRedButtonID());
        assertNotEquals(greenButtonID, ChallengingDOMPage.getGreenButtonID());
    }

    @Given("I have clicked the element rendered after the fact link")
    public void I_have_clicked_the_element_rendered_after_the_fact_link(){
        ElementRenderPage = DynamicLoadingPage.clickDynamicLoadingLink();
    }

    @Given("I click the start button")
    public void I_click_the_start_button(){
        ElementRenderPage.clickStart();
        ElementRenderPage.waitForFinish();
    }

    @Given("{string} is visible")
    public void confirmation_is_visible(String message){
        Assert.assertEquals(message, ElementRenderPage.getFinishMessageText());
    }

    @After
    public void afterScenario(){
        driver.close();
    }


}
