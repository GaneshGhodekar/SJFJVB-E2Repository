package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Creating object of FileInputStream and Specifying the path of the file
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		
		//To make file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//To get into sheet
		Sheet sheet = wb.getSheet("ipl");
		
		//To get into row
		Row row = sheet.getRow(5);
		
		//To get into cell/column
		Cell cell = row.getCell(0);
		
		//To read data from cell
		String data = cell.toString();
		
		//To print the data
		System.out.println(data);
		
		
	}

}
