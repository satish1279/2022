package hooksSteps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features=("src/test/resources/Features/GoiAllEnv.feature"),
glue={"hooksSteps"},
monochrome=true,
plugin={"pretty", "html:target/HtmlReports/hooksHtml.html"}
)
	
	
	public class HooksRunnerClasss {
		

	
}

