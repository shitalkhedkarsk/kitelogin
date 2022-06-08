package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage2
{
		//1.variable declaration
		@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
		@FindBy( xpath = "//button[@type='submit']") private WebElement submitButton;
		
		//2.constructor
		public KitePinPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//3.methods
		public void enterPin()
		{
			Pin.sendKeys("866918");
		}
		public void enterPinbutton()
		{
			submitButton.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
