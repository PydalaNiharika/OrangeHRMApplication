package com.OrangeHrmApplication.Testinglibary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.BaseTest.BaseTest;
import com.utility.Log;

public class LogInPage extends BaseTest {
	
public  LogInPage() {
	
	PageFactory.initElements(driver,this);
	
	
	
	
	
}
String expected_OrangeHRMApplicationLogInPageText;

String actual_OrangeHRMApplicationLogInPageText;
@FindBy(id="logInPanelHeading")
WebElement orangeHRMApplicationLogInPage ;
public void OrangeHrmLoginpagePannel() {
	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	Log.info(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	

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
XSSFSheet sheet;
FileInputStream propertiesFile;
Properties properties;

@FindBy(id="txtUsername")
WebElement userName;


// name="txtPassword"
@FindBy(name="txtPassword")
WebElement password;

// class="button"
@FindBy(className="button")
WebElement logInButton;
public void LogInTest() throws IOException
{

logInTestDataFile= new FileInputStream("./src/test/java/testDataFiles/logindata.xlsx");
workBook= new XSSFWorkbook(logInTestDataFile);
sheet= workBook.getSheet("TestData");

String username=sheet.getRow(1).getCell(0).getStringCellValue();

 

// Identifying the Properties file - since the properties of the WebElement are stored in it
userName.sendKeys(username);




 // Performing an operation on the identified WebElement

String Password=sheet.getRow(1).getCell(1).getStringCellValue();
password.sendKeys(Password);
logInButton.click();


// String passwordTestData="Q@Trainer7";



// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">



}
FileOutputStream testResultFile;

@FindBy(linkText="WelcomeAdmin")
WebElement welCome;

public void homePageTest() throws IOException
{

// Validating Title


// Validating OrangeHRM Appliation Home Page - expected Text - Welcome (should have)

// Properties of WelCome Admin Element
// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

// By welComeAdminProperty=By.id("welcome");
//By welComeAdminProperty=By.linkText("Welcome Admin");
// By welComeAdminProperty=By.partialLinkText("Welcome");


String expected_OrangeHRMApplicationHomePageText="Welcome";
System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

String actual_OrangeHRMApplicationHomePageText=welCome.getText();
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

testResultFile = new FileOutputStream(".//src/test/java/testDataResult/logindata.xlsx");
workBook.write(testResultFile);

}
@FindBy(linkText="Logout")
WebElement Logout;

public void logOutTest() throws InterruptedException
{
welCome.click();


// Synchronization - The Wait time given / placed with in the Test Script to hault the
//                    Test Script Execution for a duration

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
;
Logout.click();

}	
		
		
	}
	

