package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {

		
		   System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");

			// Step 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
		    String Page1 = driver.getTitle();
		    System.out.println(Page1);
		    
		    driver.navigate().to("https://www.amazon.in/");
		    
		    Thread.sleep(4000);
		    String Page2 = driver.getTitle();
		    System.out.println(Page2);
		    
		    driver.navigate().back();
		    Thread.sleep(4000);
		    
		    driver.navigate().refresh();
		    Thread.sleep(4000);
		    
		    driver.navigate().forward();
		    Thread.sleep(7000);
		    
		    driver.quit();
	}

}
