package com.OrangeHrm;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeLOginfunctionalitydata {
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	
	WebDriver driver;
	  String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	  System.setProperty("webdriver.edge.driver","./WebDriver/msedgedriver.exe");
	  driver=new EdgeDriver();

	  driver.get(applicationUrlAddress);


	  Thread.sleep(5000);
	  //******* LogIn with Validted Test Data


	                  //Identify the File in the system");
	         
	  FileInputStream logInTestDataFile=new FileInputStream("./src/testDataFiles/OHRMLOGINDATA.xlsx");
	  
	  
	  //Identify the WorkBook in the File
	  XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);

	  //Identify the Sheet in the WorkBook
	       XSSFSheet Sheet=workBook.getSheet("TestData");
	   
	       
	       int row_Count =Sheet.getLastRowNum();
	  System.out.println(row_Count);
	   
	       
	       for(int indexrow=1;  indexrow<=Sheet.getLastRowNum();  indexrow++)
	       {
	     
	       XSSFRow row =Sheet.getRow(indexrow);

	                 //   String userName=row.getCell(0).getStringCellValue();
	                //    String userNamePassword=row.getCell(1).getStringCellValue();
	                   
	       
	                  String userName=row.getCell(0).getStringCellValue();  //TestData
	      By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
	  WebElement userNames=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
	  userNames.sendKeys(userName);


	  String userNamePassword=row.getCell(1).getStringCellValue();
	          By passwordProperty=By.name("txtPassword");
	  WebElement password=driver.findElement(passwordProperty);
	  password.sendKeys(userNamePassword);

	  // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


	  By logInButtonProperty=By.className("button");
	  WebElement LogInButton=driver.findElement(logInButtonProperty);
	  LogInButton.click();

	                   
	    //---------->>>>>>>>>>>      OR        <<<<<<<<<<<<<<<-------------------------
	                   
	   
	      /*  
	       driver .findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(userName);
	                   driver .findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	                   driver .findElement(By.xpath("//input[@name='Submit']")).click();
	                   
	            */
	                   
	                   
	                   
	                   
	                 //**** Expected URL - orangehrm-4.2.0.1 (should have)
	           
	           
	                   String expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	           
	           
	            System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
	           
	            //of the current webpage - identifying the URL
	           
	            String actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
	            System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
	           
	            if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL))
	            {
	            System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
	            Sheet.getRow(indexrow).createCell(2).setCellValue("pass");
	            }
	            else {
	            System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
	            Sheet.getRow(indexrow).createCell(2).setCellValue("FAIL");
	          File invaliddata=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(invaliddata,new File("./Screenshot/"+actual_OrangeHrmLogInPageURL+".png"));
	            }
	            FileOutputStream Madhu=new FileOutputStream("./src/testDataResult/OHRMLOGINDATA.xlsx");
	                   
	                   workBook.write(Madhu);
	                 
	                   Thread.sleep(5000);
	                   
	                   driver.get(applicationUrlAddress);
	           
	           
	            System.out.println("_____________________________________________________________________");
	           
	           
	               
	       
	       }
	       driver.close();
}
}
