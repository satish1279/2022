package testRunner1242;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/featureFiles/Loginnn.feature",
		glue= {"stepDefinitionsPOM"},
		plugin= {"pretty"}
		)

 




public class Trunner1242 {

}
