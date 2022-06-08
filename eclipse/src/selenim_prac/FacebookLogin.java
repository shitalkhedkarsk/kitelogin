package selenim_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		signUpButton.click();
		//webElement list
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement mobileNo = driver.findElement(By.name("reg_email__"));
		WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
		Actions act=new Actions(driver);
		act.sendKeys(firstName, "shital").sendKeys(Keys.TAB).sendKeys(lastName, "khedkar").sendKeys(Keys.TAB).sendKeys(mobileNo,"9766466372").sendKeys(newPassword, "Shital@123456").build().perform();
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		//2.dropdown
		signUpPageUsingActionsClass(day, "10");
		signUpPageUsingActionsClass(month, "Dec");
		signUpPageUsingActionsClass(year, "1990");
		//3.radio button
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		WebElement customButton = driver.findElement(By.xpath("//label[text()='Custom']"));
		customButton.click();
		WebElement selectDropDown = driver.findElement(By.name("preferred_pronoun"));
		signUpPageUsingActionsClass(selectDropDown, "He: \"Wish him a happy birthday!\"");
		
		
		
	}
	
	public static void signUpPageUsingActionsClass(WebElement element, String value)
	{
		
		Select s=new Select(element);
		s.selectByVisibleText(value);
		
	
		
	}

}
