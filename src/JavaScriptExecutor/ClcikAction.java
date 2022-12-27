package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClcikAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("WERT");
		driver.findElement(By.id("pass")).sendKeys("@#$%^");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		Js.executeScript("arguments[0].click()", login);
	}

}
