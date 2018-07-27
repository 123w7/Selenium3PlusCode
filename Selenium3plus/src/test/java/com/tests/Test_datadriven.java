package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Test_datadriven
{
  @Test
  public void test()
  {
	  File file=new File("Book1.xlsx");
	  try {
		  
		  InputStream is=new FileInputStream(file);
		  
		  XSSFSheet sheet1=xssf.getSheet("Sheet1");
		  
		  System.out.println("First Row number: "+sheet1.getFirstRowNum());
		  System.out.println("Last Row number: "+sheet1.getLastRowNum());
		  for(int i=1;i<=sheet1.getLastRowNum();i++)
		  {
			  System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue()+"\t\t\t"+sheet1.getRow(i).getCell(1).getStringCellValue()+"\t\t\t");
		  }
		  
	  }
	  
  }
}
