/*
package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import net.bytebuddy.asm.Advice.Enter;
import pomPages.LoginPOM;


public class GoiLoginPOM {
	WebDriver driver= null;
	LoginPOM login;


	@Given("^User is on goi login page$")
	public void GoiLoginPage(){

System.out.println("THIS IS POM FILE");
		
		String projectPath	=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/BrowserDrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://goinfinity.beyond360test.com/");
	}


	@When("^user enters (.*) and (.*)") 
	public void GoiCredentials(String GOIuserName, String GOIpassWord) throws InterruptedException {


		login= new LoginPOM(driver);

		login.enterUsername(GOIuserName);
		login.enterPassword(GOIpassWord);
		Thread.sleep(1000);

	}



	@And("^clicks on goi login button$")
	public void GoiButton() {

		login.clickLogin();
	}



	@Then("^User navigated to goi homepage$")
	public void GoiHomepage() throws InterruptedException {

		Thread.sleep(10000);

		String pageTitle= driver.getTitle();
		System.out.println("This is Homepage Method" + pageTitle);
	}




}

*/