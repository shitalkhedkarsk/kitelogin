package framewok_study;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodaWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//excel
				FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
				Sheet mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");
				
				String myUserId = mySheet.getRow(0).getCell(0).getStringCellValue();
				String myPassword = mySheet.getRow(0).getCell(1).getStringCellValue();
				String myPin = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedrivver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//1.login
		WebElement userName = driver.findElement(By.xpath("//input[@id='userid']"));
		userName.sendKeys(myUserId);
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys(myPassword);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(1000);
		//2.PIN page
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(myPin);
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
