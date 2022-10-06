package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass0510 {


	public static WebDriver driver;





@BeforeMethod


	public static void setUp() throws InterruptedException {

		String browserName = "firefox";

		WebDriverManager.firefoxdriver().setup();

		driver= new FirefoxDriver();



	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.navigate().to("https://goinfinity.beyond360test.com/");

}





@AfterMethod

public static void tearDown() {
	driver.quit();
}

}
