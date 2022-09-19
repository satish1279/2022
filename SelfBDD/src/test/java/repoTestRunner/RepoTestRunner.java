package repoTestRunner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/resources/Features/AllLogins.feature",
		glue= {"StepDefinitions"},
				tags= "@Login",
		monochrome=true,
		plugin= {"pretty","json:target/cucumber-reports/cucumber.json"}
		)






public class RepoTestRunner {

}
