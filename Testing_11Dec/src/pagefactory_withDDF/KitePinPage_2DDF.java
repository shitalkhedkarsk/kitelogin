package pagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage_2DDF 
{
	//1.variables declare
	@FindBy(xpath = "//input[@id='pin']") private WebElement enterPin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submitButton;
	//2.constructor
	public KitePinPage_2DDF (WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	//3.methods
	public void enterPINno(String pin)
	{
		enterPin.sendKeys(pin);
	}
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
