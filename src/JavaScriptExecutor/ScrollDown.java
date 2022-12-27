package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Js.executeScript("window.scrollBy(0, 5000)", "");
		
		Thread.sleep(4000);
		
		Js.executeScript("window.scrollBy(0,-1000)", "");

	}

}
