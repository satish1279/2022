package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Base;



public class Homepage2209 extends Base {



	@FindBy(css="a[class='cursorPointer'][href='Recognize/Recognize']")
	WebElement Recognize;

	@FindBy(css="a[class='cursorPointer'][href='Feedback/Index']")
	WebElement Feedback;

	@FindBy(css="a[class='cursorPointer'][href='Wellness/index']")
	WebElement Wellness;

	@FindBy(css="a[class='cursorPointer'][href='Survey/Index']")
	WebElement Survey;

	@FindBy(css="a[class='cursorPointer'][href='managejob/index']")
	WebElement Jobs;

	@FindBy(css="a[class='cursorPointer'][href='Home/viewProfile']")
	WebElement MySummary;

	@FindBy(css="a[class='cursorPointer'][href='Dashboard/Dashboard']")
	WebElement Dashboard;

	@FindBy(css="a[class='cursorPointer'][href='Redeem/RedeemPlus']")
	WebElement Redeem;

	
	
	
	public Homepage2209() {
		PageFactory.initElements(driver, this);
	}



	public void click_Recognize() {

		Recognize.click();
	}


	public void click_Feedback() {

		Feedback.click();
	}

	public void click_Wellness() {

		Wellness.click();
	}

	public void click_Survey() {

		Survey.click();
	}

	public void click_Jobs() {

		Jobs.click();
	}

	public void click_MySummary() {

		MySummary.click();
	}

	public void click_Dashboard() {

		Dashboard.click();
	}

	public void click_Redeem() {

		Redeem.click();
	}







}


