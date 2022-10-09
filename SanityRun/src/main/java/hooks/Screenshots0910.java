package hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driverfactory0910.BaseClass0910;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class Screenshots0910 extends BaseClass0910{


	static String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());




	public static void takeScreenshot() throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;

		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:/Satish Jaiswal/DailySanity2022/" + driver.getTitle() +  " " + timestamp + ".png");
		FileUtils.copyFile(source,dest);

	}

}
