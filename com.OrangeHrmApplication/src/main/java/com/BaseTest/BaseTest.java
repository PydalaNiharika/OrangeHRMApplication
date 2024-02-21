package com.BaseTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.utility.Log;




public class BaseTest {


public static WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeMethod
public void applicationLaunch()
{

System.setProperty("webdriver.edge.driver", "./Webdriver/msedgedriver.exe");
driver = new EdgeDriver();

// System.out. Browser Launched Successfully ********** ");

driver.get(applicationUrlAddress);

//System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page ");
Log.info(" Successfully Navigated to OrangeHRM Application LogIn Page ");

driver.manage().window().maximize();

}


@AfterMethod
public void applicationClose()
{
driver.quit();

// System.out.println(" ************ Chrome Browser along with OrangeHRM Application Closed Successfully ********");

Log.info(" ************ Chrome Browser along with OrangeHRM Application Closed Successfully ********");
}

}
