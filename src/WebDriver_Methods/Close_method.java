package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_method {

	public static void main(String[] args) throws InterruptedException {
	
		//Step 1
		
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		//Step 2
		WebDriver driver = new ChromeDriver();
		
		// Step 3
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(15000);
		//Step 4		
		
		driver.close();
	}

}
