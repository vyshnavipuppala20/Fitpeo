package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.Keys;



public class revenueCalculator {

	WebDriver driver;
	public revenueCalculator(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setslider() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(2000);
        WebElement slider = driver.findElement(By.xpath("//input[@type='range'][@data-index='0']"));
        for (int i = 0; i < 620; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        WebElement textField = driver.findElement(By.xpath("(//input[@id=':r0:'])"));
        assert textField.getAttribute("value").equals("820");
        
	}
	
	public void setinputvalue() {
		WebElement textField = driver.findElement(By.xpath("(//input[@id=':r0:'])"));
		Actions actions = new Actions(driver);
		actions.click(textField)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.DELETE)
		.perform();
		actions.sendKeys("560").perform();
		assert textField.getAttribute("value").equals("560");
	}
	
}
