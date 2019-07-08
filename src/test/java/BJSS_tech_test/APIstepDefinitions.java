package BJSS_tech_test;

import BJSS_tech_test.APIHelper.APIHelper;
import BJSS_tech_test.GenericHelper.GenericHelper;
import BJSS_tech_test.APIHelper.JSONTemplates;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.json;

public class APIstepDefinitions {

    private String JSONRequestBody = null;
    private APIHelper APIProcessor = new APIHelper();
    private Response response = null;
    private GenericHelper genericHelper = new GenericHelper();
    private String randomNameString = null;
    private JSONTemplates JSONTemplateExamples = new JSONTemplates();
    private String createdUserId null;

    @Given("A valid create user request JSON body is defined")
    public void a_valid_create_user_request_json_body_is_defined () {
        randomNameString = "BJSSTestUser" + genericHelper.randomAlphaNumeric(8);
        System.out.print("name string used: " + randomNameString);
        JSONRequestBody = JSONTemplateExamples.getCreateUserRequestBody(randomNameString);
    }

    @When("A create user POST request is submitted")
    public void a_create_user_POST_request_is_submitted(){
        response = APIProcessor.sendCreateRequestViaPost(JSONRequestBody);
    }

    @Then("A 200 response is recieved and the name used in the create request is found in the response body")
    public void analyse_response_to_create_user_request(){
        System.out.println(response.asString());
        Assert.assertTrue(response.asString().contains(randomNameString));
        Assert.assertEquals(200, response.getStatusCode());
    }

}
