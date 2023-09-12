package TestPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static FileInputStream f; 
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	public static String getStringData(int a, int b) throws IOException   {
		f = new FileInputStream ("D:\\benila\\Test.xlsx");
		book = new XSSFWorkbook(f);
		sheet = book.getSheet("Sheet1");
		System.out.println("Getting Row :");
		Row r = sheet.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static int getIntegerData(int a, int b) throws IOException   {
		f = new FileInputStream ("D:\\benila\\Test.xlsx");
		book = new XSSFWorkbook(f);
		sheet = book.getSheet("Sheet1");
		Row r = sheet.getRow(a);
		Cell c = r.getCell(b);
		return (int)c.getNumericCellValue();
	}
	
	public static double getFloatData(int a, int b) throws IOException   {
		f = new FileInputStream ("D:\\benila\\Test.xlsx");
		book = new XSSFWorkbook(f);
		sheet = book.getSheet("Sheet1");
		Row r = sheet.getRow(a);
		Cell c = r.getCell(b);
		return c.getNumericCellValue();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = getStringData(0,1);
		System.out.println(data);
		int intdata =  getIntegerData(1,0);
		System.out.println(intdata);
		double ddata = getFloatData(1,1);
		System.out.println(ddata);
	}

}
