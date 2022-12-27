package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightborder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Element =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        WebElement Input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(2000);
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments[0].style.border='5px solid red'",Element );
		Js.executeScript("arguments[0].style.border='5px solid red'",Input );
		
		Thread.sleep(3000);
		driver.quit();

	}

}
