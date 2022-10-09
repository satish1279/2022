package pages0910;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverfactory0910.BaseClass0910;





public class LogincumAllPages0910 extends BaseClass0910 {



	//============== Background ============//


	@FindBy(xpath="//input[@name='username']")
	WebElement uName;	


	@FindBy(xpath="//input[@name='password']")
	WebElement pWord;	


	@FindBy(css="#cred_sign_in_button")
	WebElement LoginButton;	



	public LogincumAllPages0910() {
		PageFactory.initElements(driver, this);
	}



	public void EnterCredentials (String username, String password) {

		uName.sendKeys(username);

		pWord.sendKeys(password);

		//	LoginButton.click();

	}

}






