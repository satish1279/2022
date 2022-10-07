package stepDefinitionsGoi;

import static org.testng.Assert.assertEquals;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesGoi.Login2108;

public class COPYLogin2109 {


	private Login2108 login= new Login2108(DriverFactory.getDriver());



	@Given ("^User is on Main App Login Page a$")
	public void usrLoginnpgg() throws InterruptedException
	{
Thread.sleep(500);

	}	 

	@ When ("^User enters correct UserName and Password a$")
	public void credusrLoginnpgg() throws InterruptedException
	{
		Thread.sleep(500);


	}	 


	@Then ("^landing page title should be - Home a$")

	public void hmpgusrLoginnpgg()
	{

String title1=		DriverFactory.getDriver().getTitle();

assertEquals("Login", title1);
	}	 

}
