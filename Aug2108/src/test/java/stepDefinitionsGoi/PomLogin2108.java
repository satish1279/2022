package stepDefinitionsGoi;



import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesGoi.Login2108;

public class PomLogin2108 {



	private Login2108 login= new Login2108(DriverFactory.getDriver());



	@Given ("^User is on Login Page$")
	public void loginnPg() throws InterruptedException {


		DriverFactory.getDriver().navigate().to("https://goinfinity.beyond360test.com/Account/Login");
		
		Thread.sleep(500);
		String title1=		DriverFactory.getDriver().getTitle();

		assertEquals("Login", title1);

	}

/*
	@When ("^User enters correct credentials$")
	public void usrCred(DataTable dataTable) {

		List<Map<String, String>> userCredentials=	dataTable.asMaps();

		String userName=		userCredentials.get(0).get("UserName");
		String password=		userCredentials.get(0).get("Password");


		login.entrUsernam(userName);
		login.entrPassword(password);

	}	


	@And ("^Clicks on Login button$")
	public void butonLogin() throws InterruptedException {
		//login.clikButon();

		Thread.sleep(500);
	}



	@Then ("^Then landing page title should be - Home$")
	public void hompage() throws InterruptedException {

		Thread.sleep(500);
		String title1=		DriverFactory.getDriver().getTitle();

		assertEquals("Login", title1);


	}

*/





}



