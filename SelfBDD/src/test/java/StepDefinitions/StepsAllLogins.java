package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsAllLogins {

	WebDriver driver= null;

	@Before
	public void browserSetup() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");


		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}



	@After
	public void tearDown() {
		driver.close();
	}


	@Given("^User is on Goi selfTesting Login page$")
	public void GoiselfTestLoginPage() {
		driver.navigate().to("https://goinfinity.beyond360test.com/Account/Login?ReturnUrl=/Home/MyWallet");
;
	}


	@When ("^User enters Goi selfTesting credentials$")
	public void GoiselfTestCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//input[@ng-model='EmailId']")).sendKeys("satish.jaiswal@beyond360.com");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("pass@12345");
		Thread.sleep(2000);
	}

	@And ("^User click on selfLogin button for Goi selfTesting environment$")
	public void GoiselfTestLoginButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='cred_sign_in_button']")).click();
		Thread.sleep(2000);
	}

	@Then ("^User navigates to the Goi selfTesting homepage$")
	public void GoiselfTestHomepage() throws InterruptedException {
		Thread.sleep(25000);
		System.out.println("Page Title is: " +	driver.getTitle());
		
	}

	
	@When ("^clikx on Recognize link$")
	public void recognLink() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]")).click();
		Thread.sleep(2000);

	}
	
    @Then ("^user landss on Recognize page$")
    public void recogPAGE() {
    	System.out.println("this is recog page");
    }
    
	
}