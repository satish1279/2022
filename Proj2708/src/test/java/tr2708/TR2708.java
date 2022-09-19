package tr2708;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Feature/Home.feature",
		glue= {"pages2708"},
		monochrome=true
		
		
		
		
		)


public class TR2708 {

}
