package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_Method {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		// Step 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(4000);

		//driver.close();
		
		driver.quit();
	}

}
