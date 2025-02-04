package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandlingExcelFile {

	public static void main(String[] args) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("sheet1");
		
		XSSFRow r1 = sheet1.createRow(0);
		XSSFRow r2 = sheet1.createRow(0);
		XSSFRow r3 = sheet1.createRow(0);
		
		XSSFCell c1 = r1.createCell;
		XSSFCell c2 = r1.createCell;
		XSSFCell c3 = r1.createCell;
		
		c1.setCellValue("Employee");
		c1.setCellValue("Title");
		c1.setCellValue("Age");
		
		File f = new File("data\\abc5.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		
		fo.close();

	}

}
