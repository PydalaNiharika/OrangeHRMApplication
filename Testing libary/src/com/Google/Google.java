package com.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class Google {
	
	WebDriver driver;

	String applicationurl="https://google.com/";
@BeforeTest
public void setup()
{
	System.setProperty("webdriver.chrome.driver","./Webdriver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get( applicationurl);
	
	driver.manage().window().maximize();
	
	
	
	
}

}
