package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GLogin {

	WebDriver driver= null;

	
	public void pageSetup() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}



	@Given ("^user is on Glogin page$")
	public void Glogin() {
		driver.navigate().to("https://goinfinity.beyond360tech.com/Account/Login?ReturnUrl=/Home/MyWallet");
	}


	@When ("^user enters the Gusername and Gpassword$")
	public void GUsername() throws InterruptedException  {

		driver.findElement(By.xpath("//input[@ng-model='EmailId']")).sendKeys("satish.jaiswal@beyond360.com");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("pass@12345");
		Thread.sleep(2000);
	}


	@And ("^clicks on Glogin button$")
	public void GloginButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='cred_sign_in_button']")).click();
		Thread.sleep(2000);  
	}



	@Then ("^user is redirected to the Ghomepage$")
	public void Ghomepage() throws InterruptedException {
		Thread.sleep(25000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}


	
}