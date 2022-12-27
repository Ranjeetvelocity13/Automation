package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Boolean Text=driver.findElement(By.xpath("//span[contains(text(),'Tables')]")).isDisplayed();
	
		System.out.println(Text);
		
		driver.findElement(By.xpath("//a[@class=\"w3-right w3-btn\"]")).click();
		
		driver.quit();
	}

}
