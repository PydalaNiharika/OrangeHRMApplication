package com.OrangeHrmApplication.Testinglibary;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class LoginpageTestText extends BaseTest{
	
	@Test(priority=1,description=" Validating OrangeHRM Application LogIN Page Text")
	public void orangeHRMApplicationLogInPage_logInPannelTextTest()
	{

		LogInPage logInPage = new LogInPage();
	logInPage.OrangeHrmLoginpagePannel();

	}


	
	

	@Test(priority=2,description=" Validating OrangeHRM Applicaiton LogIn Functionality ")
	public void orangeHRMApplicationLogInPage_LogInTest() throws IOException {

	LogInPage logInPage = new LogInPage();
	 logInPage.LogInTest( );
	}
	@Test(priority=3,description="validating OrangeHrm Application Welcomepage")
	public void orangeHRMApplicationLogInPage_WelcomePage() throws IOException {
		LogInPage logInPage = new LogInPage();
		
		logInPage.homePageTest();
		
	}
	@Test(priority=4,description="validating OrangeHrm Application Logout")
	public void Logoutpage() throws InterruptedException{
		
LogInPage logInPage = new LogInPage();
		
logInPage.logOutTest();
	}
}
