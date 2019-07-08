package BJSS_tech_test.APIHelper;

public class JSONTemplates {

    // store request types here as API test coverage expands (single storage location for JSON blob examples.

    public String createUserRequestBody = null;




    public String getCreateUserRequestBody(String nameString){
        createUserRequestBody = "{\n" +
                "  \"name\": \" " + nameString + "\",\n" +
                "  \"salary\": \"12345\",\n" +
                "  \"age\": \"41\"\n" +
                "}";

        return createUserRequestBody;
    }


}
