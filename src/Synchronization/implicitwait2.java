package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email12")).sendKeys("QWERT");
		
		driver.findElement(By.id("pass")).sendKeys("!@#$%");
		
		driver.quit();
		
	}

}
