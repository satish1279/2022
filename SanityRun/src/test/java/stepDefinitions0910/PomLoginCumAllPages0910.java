package stepDefinitions0910;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PagesElements0910;

public class PomLoginCumAllPages0910 {




	static WebDriver driver =null;

	PagesElements0910 pages;




	@Before

	public static void setup() {

		WebDriverManager.firefoxdriver().setup();

		driver= new FirefoxDriver();


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);



	}



	@After

	public static void tearDown() throws InterruptedException {


		Thread.sleep(10000);


		driver.close();
	}



	@BeforeStep

	public void beforeHook() throws IOException, InterruptedException {

		Thread.sleep(1000);

		System.out.println("test");
	}

	@AfterStep

	public void afterHook() throws IOException, InterruptedException {

		//Screenshots0910.takeScreenshot();
		Thread.sleep(5000);

	}





	@Given ("^User is on Login page$")
	public void loginPage() throws IOException {

		driver.navigate().to("https://goinfinity.beyond360apps.com/");


	}



	@When ("^User is logged in after entering the correct credentials$")
	public void enterUsername() {


		pages =  new PagesElements0910(driver);


		pages.entrUsernam();
		pages.entrPassword();
		pages.clikButon();

	}



	@And ("^Clicks on Login button$")
	public void homePage() throws InterruptedException {
		
		Thread.sleep(1000);

	}

	//	=========	Recognize Page  ========
	@When ("^Clicks on Recognize link$")
	public void recogLink() throws InterruptedException {

		pages.clikRecognize();
	}


	//	=========	Skill Insight Page  ========
	@And ("^Clicks on Skill Insight link$")
	public void skillinsightLink() throws InterruptedException {

		pages.clikSkillInsight();
	}


	//	=========	 Wellness  Page  ========
	@When ("^Clicks on Wellness link$")
	public void WellnessLink() throws InterruptedException {

		pages.clikWellness();
	}



	//=========	 Survey  Page  ========
	@And ("^Clicks on Survey link$")
	public void SurveyLink() throws InterruptedException {

		pages.clikSurvey();
	}



	//	=========	 My Summary  Page  ========
	@When ("^Clicks on My Summary link$")
	public void MySummaryLink() throws InterruptedException {

		pages.clikMySummary();
		
	}



	//	=========	 Dashboard Page  ========
	@And ("^Clicks on Dashboard link$")
	public void DashboardLink() throws InterruptedException {

		pages.clikDashboard();
	}

	@When ("^Clicks on Reports tab$")
	public void ReportTab() throws InterruptedException {

		pages.clikReports();
	}



	//	=========	 Redeem Page  ========
	@And ("^Clicks on Redeem link$")
	public void RedeemLink() throws InterruptedException {

		pages.clikRedeem();
	}




	//=========	 Logout cum Login Page  ========

	@When ("^Clicks on LogOut link$")
	public void LogoutLink() throws InterruptedException {
		
		pages.clikUserprofile();
		Thread.sleep(2000);
		
		pages.cliklogOut();
		Thread.sleep(2000);
		
		pages.clikOkBtn();
	}




	@Then ("^User is navigated to first page$")
	public void RedeemPG()  throws InterruptedException {


		System.out.println("this is login page");

	}


}



