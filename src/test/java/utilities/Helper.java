package utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class Helper
{

		
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
		  
				
	

