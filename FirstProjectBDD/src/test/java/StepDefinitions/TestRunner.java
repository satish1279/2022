package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/GoiAllEnv.feature", 
		glue={"StepDefinitions"},
		monochrome=true,
		publish = true
		)

public class TestRunner {


}
 
