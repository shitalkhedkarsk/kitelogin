package pom_Base_package;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	
	public static void capture_screnshot(WebDriver driver,String screen_shot_name)
	{
		try {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("F:\\screenshot"+screen_shot_name+".jpg");
			org.openqa.selenium.io.FileHandler.copy(screenshot, destination);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
