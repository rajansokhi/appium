package cucumber.stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"cucumber/stepdef"},
        features ={ "src/test/resource/cucumber/features/simpleTest/simple.feature"},
        format = {"json:target/integration_cucumber.json","html:build/LogCheckOut/cucumber-html-report"}
)

public class SimpleTestTest {
}

