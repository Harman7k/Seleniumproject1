package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com");
	}
	

}
