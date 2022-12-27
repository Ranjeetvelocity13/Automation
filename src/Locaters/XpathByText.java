package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			//Step 2
			WebDriver driver = new ChromeDriver();
			
			// Step 3
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("Rahul@gmail.com");
			Thread.sleep(2000);

		
			driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("qWERTY");
			Thread.sleep(2000);
			
		   //driver.findElement(By.xpath("//button[text()='Log in']")).click();
			
			driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

			//label[text()=' Male ']
	}

}
