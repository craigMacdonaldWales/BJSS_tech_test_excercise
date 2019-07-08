package BJSS_tech_test;

public class EnvironmentConfig {

    public final int TimeoutInSeconds = 30; // the global timeout.
    public final String APITestURI = "http://dummy.restapiexample.com/api/v1/";

    public int getTimeoutInSeconds(){
        return TimeoutInSeconds;
    }

    public String getAPITestURI() {
        return APITestURI;
    }

}
