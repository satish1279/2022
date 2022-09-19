//package hooksSteps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//
//
//public class HooksSteps {
//
//	WebDriver driver = null;
//
//
//	@Before
//	public void BrowserSetUp() {
//
//		System.out.println("======inside setUp method");
//
//		String projectPath= System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/BrowserDrivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//	}
//
//
//	@After
//
//	public void tearDown() {
//
//		System.out.println("======this is tear down");
//		driver.close();
//		driver.quit();
//	}
//
//
//	@Given("^User is on Testinglogin page$")
//	public void loginPage() {
//
//		driver.navigate().to("https://goinfinity.beyond360test.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//
//	@When("^user is entering testingUsername and testingPassword$")
//	public void userCredntials() {
//
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("satish.jaiswal@beyond360.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass@1234");
//	}
//
//	@And("^clicks on Testinglogin button$")
//	public void loginButton() {
//
//		driver.findElement(By.xpath("//button[@id='cred_sign_in_button']")).click();
//
//	}
//
//	@Then("^user is redirected to the Testinghomepage$")
//	public void homepage() throws InterruptedException {
//
//		System.out.println("this is homepage method");
//
//		Thread.sleep(5000);
//	}
//
//	@And("^clicks on User Profile image$")
//	public void profileImage() {
//
//		driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]")).click();
//	}
//
//	@And("^clicks on Logout option$")
//	public void Logout() {
//
//		driver.findElement(By.xpath("//a[@title='Logout']")).click();
//	}
//
//
//	@And("^clicks on Yes button$")
//	public void Yes() {
//
//		driver.findElement(By.xpath("//button[@class='btn_filled btn_filled_primary']")).click();
//	}
//
//
//
//
//
//}
//
