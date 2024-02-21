package com.xpathSetting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParisExcelDataImport extends BaseTest {


	@Test
	public void Excelimport() throws IOException
	{
		

		FileInputStream creaditionalTestData=new FileInputStream("./src/testDataFiles/logindata.xlsx");

		// Identify workbook in the file
		XSSFWorkbook workBook=new XSSFWorkbook(creaditionalTestData);

		// Identify the Sheet in the WorkBook
		XSSFSheet sheet=workBook.getSheet("TestData");
		
		

		//By webTableCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		//WebElement parisindex=driver.findElement(webTableCityNameProperty);
		for(int rowindex=1;rowindex<=36;rowindex--) {
			
			By webTableCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td[1]");
			WebElement parisindex=driver.findElement(webTableCityNameProperty);	
			
		Row	row=sheet.getRow(rowindex);
		Cell cells=row.createCell(0);
	String 	actual=parisindex.getText();
		
		System.out.print(	actual);
		
		cells.setCellValue(	actual);
	    FileOutputStream fos=new FileOutputStream("./src/testDataResult/logindata.xlsx");
		workBook.write(fos);
			
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
