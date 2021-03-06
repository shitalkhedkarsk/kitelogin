package utility_class4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass_ExcelSheet 
{
	static Sheet mySheet;
	public static String pathForExcelSheet(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException 
	{
	//excel sheet path
			
			FileInputStream myFile=new FileInputStream("F:\\Excel-Data\\zerodaDDF.xlsx");
			mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");//define globally
			String value = mySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
			return value;
	}
	public static void takeScreenshot(WebDriver driver, int TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("F:\\screenshot\\kite "+TCID+".png");
		FileHandler.copy(source, destination);
		
		}
	public static String getDataFromPropertiesFile(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream myFile=new FileInputStream("F:\\eclipse\\Testing_11Dec\\property.properties");
		pro.load(myFile);
		String value = pro.getProperty(key);
		return value;
	}
}
