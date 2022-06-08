package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1.excel path
		FileInputStream dynamic=new FileInputStream("F:\\\\Excel-Data\\\\Book1.xlsx");
		//2.create sheet path for sheet
		Sheet file = WorkbookFactory.create(dynamic).getSheet("sheet2");
		CellType type1 = file.getRow(0).getCell(0).getCellType();
		CellType type2 = file.getRow(0).getCell(1).getCellType();
		CellType type3 = file.getRow(0).getCell(2).getCellType();
		CellType type4 = file.getRow(0).getCell(3).getCellType();
		
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		
		String value1 = file.getRow(0).getCell(0).getStringCellValue();
		String value2 = file.getRow(0).getCell(1).getStringCellValue();
		double value3 = file.getRow(0).getCell(2).getNumericCellValue();
		boolean value4 = file.getRow(0).getCell(3).getBooleanCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
