package cucumber.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.saucelabs.appium.SimpleTest;


/**

 */
public class MyStepdefs {

    private SimpleTest test;

    @Given("^the app is running$")
    public void the_app_is_running() throws Throwable {
        test = new SimpleTest();
        test.setUp();

    }

    @Then("^run the simple tests$")
    public void run_the_simple_tests() throws Throwable {
        test.testUIComputation();
        test.testActive();
        test.testBasicAlert();
//        test.testBasicButton();
        test.testClear();
        test.testHideKeyboard();
//        test.testSlider();
    }

    @Then("^exit app$")
    public void exit_app() throws Throwable {
        test.tearDown();
    }
}
