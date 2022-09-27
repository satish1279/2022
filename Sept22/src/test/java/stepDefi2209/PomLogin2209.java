package stepDefi2209;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverFactory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login2209;

public class PomLogin2209 extends Base {
WebDriver driver;


	@Given ("^User is on Login Page2209$")
	public void loginnPg2209() throws InterruptedException, IOException {

		Base.setUp();
	}


@Test
	@When ("^User logged into app2209$")
	public void usrCred2209() {
		
		Login2209 login= new Login2209();
		login.LoginPg(prop.getProperty("Username"), prop.getProperty("Password"));
	}	


 

	/*@And ("^Clicks on Login button2209$")
	public void butonLogin() throws InterruptedException {
login.
		
		
		
	}
*/

	@Then ("^Then landing on Homepage2209$")
	public void hompage() throws InterruptedException {

		Thread.sleep(500);


		//	System.out.println(driver.getTitle());


	}



}

