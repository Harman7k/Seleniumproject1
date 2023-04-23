package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mississauga.ca/");
		// now how to perform hover, there is a inbuilt class action, need to create object, need to pass driver
		
		WebElement organization = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		organization.click();
		//driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
        //Actions builder = new Actions(driver);
        //builder.moveToElement(organization).build().perform();
        
         Thread.sleep(2000);
        List<WebElement> all = driver.findElements(By.xpath("//ul[@x-placement='bottom-start']/li"));
        System.out.println(all.size());                      ////ul[@class='main-nav-links']/li[3]//a - sir used
        
       /*for(int i=0; i<all.size(); i++) {
        	System.out.println(all.get(i).getText());
       }*/
       
       /*Alert al = driver.switchTo().alert();
       System.out.println(al.getText());
       
       //al.accept();
       al.dismiss();*/
       
        	 for(WebElement a : all) {
        	System.out.println(a.getText());
        
//now clk on jobs and volunteer, verify the title and break the for loop
      if(a.getText().equals("Jobs and volunteer")) {
    	  a.click();
    	  Thread.sleep(3000);
    	  System.out.println(driver.getTitle());
       	break;
       	
       }
        	 
	}
	}
}