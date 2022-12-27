package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldowntillbottom {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	   
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		//scrollDown/up till bottom
		
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		Thread.sleep(5000);
		
		Js.executeScript("document.documentElement.scrollTop=0", "");
		
		Thread.sleep(5000);

		driver.quit();

	}

}
