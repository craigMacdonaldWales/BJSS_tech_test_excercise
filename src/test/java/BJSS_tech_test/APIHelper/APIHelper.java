package BJSS_tech_test.APIHelper;

import BJSS_tech_test.EnvironmentConfig;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIHelper {

    private EnvironmentConfig envConfig = new EnvironmentConfig();

    public Response sendCreateRequestViaPost(String requestBody) {
        RestAssured.baseURI = envConfig.getAPITestURI();;

        Response response = null;

        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/create");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;

    }

}
