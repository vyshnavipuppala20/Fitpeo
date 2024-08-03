package Testcases;

import java.io.IOException;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import Pages.homePage;
import Pages.revenueCalculator;

import org.testng.Assert;
import utilities.baseClass;
import utilities.configuration;

public class testcase1 extends baseClass {

	WebDriver driver;
	configuration c= new configuration();
	
	
	@Test
	public void test1() throws IOException, InterruptedException {
		this.driver=baseClass.driver;
		
		driver.get(c.getProperties());
		homePage h= new homePage(driver);
		h.go_to_Revenue_caluclator();
		Thread.sleep(3000);
		revenueCalculator rc= new revenueCalculator(driver);
		rc.setslider();
		rc.setinputvalue();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		WebElement totalReimbursementHeader= driver.findElement(By.xpath("(//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-1lnu3ao'])/p[4]/p"));

		
		assert totalReimbursementHeader.getText().equals("$75600");
      
		
   
    
	}
}
	
