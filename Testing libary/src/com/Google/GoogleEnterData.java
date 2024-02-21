package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleEnterData extends Google {
@Test
public void googledata() {
	
	
	System.out.println("Ajay");
	
	
	
	Actions keybordAction=new Actions(driver);
	
	keybordAction.sendKeys("instagram").build().perform();
	keybordAction.sendKeys(Keys.ENTER).build().perform();
	
	//<h3 class="LC20lb MBeuO DKV0Md">Instagram</h3>
	
	
	//class="srp"
	WebElement instagramlinkhead=driver.findElement(By.className("yuRUbf"));
	//class="LC20lb MBeuO DKV0Md"
	//WebElement instagramlink=instagramlinkhead.findElement(By.className("LC20lb MBeuO DKV0Md"));
	
	instagramlinkhead.click();
	String instragramname=instagramlinkhead.getText();
	
	System.out.println("The Text of current web page is intagram"+instragramname);
	
}
}
