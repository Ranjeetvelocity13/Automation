package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbyelemets {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		
		WebElement W3=driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments[0].scrollIntoView();", W3);

		Thread.sleep(5000);
		driver.quit();
	}

}
