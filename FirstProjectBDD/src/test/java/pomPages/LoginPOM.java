package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

	WebDriver driver;

	By txt_username=By.xpath("//input[@name='username']");

	By txt_password=By.xpath("//input[@name='password']");

	By btn_login= By.cssSelector("#cred_sign_in_button");

	
	public LoginPOM(WebDriver driver){
		this.driver=driver;
		
	}
	
	

	public void enterUsername(String GOIuserName) {

		driver.findElement(txt_username).sendKeys(GOIuserName);

	}


	public void enterPassword(String GOIpassWord) {

		driver.findElement(txt_password).sendKeys(GOIpassWord);
	}

	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}


}
