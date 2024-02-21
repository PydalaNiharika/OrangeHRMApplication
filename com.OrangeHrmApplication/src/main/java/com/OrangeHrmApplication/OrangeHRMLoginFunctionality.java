package com.OrangeHrmApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.Log;

public class OrangeHRMLoginFunctionality extends BaseTest {
	String expected_OrangeHRMApplicationLogInPageText;
	By orangeHRMApplicationLogInPageTextProperty;
	WebElement orangeHRMApplicationLogInPage;

	String actual_OrangeHRMApplicationLogInPageText;

	@Test(priority=1,description="Validating OrangeHRM Application LogIn WebPage")
	public void logInPageTest()
	{
//driver
	// Validating Title
	String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

	String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
	Log.info(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

	if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
	{
	Log.info("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
	}
	else
	{
Log.info("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
	}

	// validating Url

	// Validating Text - LOGIN Panel

	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	Log.info(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
	orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

	actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
	Log.info(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
		Log.info(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
		Log.info(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}


	}

	Row logInTestDataRow;
	Cell userNameTestDataCell;
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;
	FileInputStream propertiesFile;
	Properties properties;


	@Test(priority=2,description="Validating OrangeHRM Application LogIn Functionality")
	public void logInTest() throws IOException
	{

	logInTestDataFile= new FileInputStream(".");
	workBook= new XSSFWorkbook(logInTestDataFile);
	logInTestDataSheet= workBook.getSheet("TestData");

	logInTestDataRow=logInTestDataSheet.getRow(1);
	userNameTestDataCell=logInTestDataRow.getCell(0);

	String userNameTestData=userNameTestDataCell.getStringCellValue();

	// Identifying the Properties file - since the properties of the WebElement are stored in it
	propertiesFile = new FileInputStream("./src/main/java/com/OrangeHrmApplication/OrangeHRMLoginFunctionality.java");

	properties = new Properties();
	properties.load(propertiesFile);




	// String userNameTestData="srini"; // Test Data
	By userNamePoperty=By.id(properties.getProperty("orangeHRMLogInPageUserNameProperty")); // Property of an element is identified and assigned to a variable
	WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Webpage
	userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement


	Cell passwordTestDataCell=logInTestDataRow.getCell(1);
	String passwordTestData=passwordTestDataCell.getStringCellValue();
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">


	// String passwordTestData="Q@Trainer7";
	By passwordProperty=By.name(properties.getProperty("orangeHRMLogInPagePasswordProperty"));
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);



	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className(properties.getProperty("orangeHRMLogInPageLogInButtonProperty"));
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();



	}
	WebElement welComeAdmin;
	@Test(priority=3,description="Validating OrangeHRM Application HomePage WebPage")
	public void homePageTest() throws IOException
	{

	// Validating Title
	String expected_OrangeHRMAplicationHOMEPageTitle="OrangeHRM";
	Log.info(" The expected title of the OrangeHRm Application HOME Page is :- "+expected_OrangeHRMAplicationHOMEPageTitle);

	String actual_OrangeHRMAplicationHOMEPageTitle=driver.getTitle();
	Log.info(" The actual title of the OrangeHRm Application HOME Page is :- "+actual_OrangeHRMAplicationHOMEPageTitle);

	if(actual_OrangeHRMAplicationHOMEPageTitle.equals(expected_OrangeHRMAplicationHOMEPageTitle))
	{
		Log.info("Successfully Navigated to OrangeHRM Application HOME WebPage - PASS");
	}
	else
	{
		Log.info("Failed to Navigate to OrangeHRM Application HOME WebPage - FAIL");
	}

	// Validating OrangeHRM Appliation Home Page - expected Text - Welcome (should have)

	// Properties of WelCome Admin Element
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	// By welComeAdminProperty=By.id("welcome");
	//By welComeAdminProperty=By.linkText("Welcome Admin");
	// By welComeAdminProperty=By.partialLinkText("Welcome");
	By welComeAdminProperty=By.partialLinkText(properties.getProperty("orangeHRMHomePageWelcomeAdminProperty"));

	welComeAdmin=driver.findElement(welComeAdminProperty);

	String expected_OrangeHRMApplicationHomePageText="Welcome";
	System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
		Log.info(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");

	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

	}
	else
	{
		Log.info("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");


	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	}

	FileOutputStream testResultFile = new FileOutputStream("./src/main/java/testDataResult/logindata.xlsx");
	workBook.write(testResultFile);

	}

	@Test(priority=4,description="Validating OrangeHRM Application LogOut Functionality")
	public void logOutTest() throws InterruptedException
	{
	welComeAdmin.click();


	// Synchronization - The Wait time given / placed with in the Test Script to hault the
//	                    Test Script Execution for a duration

	// forcing the test script to wait for a particular Time/duration

	Thread.sleep(5000); // wait for Java

	// Properties of LogOut Element
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	//driver.findElement(By.linkText("Logout")).click();

	/* By logOuutProperty=By.linkText("Logout");
	WebElement logOutt=driver.findElement(logOuutProperty);
	logOutt.click();
	*/
	By logOutProperty=By.linkText(properties.getProperty("orangeHRMHomePageLogOutProperty"));
	WebElement logOut=driver.findElement(logOutProperty);
	logOut.click();

	}

	/*
	@Test(priority=4,description="Validating OrangeHRM Application LogIn Page Test")
	public void logInPageTestAfterLogOutTest()
	{
	// validating LogIn WebPage
	// Application with Browser should be closed

	// <div id="logInPanelHeading">LOGIN Panel</div>

	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	By orangeHRMApplicationLogInPageTxtProperty=By.id("logInPanelHeading");
	WebElement orangeHRMApplicationLogInPageWebElement=driver.findElement(orangeHRMApplicationLogInPageTxtProperty);

	String actual_OrangeHRMApplicationLogInWebPageText=orangeHRMApplicationLogInPageWebElement.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInWebPageText);

	if(actual_OrangeHRMApplicationLogInWebPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
	System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}

	}

	*/

}
