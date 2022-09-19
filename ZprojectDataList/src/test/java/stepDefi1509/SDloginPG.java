package stepDefi1509;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login1509.Loginpg1509;

public class SDloginPG {

	WebDriver driver=null;
	Loginpg1509 loggin;


	@Given ("^usr is at loginnPG$")
	public void login1509() {

		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.navigate().to("https://goinfinity.beyond360test.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


	}


	@When ("^user enter credentials$")
	public void credlogin1509(DataTable dataTable) {

		loggin= new Loginpg1509(driver);


		List <Map <String, String>> credList= dataTable.asMaps();
		String userName=credList.get(0).get("usr");
		String password = credList.get(0).get("pwd");


		loggin.entrUsernam(userName);

		loggin.entrPassword(password);




	}

	@And ("^clik on buton$")
	public void butonlogin1509() {

		loggin.clikButon();
	}

	@Then ("^user lands on hmpgggg$")
	public void hmpglogin1509() throws InterruptedException {

		Thread.sleep(1000);
	}

}
