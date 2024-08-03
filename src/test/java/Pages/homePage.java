package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;
	public homePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[text()='Revenue Calculator']")
	WebElement RevenueCaluclator;
	
	
	public void go_to_Revenue_caluclator()
	{
		RevenueCaluclator.click();
		
	}
}
