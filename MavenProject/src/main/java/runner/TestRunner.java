package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"stepDefinitions"},
		plugin= {"html:target/cucumber-html-report","junit:target/cucumber-results.xml"}
		)
public class TestRunner {

}
