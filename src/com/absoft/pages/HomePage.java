package com.absoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//super(driver);
	}
	
	
	
	public My_Account_Page clickMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
		
		//return new My_Account_Page(driver);
		return new My_Account_Page(driver);
	}

}
