package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


	public static WebDriver driver;

	public static Properties prop;

	public static FileInputStream	fis;



	public Base() {
		try {

			prop = new Properties();


			//String projectPath= System.getProperty("user.dir");


				fis = new FileInputStream("./src/test/resources/Config/config.properties");

			prop.load(fis);

		} 

		catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	@BeforeTest

	public static void setUp() {
		
		String browserName = prop.getProperty("browser");

				if( browserName.equalsIgnoreCase("chrome")){

					WebDriverManager.chromedriver().setup();

					driver= new ChromeDriver();

				}


				else if(browserName.equalsIgnoreCase("firefox")){

					WebDriverManager.firefoxdriver().setup();

					driver= new FirefoxDriver();

				}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}


	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}




}//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.navigate().to("https://goinfinity.beyond360test.com/Account/Login");
