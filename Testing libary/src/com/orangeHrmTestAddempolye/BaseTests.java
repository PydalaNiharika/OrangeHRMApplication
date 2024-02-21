package com.orangeHrmTestAddempolye;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {

	WebDriver driver;

	String applicationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeTest
public void setup()
{
	System.setProperty("webdriver.edge.driver","./Webdriver/msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get( applicationurl);
	
	driver.manage().window().maximize();
	
	
	
	
}
/*@AfterTest
public void close()
{
	driver.quit();
}	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
