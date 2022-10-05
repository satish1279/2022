package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.Base;

public class Login2209 extends Base{
	


 
	//============== Background ============//
	

	@FindBy(xpath="//input[@name='username']")
	WebElement uName;	
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pWord;	

	
	@FindBy(css="#cred_sign_in_button")
	WebElement LoginButton;	

	

	public Login2209() {
	PageFactory.initElements(driver, this);
	}
	

	public Homepage2209 LoginPg (String un, String pw) {
		
		uName.sendKeys(un);
		pWord.sendKeys(pw);
		
		LoginButton.click();
		
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", LoginButton);

		return new Homepage2209();
	}


 
}



