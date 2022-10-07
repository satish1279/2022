package testRunnerGoi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featureFiles/Login2108.feature",
		glue= {"stepDefinitionsGoi", "hooks"},
		monochrome=true,
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failedTC.txt"
		}
		)


// "pretty","html:target/HTMLreport/loginReports.html"
// ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
/// Login2108.feature

//features={"@target/failedTC.txt"}



public class RunnerGoi2108 {

	
}
