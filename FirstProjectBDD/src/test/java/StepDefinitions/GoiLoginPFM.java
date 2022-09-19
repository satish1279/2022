//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PFMpage.LoginPFM;
//import io.cucumber.java.en.*;
//
//
//public class GoiLoginPFM {
//	WebDriver driver= null;
//
//	LoginPFM Login;
//
//
//
//	@Given("^User is on goi login page$")
//	public void GoiLoginPage(){
//
//		System.out.println("=========THIS IS PFM CLASS=============");
//
//
//		String projectPath	=	System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/BrowserDrivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.navigate().to("https://goinfinity.beyond360test.com/");
//	}
//
//
//
//	@When("^user enters (.*) and (.*)") 
//	public void GoiCredentials(String GOIuserName, String GOIpassWord) throws InterruptedException {
//
//		Login = new LoginPFM(driver);
//		Login.enterUsername(GOIuserName);
//		Login.enterPassword(GOIpassWord);	
//
//
//		//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(GOIuserName);
//		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(GOIpassWord);
//
//		Thread.sleep(2000);
//	}
//
//
//
//	@And("^clicks on goi login button$")
//	public void GoiButton() {
//
//		Login.clickButton();
//		//		driver.findElement(By.cssSelector("#cred_sign_in_button")).sendKeys(Keys.ENTER);
//	}
//
//
//
//	@Then("^User navigated to goi homepage$")
//	public void GoiHomepage() {
//
//		String pageTitle= driver.getTitle();
//		System.out.println("This is Homepage Method" + pageTitle);
//	}
//
//
//
//
//}
