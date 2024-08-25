package utilities;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class Helper
{

	/*public static void captureScreenshot(WebDriver driver,String screenshotName) 
	{
		Path dest= Paths.get("./Screenshots",screenshotName+".png"); //here we get our directory which in the project and put our screenshot name in it with extension png
		try {
			Files.createDirectories(dest.getParent()); //if there is no directory in the project it will be created ,and if the directory exist nothing will happen
			FileOutputStream out=new FileOutputStream(dest.toString()); //to start our stream and to convert and put our Screenshot destination in a file
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)); //to put our output(the screenshot) in our destination
			out.close();
			} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		  public static void captureScreenshot(WebDriver driver, String screenshotName) {
		        Path dest = Paths.get("./Screenshots", screenshotName + ".png");

		        try {
		            // Create directories if they don't exist
		            Files.createDirectories(dest.getParent());
		            // Capture screenshot
		            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		            // Save screenshot to file
		            Files.write(dest, screenshotBytes);
		            // Attach screenshot to Allure report
		            Allure.addAttachment(screenshotName, new ByteArrayInputStream(screenshotBytes));
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
				}
	

