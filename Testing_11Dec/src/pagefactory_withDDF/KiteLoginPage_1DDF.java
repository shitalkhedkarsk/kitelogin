package pagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage_1DDF
{
	//1.variable declair
	@FindBy(xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy(xpath = "//input[@id='password']") private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submitButton;
	//2.constructor
	public KiteLoginPage_1DDF(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//3.methods
	public void userIdEnter(String ui)
	{
		userId.sendKeys(ui);
	}
	public void enterPassword(String pw)
	{
		passWord.sendKeys(pw);
	}
	public void enterSubmitButton()
	{
		submitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
