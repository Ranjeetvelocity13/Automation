package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");

		WebElement source = driver.findElement(By.id("src"));
		
		WebElement Des = driver.findElement(By.id("dest"));
		
		Redbuswait(driver, source, "Pune");
		Redbuswait(driver, Des, "Mumbai");
	}
	
	public static void Redbuswait(WebDriver driver, WebElement element, String value) {
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}

}
