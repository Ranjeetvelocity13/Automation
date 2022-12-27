package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		//Step 2
		WebDriver driver = new ChromeDriver();
		
		// Step 3
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("phone-no")).sendKeys("Tom@123");
		driver.findElement(By.className("pure-button")).click();
	}

}
