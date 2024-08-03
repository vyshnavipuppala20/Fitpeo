package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {

	public static WebDriver driver;
	@BeforeClass
	public static void before_test() 
	{
	
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void afetr_test() {
		driver.close();
	}
	
}
