package com.OrangeHrmApplicationLoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmpolyee extends BaseTest{
	String expected_OrangeHRMApplicationLogInPageText;
	By orangeHRMApplicationLogInPageTextProperty;
	WebElement orangeHRMApplicationLogInPage;

	String actual_OrangeHRMApplicationLogInPageText;

	@Test(priority=1,description="Validating OrangeHRM Application LogIn WebPage")
	public void logInPageTest()
	{

	// Validating Title
	String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

	String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
	System.out.println(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

	if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
	{
	System.out.println("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
	}

	// validating Url

	// Validating Text - LOGIN Panel

	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
	orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

	actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
	System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}


	}
	
	
	
	
FileInputStream fis;
Properties proprety;
@Test(priority=2,description="Validating OrangeHrmLoginTest page")
public void logInTest() throws IOException
	{
proprety=new Properties() ;
fis=new FileInputStream("./src/com/Config/OrangeApplicationAddempolyeProprties"); 

proprety.load(fis);
	 String userNameTestData="BAjay"; // Test Data
	By userNamePoperty=By.id(proprety.getProperty("orangeHRMLogInPageUserNameProperty")); // Property of an element is identified and assigned to a variable
	WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Webpage
	userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement


	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">


	String passwordTestData="Ajay@9265";
	By passwordProperty=By.name(proprety.getProperty("orangeHRMLogInPagePasswordProperty"));
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);



	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className(proprety.getProperty("orangeHRMLogInPageLogInButtonProperty"));
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();



	}
	WebElement welComeAdmin;
	@Test(priority=3,description="Validating OrangeHRM Application HomePage WebPage")
	public void homePageTest() throws IOException
	{
		
		
		proprety=new Properties() ;
		fis=new FileInputStream("./src/com/Config/OrangeApplicationAddempolyeProprties"); 

		proprety.load(fis);

	// Validating Title
	String expected_OrangeHRMAplicationHOMEPageTitle="OrangeHRM";
	System.out.println(" The expected title of the OrangeHRm Application HOME Page is :- "+expected_OrangeHRMAplicationHOMEPageTitle);

	String actual_OrangeHRMAplicationHOMEPageTitle=driver.getTitle();
	System.out.println(" The actual title of the OrangeHRm Application HOME Page is :- "+actual_OrangeHRMAplicationHOMEPageTitle);

	if(actual_OrangeHRMAplicationHOMEPageTitle.equals(expected_OrangeHRMAplicationHOMEPageTitle))
	{
	System.out.println("Successfully Navigated to OrangeHRM Application HOME WebPage - PASS");
	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application HOME WebPage - FAIL");
	}

	// Validating OrangeHRM Appliation Home Page - expected Text - Welcome (should have)

	// Properties of WelCome Admin Element
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	// By welComeAdminProperty=By.id("welcome");
	//By welComeAdminProperty=By.linkText("Welcome Admin");
	// By welComeAdminProperty=By.partialLinkText("Welcome");
	By welComeAdminProperty=By.partialLinkText( proprety.getProperty("orangeHRMHomePageWelcomeAdminProperty"));

	welComeAdmin=driver.findElement(welComeAdminProperty);

	String expected_OrangeHRMApplicationHomePageText="Welcome";
	System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");

	//Row newRow=logInTestDataSheet.createRow(1);
	//Cell testRowOfCell=logInTestDataRow.createCell(2);
	//testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");


	//Row newRow=logInTestDataSheet.createRow(1);
	//Cell testRowOfCell=logInTestDataRow.createCell(2);
	//testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	}

	//FileOutputStream testResultFile = new FileOutputStream("./src/com/OrangeHRMApplicationTestResultRiles/OrangeHRMApplicationLogInTestResult.xlsx");
	//workBook.write(testResultFile);

	}


	@Test(priority=4,description="Validating OrangeHRM Application Home Page PIM Functionality ")
	public void pimTest()
	{

	// id="menu_pim_viewPimModule"

	By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimProperty);

	Actions pimAction = new Actions(driver);
	pimAction.moveToElement(pim).build().perform();

	}

	@Test(priority=5,description="Validating OrangeHRM Application Home Page PIM - AddEmployee Functionality ")
	public void pimAddEmployeeTest()
	{
	// id="menu_pim_addEmployee"
	By addEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement pimAddEmployee=driver.findElement(addEmployeeProperty);
	pimAddEmployee.click();


	}



	@Test(priority=6,description="Validating OrangeHRM Application AddEmployee WebPage Test ")
	public void AddEmployeeWebPageTest()
	{
	System.out.println("*********** Add Employee WebPage Test Successfull ***********");
	}



	@Test(priority=7,description="Validating OrangeHRM Application AddEmployee Functionality  Test ")
	public void AddEmployeeTest() throws InterruptedException, IOException
	{

	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys("SriniFirstName111");


	// working with the Keys of the KeyBoard

	Actions keyBoardActions = new Actions(driver);
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// MiddleName
	
	keyBoardActions.sendKeys("ReddyMiddlename").build().perform();
	 keyBoardActions.sendKeys(Keys.TAB).build().perform();
	// LastName
	
	keyBoardActions.sendKeys("ChellloMiddleName111").build().perform();

 keyBoardActions.sendKeys(Keys.TAB).build().perform();
	// EmployeeID

 keyBoardActions.sendKeys(Keys.TAB).build().perform();
	// Photograph
 keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// Enter Key of KeyBoard
 keyBoardActions.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(10000);

	java.lang.Runtime.getRuntime().exec("./AutoItFloder/RithuReddy.exe");

	Thread.sleep(5000);

	// <input type="button" class="" id="btnSave" value="Save">

	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);

	saveButton.click();


	}


	// Validing Personal Details Webpage

	@Test(priority=8,description="Validating OrangeHRM Application Personal Details WebPage  Test ")
	public void personalDetailsWebPageTest()
	{
	System.out.println(" **** Successfully Navigaed to Persoanl Details WebPage **********");
	
	
	/*
	 By employeeIdProperty=By.id("employeeId");
	 WebElement employeeId=driver.findElement(employeeIdProperty);
	 String Id=employeeId.getAttribute("value");
	      
	 System.out.println("the EmployId number is :-  "+Id);

	   
	//<input value="Madhu" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30"
	//title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
	 
	By afterSaveFirstNameProperty= By.id("personal_txtEmpFirstName");
	WebElement afterSaveFirstName = driver.findElement(afterSaveFirstNameProperty);
	String Actual_FirstName=afterSaveFirstName.getAttribute("value");
	   
	//--------------->>>>>>>>>>>>>>>>>>>>      After saving MiddleName
	 
	//<input value="Sai" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30"
	//title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	     
	By afterSaveMiddleNameProperty= By.id("personal_txtEmpMiddleName");
	WebElement  afterSaveMiddleName= driver.findElement(afterSaveMiddleNameProperty);
	String Actual_MiddleName=afterSaveMiddleName.getAttribute("value");  
	   
	//--------------->>>>>>>>>>>>>>>>>>>>      After saving LastName
	 
	//<input value="Chandu" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30"
	//title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	   
	By afterSaveLastNameProperty=By.id("personal_txtEmpLastName");
	WebElement afterSaveLastName=driver.findElement(afterSaveLastNameProperty);
	String Actual_LastName=afterSaveLastName.getAttribute("value");
	 
	//--------------->>>>>>>>>>>>>>>>>>>>      After saving EmployeeId
	 
	//<input value="0021" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable"
	//id="personal_txtEmployeeId" disabled="disabled">
	 
	   By afterSaveEmployeeIdPrperty=By.id("personal_txtEmployeeId");
	   WebElement afterSaveEmployeeId=driver.findElement(afterSaveEmployeeIdPrperty);
	String Actual_EmployeeId= afterSaveEmployeeId.getAttribute("value");
	 
	//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  FristName  
	 
	if(Actual_FirstName.equals("Madhu"))
	{
	      System.out.println("After saving the FirstName are same :-  PASS");
	      //Sheet.getRow(indexrow).createCell(21).setCellValue(Actual_FirstName);
	     // Sheet.getRow(indexrow).createCell(22).setCellValue("PASS");
	}
	else
	{
	System.out.println("After saving the FirstName are NOT same :- FAIL ");
	//Sheet.getRow(indexrow).createCell(21).setCellValue("NOT Match - "+Actual_FirstName);
	  // Sheet.getRow(indexrow).createCell(22).setCellValue("FAIL");
	}
	 
	 
	//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  MiddleName  

	if(Actual_MiddleName.equals("Sai"))
	{
	System.out.println("After saving the MiddleName are same :-  PASS");
	//Sheet.getRow(indexrow).createCell(23).setCellValue(Actual_MiddleName);
	  // Sheet.getRow(indexrow).createCell(24).setCellValue("PASS");
	}
	else
	{
	System.out.println("After saving the MiddleName are NOT same :- FAIL ");
	//Sheet.getRow(indexrow).createCell(23).setCellValue("NOT Match - "+Actual_MiddleName);
	//   Sheet.getRow(indexrow).createCell(24).setCellValue("FAIL");
	}
	 
	//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  LastName  
	 
	if(Actual_LastName.equals("Chandu"))
	{
	System.out.println("After saving the LastName are same :-  PASS");
	//Sheet.getRow(indexrow).createCell(25).setCellValue(Actual_LastName);
	  // Sheet.getRow(indexrow).createCell(26).setCellValue("PASS");
	}
	else
	{
	System.out.println("After saving the LastName are NOT same :- FAIL ");
	//Sheet.getRow(indexrow).createCell(25).setCellValue("NOT Match - "+Actual_LastName);
	  // Sheet.getRow(indexrow).createCell(26).setCellValue("FAIL");
	}
	 
	//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  EmployeeId
    
  By employeeIdProperty=By.id("employeeId");
WebElement employeeId=driver.findElement(employeeIdProperty);
String Id=employeeId.getAttribute("value");
     
System.out.println("the EmployId number is :-  "+Id);
	 
	if(Actual_EmployeeId.equals(Id))
	{
	System.out.println("After saving the EmployeeId are same :-  PASS");
	//Sheet.getRow(indexrow).createCell(27).setCellValue(Actual_EmployeeId);
	 //  Sheet.getRow(indexrow).createCell(28).setCellValue("PASS");
	   
	   
	}
	else
	{
	System.out.println("After saving the EmployeeId are NOT same :- FAIL ");
	//Sheet.getRow(indexrow).createCell(27).setCellValue("NOT Match - "+Actual_EmployeeId);
	  // Sheet.getRow(indexrow).createCell(28).setCellValue("FAIL");

	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


	@Test(priority=9,description="Validating OrangeHRM Application Personal Details Functionality Test ")
	public void personalDetailsTest()
	{

	// validating FirstName, MiddleName, LastName , EmployeeID  and Photograph
	// id="empPic"

	By personalDetailsPageImageProperty=By.id("empPic");
	WebElement personalDetailsEmployeeImage=driver.findElement(personalDetailsPageImageProperty);

	boolean flag=personalDetailsEmployeeImage.isDisplayed();

	if(flag)
	{
	System.out.println(" Employee Photograph existing - PASS ");
	}
	else
	{
	System.out.println(" Employee Photograph NOT existing - FAIL" );
	}

	}



	
}
