package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCode {

	@Given("^User is on login page$")
	public void LoginPage(){
			System.out.println("This is LoginPage Method");
		 }


	@When("^User enters Username and Password$") 
	public void Credentials() {
		System.out.println("This is Credentials Method");
		
	}



	@And("^clicks on Login button$")
	public void Button() {
		System.out.println("This is Button Method");
		}



	@Then("^user is redirected to the homepage$")
	public void Homepage() {
		System.out.println("This is Homepage Method");
		}


}