package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
	//	driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement Account=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		//WebElement Login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		
		act.moveToElement(Account).build().perform();
		
	}

}
