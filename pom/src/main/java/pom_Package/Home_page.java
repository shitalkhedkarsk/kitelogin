package pom_Package;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{  
	
	@FindBy(id="loginspan") private WebElement loginButton;
	public Home_page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void click_on_login_button()
	{
		loginButton.click();
	}
	
}
