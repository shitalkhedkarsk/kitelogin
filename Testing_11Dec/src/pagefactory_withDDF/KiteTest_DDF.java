package pagefactory_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//excel
		FileInputStream myfile=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//String ui = sheet.getRow(0).getCell(0).getStringCellValue();
//		String pw = sheet.getRow(0).getCell(1).getStringCellValue();
//		String pin = sheet.getRow(0).getCell(2).getStringCellValue();
//		
		//.
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("version");
		WebDriver driver=new ChromeDriver(opt);
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		///driver.manage().window().maximize();
		Thread.sleep(1000);
		//handle browser 
		
		//1.call method
		KiteLoginPage_1DDF login=new KiteLoginPage_1DDF(driver);
		login.userIdEnter(sheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPassword(sheet.getRow(0).getCell(1).getStringCellValue());
		login.enterSubmitButton();
		//2.
		Thread.sleep(500);
		KitePinPage_2DDF pinPage=new KitePinPage_2DDF(driver);
		pinPage.enterPINno(sheet.getRow(0).getCell(2).getStringCellValue());
		pinPage.clickSubmitButton();
		//3.
		Thread.sleep(500);
		KiteHomePage_3ddf  home=new KiteHomePage_3ddf (driver);
		home.checkUserId();
		home.clickOnLogOutButton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
