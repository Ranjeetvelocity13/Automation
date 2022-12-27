package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.album.alexflueras.ro/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Js.executeScript("window.scrollBy(6000, 0)", "");
		
		Thread.sleep(4000);
		
		Js.executeScript("window.scrollBy(-4000,0)", "");

		Thread.sleep(4000);

		driver.quit();
	}

}
