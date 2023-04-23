package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click(); //by.name("B2").click
        Thread.sleep(2000);        
        //cant inspect the pop up msg, that means its javascript error
        //if u want to click on selected btn then al.accept(); and not selected btn al.dismiss();
        
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        
        al.accept();
        //al.dismiss();
	}

}
