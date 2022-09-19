package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/loginn1509.feature"},
		glue= {"stepDefi1509"},
		monochrome=true
		
		
		
		)



public class TR1509 {

}
