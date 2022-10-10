package stepDefinitions0910;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class GoiStaging0910 {


	private static final Logger logger= LogManager.getLogger("GoiStaging0910");

	static WebDriver driver =null;


	PagesElements0910 pages;




	@Before

	public static void setup() {

		WebDriverManager.firefoxdriver().setup();

		driver= new FirefoxDriver();


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://goinfinity.beyond360apps.com/");

		logger.info("Browser Started");
	}



	@After

	public static void tearDown() throws InterruptedException {

		Thread.sleep(1000);
		driver.close();
		logger.info("Browser Closed");
	}



	@BeforeStep

	public void beforeHook() throws IOException, InterruptedException {

		Thread.sleep(500);
	}



	@AfterStep

	public void takeScreenshot() throws IOException, InterruptedException {
		Thread.sleep(3000);

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		TakesScreenshot ts= (TakesScreenshot)driver;

		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:/Satish Jaiswal/DailySanity2022/Staging/" + driver.getTitle() +" " + timestamp + ".png");
		FileUtils.copyFile(source,dest);
		logger.info("Screenshot of taken for the page - " + driver.getTitle());

	}


	@Given ("^User is on Login page wrt Staging env$")
	public void loginPage() throws IOException, InterruptedException {

		Thread.sleep(500);
		logger.info("This is login page");
	}


	@When ("^User is logged in after entering the correct credentials wrt Staging env$")
	public void enterUsername() {

		pages =  new PagesElements0910(driver);

		pages.entrUsernam();
		pages.entrPassword();
		//pages.clikButon();
	}


	//	=========	Recognize Page  ========
	@And ("^Clicks on Recognize link wrt Staging env$")
	public void recogLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickRecognize();
		logger.info("This is Recognize page");

	}


	//	=========	Skill Insight Page  ========
	@When ("^Clicks on Skill Insight link wrt Staging env$")
	public void skillinsightLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickSkillInsight();
		logger.info("This is Feedback page");
	}


	//	=========	 Wellness  Page  ========
	@And ("^Clicks on Wellness link wrt Staging env$")
	public void WellnessLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickWellness();
		logger.info("This is Wellness page");
	}



	//=========	 Survey  Page  ========
	@When ("^Clicks on Survey link wrt Staging env$")
	public void SurveyLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickSurvey();
		logger.info("This is Survey page");
	}



	//	=========	 My Summary  Page  ========
	@And ("^Clicks on My Summary link wrt Staging env$")
	public void MySummaryLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickMySummary();
		logger.info("This is My Summary page");

	}

	//	=========	 Redeem Page  ========
	@When ("^Clicks on Redeem link wrt Staging env$")
	public void RedeemLink() throws InterruptedException {
		System.out.println("test");
		//pages.clickRedeem();
		logger.info("This is Redeem page");
	}


	//	=========	 Dashboard & Reports Page  ========
	@And ("^Clicks on Dashboard link wrt Staging env$")
	public void DashboardLink() throws InterruptedException {
		System.out.println("test");
		pages.clickDashboard();	
		logger.info("This is Dashboard page");
	}


	@When ("^Clicks on Reports tab wrt Staging env$")
	public void ReportTab() throws InterruptedException {
		//System.out.println("test");
		pages.clickReports();
		logger.info("This is Reports page");
	}

	@And ("^Clicks on Budget Head Report option from Select Report dropdown wrt Staging env$")
	public void clickBudgetHeadReport() throws InterruptedException {


		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickBudgetHeadReport();
		logger.info("This is Budget Head Report page");

	}


	@When ("^Clicks on Recognitions Report option from Select Report dropdown wrt Staging env$")
	public void clickRecognitionsReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRecognitionsReport();
		logger.info("This is Recognitions Report page");

	}

	@And ("^Clicks on Redemption Report option from Select Report dropdown wrt Staging env$")
	public void clickRedemptionReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRedemptionReport();
		logger.info("This is Redemption Report page");

	}

	@When ("^Clicks on User Login Report option from Select Report dropdown wrt Staging env$")
	public void clickUserLoginReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickUserLoginReport();
		logger.info("This is User Login Report page");

	}


	@And ("^Clicks on Data Visualization tab wrt Staging env$")
	public void dataVisualizationTab() throws InterruptedException {

		//System.out.println("test");

		pages.clickVisualization();
		logger.info("This is Data Visualization page");

	}


	//=========	 Logout cum Login Page  ========

	@When ("^Clicks on LogOut link wrt Staging env$")
	public void LogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(2000);

		pages.clickOkBtn();

		logger.info("This is LogOut page");
	}




	@Then ("^User is navigated to first page wrt Staging env$")
	public void RedeemPG()  throws InterruptedException {

		System.out.println("this is login page");

	}


}



