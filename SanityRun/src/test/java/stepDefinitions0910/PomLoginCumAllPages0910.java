package stepDefinitions0910;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import hooks.Screenshots0910;
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
	Screenshots0910 takeSS;




	@Before

	public static void setup() {

		WebDriverManager.firefoxdriver().setup();

		driver= new FirefoxDriver();


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}



	@After

	public static void tearDown() throws InterruptedException {

		Thread.sleep(1000);
		driver.close();
	}



	@BeforeStep

	public void beforeHook() throws IOException, InterruptedException {

		Thread.sleep(500);
	}



	@AfterStep

	public void afterHook() throws IOException, InterruptedException {

		Thread.sleep(3000);

		takeSS = new Screenshots0910(driver);
		takeSS.takeScreenshot();

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


	//	=========	Recognize Page  ========
	@And ("^Clicks on Recognize link$")
	public void recogLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickRecognize();

	}


	//	=========	Skill Insight Page  ========
	@When ("^Clicks on Skill Insight link$")
	public void skillinsightLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickSkillInsight();
	}


	//	=========	 Wellness  Page  ========
	@And ("^Clicks on Wellness link$")
	public void WellnessLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickWellness();
	}



	//=========	 Survey  Page  ========
	@When ("^Clicks on Survey link$")
	public void SurveyLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickSurvey();
	}



	//	=========	 My Summary  Page  ========
	@And ("^Clicks on My Summary link$")
	public void MySummaryLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickMySummary();

	}

	//	=========	 Redeem Page  ========
	@When ("^Clicks on Redeem link$")
	public void RedeemLink() throws InterruptedException {
		System.out.println("test");
		//pages.clickRedeem();
	}


	//	=========	 Dashboard & Reports Page  ========
	@And ("^Clicks on Dashboard link$")
	public void DashboardLink() throws InterruptedException {
		System.out.println("test");
		pages.clickDashboard();	
	}


	@When ("^Clicks on Reports tab$")
	public void ReportTab() throws InterruptedException {
		//System.out.println("test");
		pages.clickReports();
	}

	@And ("^Clicks on Budget Head Report option from Select Report dropdown$")
	public void clickBudgetHeadReport() throws InterruptedException {


		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickBudgetHeadReport();
		
	}


	@When ("^Clicks on Recognitions Report option from Select Report dropdown$")
	public void clickRecognitionsReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRecognitionsReport();
		
	}

	@And ("^Clicks on Redemption Report option from Select Report dropdown$")
	public void clickRedemptionReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRedemptionReport();
		
	}

	@When ("^Clicks on User Login Report option from Select Report dropdown$")
	public void clickUserLoginReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickUserLoginReport();
		
	}


	@And ("^Clicks on Data Visualization tab$")
	public void dataVisualizationTab() throws InterruptedException {

		//System.out.println("test");

		pages.clickVisualization();
		
	}


	//=========	 Logout cum Login Page  ========

	@When ("^Clicks on LogOut link$")
	public void LogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(2000);

		pages.clickOkBtn();
	}




	@Then ("^User is navigated to first page$")
	public void RedeemPG()  throws InterruptedException {

		System.out.println("this is login page");

	}


}



