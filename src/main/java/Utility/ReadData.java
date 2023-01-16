package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String readPropertyFile(String Value) throws Exception
	{
		Properties p=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\FrameworkProject\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(Value);
	}
	
	public static String readExcelFile(int row, int col) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\FrameworkProject\\TestData\\config.properties");
		Sheet ex = WorkbookFactory.create(file).getSheet("sheet");
	    String value = ex.getRow(row).getCell(col).getStringCellValue();  
	    return value;
		
	
}
}