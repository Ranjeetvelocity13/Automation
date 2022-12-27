package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	   
	    WebDriver driver = new ChromeDriver();
	    		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
	    //driver.get("https://www.flipkart.com/");
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Double=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
       Actions act =new Actions(driver);
       Thread.sleep(2000);
       
       act.doubleClick(Double).build().perform();
           
       Thread.sleep(2000);

       driver.switchTo().alert().accept();
       
       driver.quit();
	}

}
