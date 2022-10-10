package hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots0910 {

	public static  WebDriver driver;
	
	static String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());




	public static void takeScreenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;

		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:/Satish Jaiswal/DailySanity2022/" + driver.getTitle() +  " " + timestamp + ".png");
		FileUtils.copyFile(source,dest);

	}

}
