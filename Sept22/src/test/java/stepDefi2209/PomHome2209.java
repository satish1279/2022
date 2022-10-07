package stepDefi2209;

import driverFactory.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Homepage2209;
import pages.Login2209;

public class PomHome2209 extends Base{
	Homepage2209 hmpg = new Homepage2209();

	@Given ("^User is already logged into main app$")
	public void home1234125() throws InterruptedException  {
		Base.setUp();

		Login2209 login = new Login2209();
		login.LoginPg(prop.getProperty("Username"), prop.getProperty("Password"));

		Thread.sleep(5000);

	}

	@Given ("^user is on Homepage$")
	public void home0001() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When ("^Clicks on Recognize link$")
	public void clickRecognize() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Recognize();
		Thread.sleep(3000);

	}

	@And ("^Clicks on Skill Insight link$")
	public void clickFeedback() throws InterruptedException {

		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Feedback();
		Thread.sleep(2000);

	}

	@When ("^Clicks on Wellness link$")
	public void clickWellness() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Wellness();
		Thread.sleep(3000);

	}

	@And ("^Clicks on Survey link$")
	public void clickSurvey() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Survey();
		Thread.sleep(2000);

	}

	@When ("^Clicks on Job Referral link$")
	public void clickJobs() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Jobs();
		Thread.sleep(3000);

	}


	@And ("^Clicks on My Summary link$")
	public void clickMySummary() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_MySummary();
		Thread.sleep(3000);

	}


	@When ("^Clicks on Dashboard link$")
	public void clickDashbaord() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Dashboard();
		Thread.sleep(3000);

	}


	@And ("^Clicks on Redeem link$")
	public void clickRedeem() throws InterruptedException {
		Homepage2209 hmpg = new Homepage2209();
		hmpg.click_Redeem();
		Thread.sleep(2000);

	}







}
