package com.orangeHrmTestAddempolye;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.Log;

public class OrangeHrmAddempolye extends BaseTests{
	
	@Test(priority=1,description="The Login the userDetails")
	public void welcomepage() throws IOException
	{
		String userName="BAjay";
        System.out.println(userName);
By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
WebElement userNames=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
userNames.sendKeys(userName);


String userNamePassword="Ajay@9265";
System.out.println("The no of rowOfCell userNamePassword  :-"+userNamePassword);

By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(userNamePassword);

// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


By logInButtonProperty=By.className("button");
WebElement LogInButton=driver.findElement(logInButtonProperty);
LogInButton.click();
	
	}
	
		@Test(priority=2,description="addempolyeDetails")
public void addempolye() {
			
			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
			By pimProperty=By.id("menu_pim_viewPimModule");
		WebElement	pim=driver.findElement(pimProperty);
			Actions mousehoveroperation=new Actions(driver);
			mousehoveroperation.moveToElement(pim).build().perform();
			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		By	employeelistProperty=By.id("menu_pim_viewEmployeeList");
		WebElement  employeelist=driver.findElement(employeelistProperty);
		employeelist.click();
			
			
			
			
			
			
		}
		
		@Test(priority=3,description="The orangeHrmLOgin Details canbe see them")
		public void empolyelist() throws IOException
		{
			
			
		///html/body/div[1]/div[3]/div[2]/div
			
			By	webtableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
			WebElement webtabledata=driver.findElement(webtableProperty);
				FileInputStream testdatafile=new FileInputStream("./src/main/java/testDataFiles/LoginTestDataFiles.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(testdatafile);
				XSSFSheet testdatasheet=workbook.getSheet("TestData");
				//identify rows in the table  
				By rowdataProperty=By.tagName("tr");         
				List<WebElement>rowdata=webtabledata.findElements(rowdataProperty);
				for(int rowindex=0;rowindex<rowdata.size();rowindex++)
				{
				WebElement	row=rowdata.get(rowindex);
			 Row	rows =testdatasheet.createRow(rowindex);
			 
			 
			By  rowofcelldataProperty=By.tagName("td");
			List<WebElement>rowofcelldata=row.findElements(rowofcelldataProperty);

			for(int rowofcell=0;rowofcell<rowofcelldata.size();rowofcell++)
			{
				WebElement cell=rowofcelldata.get(rowofcell);
			String	data=cell.getText();
			Log.info(data);
			    Cell celldata=rows.createCell(rowofcell);
			    celldata.setCellValue(data);

			 
			}
			Log.info("The OrangeHrmAppication Functionality");
			 FileOutputStream testoutputfile=new FileOutputStream("./src/main/java/testDataResult/LoginTestDataFiles.xlsx");
			 workbook.write(testoutputfile);
			 
			}
		
		}


}
	
	
	

