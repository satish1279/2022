package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider0510 {

	public FileInputStream fis;
	public XSSFWorkbook wb;

	public XSSFSheet sheet;

	public XSSFRow row;
	public XSSFCell cell;
	String Path;

	

	public void fileRead() throws IOException {
		String Path= "./src/test/resources/DataFile/BDD Data.xlsx";
		
		
		fis= new FileInputStream(Path);
		wb= new XSSFWorkbook(fis);
		sheet=wb.getSheet("testData");

	}
	
	
	
	
	
	public int getRowCount(String sheetName) throws IOException {

		fileRead();

		int rowCount= sheet.getLastRowNum();

		wb.close();
		fis.close();

		return rowCount;
	}




	public int getCellCount(String sheetName, int rownum) throws IOException {


		fileRead();

		row= sheet.getRow(rownum);


		int cellCount= row.getLastCellNum();

		wb.close();
		fis.close();

		return cellCount;
	}




	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {

		fileRead();

		row= sheet.getRow(rownum);
		cell= row.getCell(colnum);


		DataFormatter formatter= new DataFormatter();
		String cellData= formatter.formatCellValue(cell);


		wb.close();
		fis.close();

		return cellData;

	}



}



