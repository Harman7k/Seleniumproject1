package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com//");
		
		//lets say when u try to type something in search box, u get pop up
		//if u get the pop up, u need to close the pop then code gonna work
		// type computer in the search box
		//first verify weather pop up is present or not and if its the java script pop up or website pop up
		
        Thread.sleep(2000);
        
       /* Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        //al.dismiss();*/
        
        List<WebElement> popup = driver.findElements(By.className("btn-close"));
        System.out.println(popup.size());
        
       if(popup.size()>0) {
    	   driver.findElement(By.className("btn-close")).click();
       }
       
        driver.findElement(By.id("search-key")).sendKeys("Computer");
        
       

	}

}
