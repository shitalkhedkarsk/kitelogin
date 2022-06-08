package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("F:\\Excel-Data\\Book1.xlsx");
		
		Workbook test = WorkbookFactory.create(myfile);
		 Sheet mySheet = test.getSheet("sheet2");
		 Row myRow = mySheet.getRow(0);
		Cell myCell = myRow .getCell(0);
		String myValue = myCell.getStringCellValue();
		
		System.out.println(mySheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(mySheet.getRow(0).getCell(1).getStringCellValue());
		
		
		
		
		

	}

}
