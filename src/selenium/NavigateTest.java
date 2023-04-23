package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
       //driver.get("https://www.google.com/");
 // both are same but navigate has other methods and driver.get is the final method
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
}
}