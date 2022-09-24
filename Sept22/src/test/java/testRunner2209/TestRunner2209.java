package testRunner2209;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/FeatureFiles/Login2209.feature",
		glue= {"stepDefi2209"},
		monochrome=true,
			
		plugin= {"pretty","html:target/HTMLreport/loginReports.html"}
		
		)

//dryRun=false
// "pretty","html:target/HTMLreport/loginReports.html"
// ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
/// Login2108.feature

//features={"@target/failedTC.txt"}

//plugin=	"rerun:target/failedTC.txt"



public class TestRunner2209 {

}
