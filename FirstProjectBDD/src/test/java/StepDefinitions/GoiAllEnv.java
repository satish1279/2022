
package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoiAllEnv {
	WebDriver driver= null;





	@Before

	public void setup() {
		String projectPath	=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/BrowserDrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void tearDown() {
		driver.close();
	}



	@BeforeStep
	public void beforeStepActivity() throws InterruptedException {
		
		

		//String pageTitle= driver.getTitle();
		//System.out.println("Current page is BS : " + pageTitle);	

	}


	@AfterStep

	public void afterStepActivity() throws InterruptedException, IOException {

		//Thread.sleep(2000);

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		String pageTitle= driver.getTitle();
	//	System.out.println("Current page is AS : " + pageTitle);



		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("src/test/resources/ssScreenshots/" + pageTitle +  " " + timestamp + ".png"));

		System.out.println("ss taken of page: " + pageTitle);
	}


	@Given("^User is on Testinglogin page$")
	public void Testinglogin() throws IOException{

		driver.navigate().to("https://goinfinity.beyond360test.com/");

	}


	@When("^user is entering testingUsername and testingPassword") 
	public void TestingCredentials() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@12345");


	}


	@And("^clicks on Testinglogin button$")
	public void Testingloginbutton() throws InterruptedException {

		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(15000);
	}


	@Then("^user is redirected to the Testinghomepage$")
	public void Testinghomepage() throws IOException, InterruptedException {

		System.out.println("This is Testing : " +driver.getTitle() );
	}



	/*======================== STAGING ENVIRONMENT =========================*/

	@Given("^User is on Staginglogin page$")
	public void Staginglogin() throws IOException{

		driver.navigate().to("https://goinfinity.beyond360apps.com/");

	}


	@When("^user is entering StagingUsername and StagingPassword") 
	public void StagingCredentials() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@12345");
	}


	@And("^clicks on Staginglogin button$")
	public void Stagingloginbutton() throws InterruptedException {

		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(25000);
	}


	@Then("^user is redirected to the Staginghomepage$")
	public void Staginghomepage() throws IOException, InterruptedException {
		System.out.println("This is Staging : " +driver.getTitle() );


	}

	/*======================== IndProduction ENVIRONMENT =========================*/

	@Given("^User is on IndProductionlogin page$")
	public void IndProductionlogin() throws IOException{

		driver.navigate().to("https://goinfinity.beyond360tech.com/");

	}


	@When("^user is entering IndProductionUsername and IndProductionPassword") 
	public void IndProductionCredentials() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@12345");
	}


	@And("^clicks on IndProductionlogin button$")
	public void IndProductionloginbutton() throws InterruptedException {

		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(25000);
	}


	@Then("^user is redirected to the IndProductionhomepage$")
	public void IndProductionhomepage() throws IOException, InterruptedException {
		System.out.println("This is IndProduction : " +driver.getTitle() );


	}
	
	
	
	/*======================== USProduction ENVIRONMENT =========================*/

	@Given("^User is on USProductionlogin page$")
	public void USProductionlogin() throws IOException{

		driver.navigate().to("https://goinfinity.beyond360hub.com/");

	}


	@When("^user is entering USProductionUsername and USProductionPassword") 
	public void USProductionCredentials() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@123456");
	}


	@And("^clicks on USProductionlogin button$")
	public void USProductionloginbutton() throws InterruptedException {

		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(25000);
	}


	@Then("^user is redirected to the USProductionhomepage$")
	public void USProductionhomepage() throws IOException, InterruptedException {
		System.out.println("This is USProduction : " +driver.getTitle() );


	}
	
	/*======================== BeyondUSdemo ENVIRONMENT =========================*/

	@Given("^User is on BeyondUSdemologin page$")
	public void BeyondUSdemologin() throws IOException{

		driver.navigate().to("https://beyondus-demo.beyond360apps.com/");

	}


	@When("^user is entering BeyondUSdemoUsername and BeyondUSdemoPassword") 
	public void BeyondUSdemoCredentials() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@123456");
	}


	@And("^clicks on BeyondUSdemologin button$")
	public void BeyondUSdemologinbutton() throws InterruptedException {

		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(25000);
	}


	@Then("^user is redirected to the BeyondUSdemohomepage$")
	public void BeyondUSdemohomepage() throws IOException, InterruptedException {
		System.out.println("This is BeyondUSdemo : " +driver.getTitle() );


	}
}
