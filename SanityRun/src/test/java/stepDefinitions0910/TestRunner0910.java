package stepDefinitions0910;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/FeatureFiles/LoginCumAllPages.feature",
		glue= {"stepDefinitions0910"},
		monochrome=true
		
		
		
		)



public class TestRunner0910 {

}
