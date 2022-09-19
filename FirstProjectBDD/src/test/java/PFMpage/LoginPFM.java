package PFMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFM {


	@FindBy(xpath="//input[@ng-model=EmailId]")
	WebElement txt_username;

	@FindBy(xpath="//input[@ng-model=Password]")
	WebElement txt_password;

	@FindBy(xpath="//button[@id='cred_sign_in_button']")
	WebElement btn_login;



	WebDriver driver;

	public LoginPFM(WebDriver driver) {
		this.driver= driver;

		PageFactory.initElements(driver,  this);
		
	}


	public void enterUsername(String GOIuserName) {
		txt_username.sendKeys(GOIuserName);

	}

	public void enterPassword(String GOIpassWord) {
		txt_password.sendKeys(GOIpassWord);
	}

	public void clickButton() {
		btn_login.click();

	}




}


