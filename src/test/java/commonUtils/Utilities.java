package commonUtils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	public static String getScreenshotPath(WebDriver driver) {
		TakesScreenshot screen= (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String srcFile= System.getProperty("user.dir")+"/screenshots/"+ System.currentTimeMillis()+".png";
		File dest= new File(srcFile);
		try {
			
		}
	}

}
