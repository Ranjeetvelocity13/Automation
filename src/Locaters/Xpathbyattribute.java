package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {

	public static void main(String[] args) throws InterruptedException {

		
		  System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			//Step 2
			WebDriver driver = new ChromeDriver();
			
			// Step 3
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("Rahul@gmail.com");
			Thread.sleep(3000);

		
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("qWERTY");
			Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	
            driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
            
            
	}

}
