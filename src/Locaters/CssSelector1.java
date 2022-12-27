package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			//Step 2
			WebDriver driver = new ChromeDriver();
			
			// Step 3
			driver.get("https://app.hubspot.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("WERTY@gmail.com");
			
	        driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("RRRRRRR");
	}

}
