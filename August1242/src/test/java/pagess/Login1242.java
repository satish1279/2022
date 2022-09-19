package pagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1242 {

	WebDriver driver;
	
	By txt_usrname=By.xpath("//input[@name='username']");
	By txt_password=By.xpath("//input[@name='password']");
	By btn_login=By.cssSelector("#cred_sign_in_button");
	By link_recognize=By.xpath("//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]");
	
	public Login1242(WebDriver driver) {
		this.driver=driver;
	}
	
	public void entrUsernam() {
		driver.findElement(txt_usrname).sendKeys("satish.jaiswal@beyond360.com");
	}
	
	public void entrPassword() {
		driver.findElement(txt_password).sendKeys("pass@12345");
	
	}
	public void clikButon() {
		driver.findElement(btn_login).click();
	}
	public void clikRecognize() {	
		driver.findElement(link_recognize).click();
	
}
}
