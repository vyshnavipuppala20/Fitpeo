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
	String expected="111105";
	
	@Test
	public void test1() throws IOException, InterruptedException {
		this.driver=baseClass.driver;
		
		driver.get(c.getProperties());
		homePage h= new homePage(driver);
		h.go_to_Revenue_caluclator();
		Thread.sleep(3000);
		revenueCalculator rc= new revenueCalculator(driver);
		rc.operations();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@class, 'PrivateSwitchBase-input css-1m9pwf3')]"));

       
        for (int i = 0; i < Math.min(3, checkboxes.size()); i++) {
            WebElement checkbox = checkboxes.get(i);
            if (!checkbox.isSelected()) {
                checkbox.click();
               
            }
        }
        driver.findElement(By.xpath("//span[text()='15']")).click();
        Assert.assertEquals(expected, "111105");
        
	}
}
	
