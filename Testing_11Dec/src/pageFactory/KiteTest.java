package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.call 1st class- login page
		KiteLoginPage1 login=new KiteLoginPage1(driver);
		login.sendUserId();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(500);
		//2.call 2nd method
		KitePinPage2 pin=new KitePinPage2(driver);
		pin.enterPin();
		pin.enterPinbutton();
		Thread.sleep(500);
		//3.call 3rd method
		KiteHomePage3 home=new KiteHomePage3(driver);
		home.checkUserId();
		home.clickOnLogOutButton();
		Thread.sleep(500);
		driver.close();
		

	}

}
