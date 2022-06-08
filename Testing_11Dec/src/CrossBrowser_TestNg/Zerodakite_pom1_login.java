package CrossBrowser_TestNg;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodakite_pom1_login 
{
	//1.create variable
	@FindBy(id = ("userid"))private WebElement sendUSerId;
	@FindBy(id = ("password"))private WebElement sendPassword;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickButton;

	//declare constructor
	public Zerodakite_pom1_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//1step - initialize obj
		//then declare it inside constructor
	}
	
	//3.call method
	public void enterUserId(String uid)
	{
		sendUSerId.sendKeys(uid);
	}
	public void enterPassword(String pwd)
	{
		sendPassword.sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		clickButton.click();
	}
	
	
}
