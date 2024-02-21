package com.xpathSetting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PariasTime extends BaseTest {

	@Test
	public void TimeSetting() throws IOException {
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			for(int rowcellindex=1;rowcellindex<=8;rowcellindex++)
			{
			
						
						
						
				//FileInputStream	creaditionalTestData=new FileInputStream("./src/testDataFiles/LoginTestDataFiles.xlsx");
				//XSSFWorkbook	workBook=new XSSFWorkbook(creaditionalTestData);
				
						
						By webTableCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowcellindex+"]");
			
			
					WebElement	webtableCityNamePropertys=driver.findElement(webTableCityNameProperty);
					String actualname=webtableCityNamePropertys.getText();
			System.out.print( actualname);
			}
		System.out.println();
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
