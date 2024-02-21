package com.xpathSetting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleparisData extends BaseTest {
@Test
public void time() throws IOException {
	//class="tpl-fluid "
	
	FileInputStream	creaditionalTestData=new FileInputStream("./src/testDataFiles/LoginTestDataFiles.xlsx");
XSSFWorkbook	workBook=new XSSFWorkbook(creaditionalTestData);
	
XSSFSheet sheet	=workBook.getSheet("TestData");
	
	
	WebElement multipledata=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div"));
	
	 List<WebElement>rows=multipledata.findElements(By.tagName("tr"));
	for(int rowindex=0;rowindex<rows.size();rowindex++)
	{
		WebElement row=rows.get(rowindex);
		
		Row rowssheet=sheet.createRow(rowindex);
		
		
		
		
		List<WebElement>rowcells=row.findElements(By.tagName("td"));
		for(int rowcellindex=0;rowcellindex<rowcells.size();rowcellindex++) {
		Cell cellvlaue=rowssheet.createCell(rowcellindex);
		 
		 //cellvlaue.createCell(actualResult);
		
			WebElement cell=rowcells.get(rowcellindex);
			 String actualResult=cell.getText();
			System.out.print(actualResult);
			 cellvlaue.setCellValue(actualResult);
			
		}
		System.out.println();
		
		FileOutputStream fos=new FileOutputStream("./src/testDataFiles//LoginTestDataFiles.xlsx");
		workBook.write(fos);
		
		
		
	}
	 
	 
	 
	 
	 
	
}
}
