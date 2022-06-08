package CrossBrowser_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ZerodaKite_Pom3_home 
{//1.
	public static final String getactualUserId = null;
	@FindBy(xpath = "//span[text()='DAA677']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
	
	//2.
	public ZerodaKite_Pom3_home (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.methods
	
	public  String validatelUserId()
	{
		//String expectedUserId = userID;
		String actualUserId = userId.getText();
		return actualUserId;
		 
//		if(actualUserId.equals(expectedUserId))
//		{
//			System.out.println("tc is passed");
//		}
//		else
//		{
//			System.out.println("tc is failed");
//		}
//		
	
		
		
	}
	public void logOut() throws InterruptedException 
	{
		//4.	
				userId.click();
				Thread.sleep(1000);
				logOut.click();
	}
}
