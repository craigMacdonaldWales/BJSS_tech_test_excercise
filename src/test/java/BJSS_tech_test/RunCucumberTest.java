package BJSS_tech_test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        tags = {"@RESTCreateUser, @challengingDom, @dynamicallyLoadedElement"})


public class RunCucumberTest {
}
