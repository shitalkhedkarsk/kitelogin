package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//1.program for different data types
		FileInputStream myfile= new FileInputStream("F:\\Excel-Data\\Book1.xlsx");
		//
		Sheet name = WorkbookFactory.create(myfile).getSheet("sheet2");
		//2.method for getting row no from excel sheet
		int totalrownum = name.getLastRowNum();
		System.out.println("total row no are "+totalrownum);//row start from 0
		
		
		//3.method for getting row no from excel sheet
		short lastCellNum = name.getRow(0).getLastCellNum();
		System.out.println("Total cell no is "+lastCellNum);//cell start with 1
		int newCellValue = lastCellNum-1;
	
		//for loop for row
		for(int i=0;i<=totalrownum;i++)
		{ 
			for(int j=0;j<=newCellValue ;j++)//for loop for cell
			{
				String display = name.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(display+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
