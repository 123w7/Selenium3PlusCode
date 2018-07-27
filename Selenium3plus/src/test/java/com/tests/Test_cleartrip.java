package com.tests;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_cleartrip
{
  @Test
  public void test_cleartrip() 
  {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.cleartrip.com/");
	    driver.manage().window().maximize();
	    
	    WebElement from=driver.findElement(By.id("FromTag"));
	    
	    Actions act1=new Actions(driver);
	    
	    act1.keyDown(from,Keys.SHIFT).perform();
  	    act1.sendKeys("hyd").perform();
	    act1.keyUp(from,Keys.SHIFT);
	    act1.sendKeys(Keys.ENTER).perform();
	    
	    WebElement to=driver.findElement(By.id("ToTag"));
	    to.sendKeys("bang");
	    
	    WebElement ul=driver.findElement(By.id("ui-id-2"));
	    List<WebElement> list=ul.findElements(By.tagName("li"));
	    
	    for(WebElement e:list)
	    {
	    	String city=e.getText();
	    	if(city.contains("BKK"))
	    	{
	    		e.click();
	    		break;
	    	}
	    }
	    
	    
  }
}
