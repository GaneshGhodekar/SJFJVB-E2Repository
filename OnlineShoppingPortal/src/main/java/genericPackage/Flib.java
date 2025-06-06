package genericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath, String sheetname, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.toString();
		return data;
	}

	public String readPropertyData(String propPath, String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath); // to specify path of property file
			
			  Properties prop = new Properties();// creating object of properties calss
			 prop.load(fis);    // To make file ready to read
			 String data = prop.getProperty(key); // to fetch data
			 return data;  //
		}
	public int getLastRowCount(String excelPath, String sheetname)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath); //To specify path of excel file
		Workbook wb = WorkbookFactory.create(fis); //To make file ready for read
		Sheet sheet = wb.getSheet(sheetname);  // To get into Sheet
		int rc = sheet.getLastRowNum(); // To get the no of rows present in sheet
		return rc;
	}
	public String readnumericData(String excelPath, String sheetname, int rowNo, int cellNo)throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath); //To specify path of excel file
		Workbook wb = WorkbookFactory.create(fis);//To make file ready for read
		Sheet sheet = wb.getSheet(sheetname);// To get into Sheet
		Row row = sheet.getRow(rowNo); // To get into row
		Cell cell = row.getCell(cellNo);//To get into cell
		long data = (long) cell.getNumericCellValue(); // Reading the numeric value from the cell
		
		String data1 = String.valueOf(data); //convering long type of data into String
		return data1;
	}
}
