package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		
		
		//Step 1.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		// Step 
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://kite.zerodha.com/");
		
		//get - this method is used to open application or to enter url in a webbrowser

	}

}
