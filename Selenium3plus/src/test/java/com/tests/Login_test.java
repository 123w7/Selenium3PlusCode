package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_test
{
 
	@Test
	public void testMercuryTourslogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
	    
	    String title=driver.getTitle();
	    //Assert.assertEquals(title, "Welcome: Mercury Tours");
	    
	    Assert.assertTrue(title.startsWith("Welcome:"));
	    
	    driver.findElement(By.cssSelector("input[value=oneway]")).click();
	    driver.findElement(By.name("passCount")).sendKeys("4");
	}


	
	}

