package stepDefinitionsPOM;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.Login1242;


public class POMLoginPage1242 {

	
	WebDriver driver= null;
	Login1242 login;
	

	private static final Logger logger= LogManager.getLogger("POMLoginPage1242");
	


	@Given ("^loginn pg is opn$")
	public void loginnPg() {

	
		logger.info("this is for test");
		logger.fatal("this is fatal");
		logger.error("this is error");
		
		
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/browserDrivers/chromedriver.exe");

		driver= new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://goinfinity.beyond360test.com/Account/Login?ReturnUrl=/Home/MyWallet");
		
	logger.info("user is on login page");

	}

	@When ("^entrs usrNam & pwd$")
	public void usrCred() {

		login= new Login1242(driver);

		login.entrUsernam();
		login.entrPassword();
	

	}	


	@And ("^clix on login buton$")
	public void butonLogin() {
		//login.clikButon();

	}
	@Then ("^usr sees hmpg$")
	public void hmPG() throws InterruptedException {
		Thread.sleep(5000);

		String pageTitle= driver.getTitle();
		System.out.println("this is: " +pageTitle);

	}


	//	@And ("^user waits on pg$")
	//	public void hmPGwait() throws InterruptedException {
	//		String pageTitle= driver.getTitle();
	//		
	//		System.out.println("this is still : " +pageTitle);
	//		//Thread.sleep(2000);
	//	}
	//	



	@Given ("^user is on hmpg itslf$")
	public void WalletPG() {
		System.out.println("this is XYZ");
	}    


	@When ("^clix on Recognize link$")
	public void recogLinks() throws InterruptedException {
		login.clikRecognize();
	}

	@And ("^wait for page load$")
	public void recogPGtest() throws InterruptedException {
		Thread.sleep(2000);


	}


	@Then ("^user lands on Recognize page$")
	public void recogPGtitle() throws InterruptedException {
		//Thread.sleep(2000);
		String pageTitle= driver.getTitle();
		System.out.println("this is: " + pageTitle);

	}


}
