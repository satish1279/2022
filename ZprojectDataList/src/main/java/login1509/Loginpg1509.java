package login1509;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpg1509 {

	WebDriver driver;
	
	
	
	
	//============== Background ============//
	
		By txt_usrname=By.xpath("//input[@name='username']");

		By txt_password=By.xpath("//input[@name='password']");

		By btn_login=By.cssSelector("#cred_sign_in_button");

		
		public Loginpg1509(WebDriver driver){
			this.driver=driver;
		}

		public void entrUsernam(String un) {
			driver.findElement(txt_usrname).sendKeys(un);
		}

		public void entrPassword(String pw) {

			driver.findElement(txt_password).sendKeys(pw);
		}

		public void clikButon() {
			driver.findElement(btn_login).click();
		}


	
}
