package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserFactory.BaseClass0510;

public class Login0510 extends BaseClass0510{

	
	@FindBy(xpath="//input[@name='username']")
	WebElement uName;	
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pWord;	

	
	@FindBy(css="#cred_sign_in_button")
	WebElement LoginButton;	

	

	public Login0510() {
	PageFactory.initElements(driver, this);
	}
	

	public void LoginPgActions (String Username, String Password) {
		
		uName.sendKeys(Username);
		pWord.sendKeys(Password);
		
		LoginButton.click();
		
	
}
}