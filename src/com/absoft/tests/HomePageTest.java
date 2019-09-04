package com.absoft.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:/Personal/Automation/Selenium Automation Class/Chrome Driver 2.36 exe file/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// 1) Go to myAccount Page
		driver.get("http://test1.absofttrainings.com/");
	}
	
	@AfterMethod (alwaysRun = true)
	public void testCleanup() {
		
	driver.quit();	
	
	}
	
	@Test
	public void PageTitle() {
		
		String actualResult = driver.getTitle();
				
		String expectedResult = "My Account | ABSoft Trainings � E-Commerce test web site";
		
		Assert.assertEquals(actualResult, expectedResult, "Error: Page Title is incorrect");
		
	}

}
