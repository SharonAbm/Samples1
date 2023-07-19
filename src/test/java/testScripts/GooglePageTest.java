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




public class GooglePageTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	
	@BeforeTest
	public void setupExtent() {
		extentReports = new ExtentReports();
		spark =new ExtentSparkReporter("test-output/SparkReport.html");
		extentReports.attachReporter(spark);
	}
	@Parameters("browser")
	@BeforeMethod
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
	public void seleniumSearchTest() {
		extentTest=extentReports.createTest("Selenium Search Test");
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
		
	}
	@Test
	public void appiumSearchTest() {
		extentTest=extentReports.createTest("Appium Search Test");
		driver.get("https://www.google.com/");
		WebElement schBox= driver.findElement(By.name("q"));
		schBox.sendKeys("Appium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(),"Appium Tutorial - Google Search");
		
	}
	@AfterTest
	public void finishExtent() {
		extentReports.flush();
		
	}
	@AfterMethod
	public void generateReport(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			extentTest.fail(result.getThrowable().getMessage());
			String path= Utilities.getScreenshotPath(driver);
			extentTest.addScreenCaptureFromPath(path);
			
		}
		driver.close();
	
	}
	
	



}
