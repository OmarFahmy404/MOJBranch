package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HelperPage {
	
	
	public static final String  FILE_PATH="data.properties";

	  public static void saveDate(String key,String value)
	  {
		  Properties prop=new Properties();
		  
		  File file =new File(FILE_PATH);
		  
			  try {
				FileInputStream fileInputStream=new FileInputStream(file);
				prop.load(fileInputStream);
				fileInputStream.close();

				prop.setProperty(key, value);
		  
		  
			FileOutputStream fileOutputStream=new FileOutputStream(FILE_PATH);
			prop.store(fileOutputStream, null);
			fileOutputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  
	  
	  
	  public static String getData(String key) 
	  {
		  
		  Properties prop=new Properties();
		  FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(FILE_PATH);
			 prop.load(fileInputStream);
			  fileInputStream.close();
			  return prop.getProperty(key);
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

}}
