package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class revenueCalculator {

	WebDriver driver;
	public revenueCalculator(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='number' and contains(@class, 'css-1kkflqu')]")
	WebElement textField;
	
	public void operations() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(2000);
        WebElement slider = driver.findElement(By.xpath("//input[@type='range'][@data-index='0']"));
        int sliderWidth = slider.getSize().getWidth();
        String maxValue = slider.getAttribute("max");
        int max = Integer.parseInt(maxValue);
        int desiredValue = 9400;
        int offset = (int) ((desiredValue / (double) max) * sliderWidth);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(offset,0) 
               .release() 
               .build()
               .perform();
        
        Thread.sleep(2000);
        
        

	}
	
	
	
}
