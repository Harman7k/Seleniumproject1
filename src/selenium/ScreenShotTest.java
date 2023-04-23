package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		//at any time if u want to take the screenshot//add commons io jar to project
		// we have in built class screenshot 
		//open c drive>>open testing folder>> copy the path>> add "\\screenshot.png
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShotFile, new File("C:\\testing\\screenshot.png"));

	}

}
