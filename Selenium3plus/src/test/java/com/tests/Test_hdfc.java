
	  package com.tests;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.openqa.selenium.interactions.Actions;
	  import org.testng.Assert;
      import org.testng.annotations.Test;
	
  @Test
	  public class Test_hdfc 
	  {

	    
	    {
	  	  

	  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	  		WebDriver driver= new ChromeDriver();
	  	    driver.get("https://hdfcbank.com/");
	  	    driver.manage().window().maximize();
	  	 
	  	    
	  	    Actions act1=new Actions(driver);
	  	    
	  	    act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	  	    act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	  	    act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().perform();
	  	    
	  	   Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	  	   
	  	   
	  	   
	  	    		
	  	    
	  	    
	    }

	  
  }

