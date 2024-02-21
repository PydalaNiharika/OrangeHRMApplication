package com.SetupDefination;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import com.utility.Log;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public static void setUp()
	{
		System.setProperty("webdriver.edge.driver",".\\Webdriver\\msedgedriver.exe");
	    driver=new EdgeDriver();


	Log.info(" *** Edge Browser launched Successfully *****");
	}

	@After
	public static void tearDown()
	{
	driver.quit();
	Log.info(" **** Edge Closed With Application Successfully ********");
	}
}