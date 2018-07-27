package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_Ajax 
{

	@Test
	public void test_ajax()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	    driver.manage().window().maximize();
	    
	    
	    WebElement from=driver.findElement(By.xpath("//[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/))
	    WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
	    
	    Actions act1=new Actions(driver);
       act1.dragAndDrop(from, to).perform();
       
       WebDriverWait wait=new WebDriverwait(driver,10);
       wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"),"Drop a package here to check price"));
       
       
       String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
       
       System.out.println(price);
  
	}
}
