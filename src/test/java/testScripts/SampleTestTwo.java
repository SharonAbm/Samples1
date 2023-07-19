package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTestTwo {
	@Test
	public void cypressTutorial() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	SoftAssert softassert = new SoftAssert();
	softassert.assertEquals(driver.getTitle(), "Google Page");
	WebElement schBox= driver.findElement(By.name("q"));
	schBox.sendKeys("Cypress Tutorial");
	schBox.submit();
	softassert.assertEquals(driver.getTitle(), "Cypress Tutorial- Google Search");
	driver.close();
	
}
}


