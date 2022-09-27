package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SStaken {


	public static void takeSS2209(WebDriver driver, String ssName) throws IOException {


		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./src/test/resources/SS2209/"+ ssName +".png");
		FileUtils.copyFile(source, dest);

	}



}

//File("./src/test/resources/SS2209" + driver.getTitle() +  " " + timestamp + ".png");