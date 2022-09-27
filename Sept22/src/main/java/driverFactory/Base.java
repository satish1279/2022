package driverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.SStaken;

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
	
	
	@BeforeMethod

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
	
	
	
	@AfterMethod

	public void ssFailed(ITestResult result) throws IOException{
		if (ITestResult.FAILURE==result.getStatus()) {
			
	SStaken.takeSS2209(driver, result.getName());

		}
		
		driver.quit();
	}
}