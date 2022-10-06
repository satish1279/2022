package testRunner0510;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="./src/test/resources/FeatureFiles/Login0510.feature",
		glue= {"stepDefinitions0510"},
		monochrome=true,
		plugin= {"pretty","html:target/htmlReorts/reports.html"}
		
		
		)




public class TestRunner0510 {

}
