package com.OrangeHrmAPPlicationTestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	

	
			(features="OrangeHRmApplicationUnderTest",//give the folder name in which the feature file is created
			 glue="com.OrangeHrmAPPlicationTestCase", // package name of the Java class in which methods are written
			  monochrome=true,   // is used to remove the Junk data from the Console - related to test Result
			//  dryRun=true // it compares the Feature file statements with the Methods Class - if at all
			             //   for any feature file statement related method is not found then Junit is
			            //     immedately creating User defined Methods - which should me implimented with
			            //       the missing Steps
			     //tags="@ReTesting"  // used to run a particular Tag related Scenario
			  // tags="@Smoke"
			 // tags="@Smoke,@ReTesting" // used to run multiple Scenarios
			 // tags="@RegressionTesting"
					  plugin = { "pretty",
							  "html:target/OrangeHRMApplicationReports",
							  "json:target/OrangeHRMApplicationJsonReport.json",
							  "com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
							  }		
			
			
			)
public class TestRunner{
	
}
