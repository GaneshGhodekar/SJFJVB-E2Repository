package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Creating object of FileInputStream & specifying the path of file
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		
		//To make the file ready to read.
		Workbook wb = WorkbookFactory.create(fis);
		
		//To get into sheet
		Sheet sheet = wb.getSheet("ipl");
		
		//To Create new Row virtually
		Row row = sheet.createRow(11);
		
		//To Create cell Row virtually
		Cell cell = row.createCell(0);
		
		//To set value for the cell
		cell.setCellValue("PUNE");
		
		//To write the data in the Specified file
		
		FileOutputStream fos = new FileOutputStream("./testData/TestData.xlsx");
		wb.write(fos);
		
	}

}
