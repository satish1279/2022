package stepDefinitions0910;

import java.io.IOException;

import driverfactory0910.BaseClass0910;
import hooks.Screenshots0910;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages0910.LogincumAllPages0910;

public class PomLoginCumAllPages0910 extends BaseClass0910{

	
	@BeforeStep
	
	public void beforeHook() throws IOException, InterruptedException {

	Thread.sleep(1000);
	}
	
	@AfterStep
	
	public void afterHook() throws IOException {
		
		Screenshots0910.takeScreenshot();
	}

	
	
@Given ("^User is on Login page$")
	public void loginPage() throws IOException {
		BaseClass0910.setup();
		
		Screenshots0910.takeScreenshot();
	}

	


	@When ("^User is logged in after entering the correct credentials$")
	public void enterUsername() {
		
		LogincumAllPages0910 login = new LogincumAllPages0910();
		login.EnterCredentials(prop.getProperty("username"), prop.getProperty("password"));


	}



	@Then ("^User is on Homepage$")
	public void homePage() {


	}

}
