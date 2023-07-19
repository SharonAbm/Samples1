package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import commonUtils.Utilities;




public class LoginTest {
	WebDriver driver;
	Properties Prop;
	//@Parameters("browser")
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

	@Test
	public void valiLoginTest() {
		//extentTest=extentReports.createTest("Selenium Search Test");
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
		
	}
	
	@AfterMethod
	public void teardown {
		driver.close();
		}
		
	
	}
	
	



}