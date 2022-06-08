package waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_study_wait {
	//1.variable
	@FindBy(xpath = "//input[@id='email']") private WebElement enterLoginId;
	@FindBy(xpath = "//input[@id='pass']") private WebElement enterPassword;
	@FindBy(xpath = "//button[@name='login']") private WebElement clickOnButton;
	//2.constructor
	public  Facebook_study_wait(WebElement driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.methods
	public void login()
	{
		enterLoginId.sendKeys("snk.2945@gmail.com");	
	}
	
	public void password()
	{
		enterPassword.sendKeys("shitalkk");
	}
	public void button()
	{
		clickOnButton.click();
	}
	

}
