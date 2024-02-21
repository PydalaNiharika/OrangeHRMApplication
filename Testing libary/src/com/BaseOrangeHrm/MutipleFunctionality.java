package com.BaseOrangeHrm;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MutipleFunctionality  extends BaseTest{
	

	FileInputStream creaditionalTestData;

	// Identify workbook in the file
	XSSFWorkbook workBook;

	// Identify the Sheet in the WorkBook
	XSSFSheet sheet;

	// Identifying the number Active Rows with the test data in the sheet
	////int row_Count=sheet.getLastRowNum();
	   // System.out.println("The number of rows in the sheet is :-  "+row_Count);
	
	String expected_OrangeHrmLogInPanel;
	String actual_OrangeHrmLogInPanel;
	
	
	@Test
	
	
	
	public void Loginpannel() throws IOException {
		creaditionalTestData=new FileInputStream("./src/testDataFiles/OHRM_LogInTestData.xlsx");
		workBook=new XSSFWorkbook(creaditionalTestData);
		
		
		sheet=workBook.getSheet("TestData");
		int rowindex;
		
		int row_Count=sheet.getLastRowNum();
	    System.out.println("The number of rows in the sheet is :-  "+row_Count);
	for( rowindex=1;rowindex<=row_Count;rowindex++)
		
	
	
		
		
		expected_OrangeHrmLogInPanel="LOGIN Panel";
		System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);


		// of the current webpage - identifying the LOGIN Panel


		By OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
		WebElement OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);

		 actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
		System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);


		if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
		{
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
		sheet.getRow(rowindex).createCell(2).setCellValue(actual_OrangeHrmLogInPanel);
		sheet.getRow(rowindex).createCell(3).setCellValue("PASS");
		}
		else {
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
		sheet.getRow(rowindex).createCell(2).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
		sheet.getRow(rowindex).createCell(3).setCellValue("FAIL");
		}

		FileOutputStream Madhu=new FileOutputStream("./src/testDataResult/OHRM_LogInTestData.xlsx");
		                 
		                 workBook.write(Madhu);

		System.out.println();
		
}
	@Test(priority=2)
	public void Webpage(XSSFRow row) throws IOException
	{

		sheet=workBook.getSheet("TestData");
		int rowindex1;
		
		int row_Count=sheet.getLastRowNum();
	    System.out.println("The number of rows in the sheet is :-  "+row_Count);

	for( rowindex1=1;rowindex1<=row_Count;rowindex1++)
		
		creaditionalTestData=new FileInputStream("./src/testDataFiles/OHRM_LogInTestData.xlsx");
	workBook=new XSSFWorkbook(creaditionalTestData);
	row=sheet.getRow(rowindex1);
		             
		     
		           String userName=row.getCell(4).getStringCellValue();  //TestData
		           System.out.println("The no of rowOfCell userName is :-   "+userName);
		           
		           
		By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
		WebElement userNames=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
		userNames.sendKeys(userName);


		String userNamePassword=row.getCell(5).getStringCellValue();
		System.out.println("The no of rowOfCell userNamePassword  :-"+userNamePassword);

		   By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(userNamePassword);

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


		By logInButtonProperty=By.className("button");
		   WebElement LogInButton=driver.findElement(logInButtonProperty);
		LogInButton.click();

	}
	
@Test
public void welcomepage(XSSFRow row) throws IOException, InterruptedException



{
	sheet=workBook.getSheet("TestData");
	
	int rowindex1;
	
	int row_Count=sheet.getLastRowNum();
    System.out.println("The number of rows in the sheet is :-  "+row_Count);

for( rowindex1=1;rowindex1<=row_Count;rowindex1++)
	
	creaditionalTestData=new FileInputStream("./src/testDataFiles/OHRM_LogInTestData.xlsx");
workBook=new XSSFWorkbook(creaditionalTestData);
row=sheet.getRow(rowindex1);
	String Expected_WebpageUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	System.out.println("The Expected webpage Url is :-  "+Expected_WebpageUrl);

	          String actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
	          System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
	         

	//if (welcomeHrefAttributeValue.equals(Actual_WebpageText))
	          if(actual_OrangeHrmLogInPageURL.equals(Expected_WebpageUrl))
	{



	  //   *********** Expected Text - Welcome (should have)

	          // ---->>>>>>>>>>>>>> Performing click on the Welcome WebElement
	         
	         
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	String Actual_WebpageText= "welcome";
	System.out.println("The Expected OrangeHrm Home page text is Welcome  :-  "+Actual_WebpageText);


	By welcomeAdminProperty=By.linkText("Welcome Admin");
	WebElement welcome=driver.findElement(welcomeAdminProperty);


	String welcomeHrefAttributeValue=welcome.getAttribute("id");
	System.out.println("The href Attribute value of welcome webElement is :- "+welcomeHrefAttributeValue);



	System.out.println("Url is Matched - PASS");
	   sheet.getRow(rowindex1).createCell(7).setCellValue(welcomeHrefAttributeValue);
	   sheet.getRow(rowindex1).createCell(8).setCellValue("PASS ");
	   

	   
	   welcome.click();
	   
	Thread.sleep(5000);

	 //******************************************************************************************


	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>


	 
	By LogoutButtonProperty=By.linkText("Logout");
	WebElement LogoutButton=driver.findElement(LogoutButtonProperty);
	LogoutButton.click();
	 

	//******************************************************************************************    
	   



	                  // <div id="logInPanelHeading">LOGIN Panel</div>


	expected_OrangeHrmLogInPanel="LOGIN Panel";
	System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);


	                 //     of the current webpage - identifying the LOGIN Panel



	By OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
	WebElement OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);

	actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
	System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);


	if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
	{
	System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
	sheet.getRow(rowindex1).createCell(10).setCellValue(actual_OrangeHrmLogInPanel);
	sheet.getRow(rowindex1).createCell(11).setCellValue("PASS");
	}
	/*else {
	System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
	sheet.getRow(rowIndex).createCell(10).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
	sheet.getRow(rowIndex).createCell(11).setCellValue("FAIL");
	}*/



	   
	   
	}
	else {
	   System.out.println("Url is NOT Matched - FAIL");
	sheet.getRow(rowindex1).createCell(7).setCellValue("Not Match the title Welcome");
	sheet.getRow(rowindex1).createCell(8).setCellValue("Not Match The webpage FAIL");
	//driver.get(actual_OrangeHrmLogInPageURL);

	sheet.getRow(rowindex1).createCell(10).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
	sheet.getRow(rowindex1).createCell(11).setCellValue("FAIL");


	//driver.get(actual_OrangeHrmLogInPageURL);
	}
	         
	          FileOutputStream madhu=new FileOutputStream("./src/testDataResult/OHRM_LogInTestData.xlsx");
	workBook.write(madhu);


	         
	          driver.get(actual_OrangeHrmLogInPageURL);
}
}
