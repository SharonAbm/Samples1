package parallelScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GooglePageTest2 {
	WebDriver driver;
	//@BeforeMethod
	@Parameters("browser")
	@BeforeTest
	public void setup(String strBrowser) {
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	@Test(priority=1)
	public void javaSearchTest() {
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
		
	}
	@Test(priority=2)
	public void seleniumSearchTest() {
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
		
	}
	@Test(priority=3)
	public void appiumSearchTest() {
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Appium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Appium Tutorial - Google Search");
		
	}
	//@AfterMethod
	@AfterTest
	public void teardown() {
		driver.close();
	
	}
	



}
