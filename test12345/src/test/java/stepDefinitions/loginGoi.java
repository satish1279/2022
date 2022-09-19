package stepDefinitions;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginGoi {

	WebDriver driver= null;
	
	@Before
	public void preset() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/BroswerDrivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	
	@Test
	
	  @Given("^user is on the loginn page$")
	  public void loginReview() {
		  
		  driver.get("https://goinfinity.beyond360test.com/");	  
		  
	  }
	  
	   @When ("^user entering userName & passWord into field$")
	   public void credentialsReview() {
			  
			  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("satish.jaiswal@beyond360.com");
			  driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("pass@1234");
			  
		  }
	    
	  
	   @And ("^clicks on Login button displayed on the page$")
	   public void buttonReview() {
			  driver.findElement(By.xpath("//button[@id='cred_sign_in_button']")).click();
			  
		
			  
		  }
	   
	   @Then ("^user is being redirected to its homepage$")
	   public void homepageReview() throws InterruptedException {
			  System.out.println("i am on"+driver.getTitle());
			  Thread.sleep(5000);
			  
		  }
	
	
	   @After
	   public void tearDown() {
		   driver.close();
		   
	   }
}
