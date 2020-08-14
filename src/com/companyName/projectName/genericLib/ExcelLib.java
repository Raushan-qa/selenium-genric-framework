package com.companyName.projectName.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for handling Excel Library 
 */
public class ExcelLib {
	
    	XSSFWorkbook wb;
    	XSSFSheet sheet1;
    	String filePath ="resources"+File.separator+"TestData.xlsx";

	
	
	
	 public String getData(int sheetindex,int rownum,int columnno) throws IOException
	    {
		 	File src = new File(filePath);
 			FileInputStream fis= new FileInputStream(src);
 			wb =new XSSFWorkbook(fis); 
	    	sheet1= wb.getSheetAt(sheetindex);
	    	String data=sheet1.getRow(rownum).getCell(columnno).getStringCellValue().trim();
	    	return data;
	    }
	
	 public String getNumData(int sheetindex,int rownum,int columnno) throws IOException
	    {
		 	File src = new File(filePath);
			FileInputStream fis= new FileInputStream(src);
			wb =new XSSFWorkbook(fis); 
	    	sheet1= wb.getSheetAt(sheetindex);
	    	DataFormatter formatter = new DataFormatter();

	    	String empno = formatter.formatCellValue(sheet1.getRow(rownum).getCell(columnno));
//	    	String data= sheet1.getRow(rownum).getCell(columnno).getStringCellValue().trim();
	    	return empno;
	    }
	 
	 
	 public String getExcelData(String sheetName , int rowNum , int colNum)	throws InvalidFormatException, IOException{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			String data = row.getCell(colNum).getStringCellValue().trim();
			
			return data;
		}
		 
	public void setExcelData(String sheetName , int rowNum , int colNum ,String data) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		FileOutputStream fos = new FileOutputStream(filePath);
		cel.setCellValue(data);
		wb.write(fos);
		wb.close();
	}
	
	
	public int getRowCount(String sheetName) throws InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum()+1;
		return rowCount;
	}
	
	


}
