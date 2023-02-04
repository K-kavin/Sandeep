package com.automation.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class ScreenShot implements Framework_Constants
{
	public static TakesScreenshot ts;
	public static void getPhoto(WebDriver driver) throws IOException
	{
		Date systemdate=new Date();
		String currentDate = systemdate.toString().replace(":", "-");
		ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst= new File(currentDate+Screenshot_Path+".jpeg");
		FileHandler.copy(src, dst);
	}
}