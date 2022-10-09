package driverfactory0910;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass0910 {

	public static  WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;




	public BaseClass0910() {
		try {

			prop = new Properties();

			fis = new FileInputStream("./src/test/resources/PropertiesFile/Project0910.properties");


			prop.load(fis);

		} 

		catch (IOException e) {

			e.printStackTrace();
		}
	}

	


	public static void setup() {

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

		driver.navigate().to("https://goinfinity.beyond360test.com/");

	}



	
	

}