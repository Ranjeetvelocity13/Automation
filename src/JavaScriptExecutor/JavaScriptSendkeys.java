package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Username =driver.findElement(By.id("email"));
		WebElement Passowrd =driver.findElement(By.id("pass"));
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
	    WebElement Login= driver.findElement(By.xpath("//button[@name=\"login\"]"));
		 
		 //FirstWay
		 
	//ecuteScript("arguments[0].click()", Login);
		 

		 //Second way
		 
		 Js.executeScript("document.getElementById('email').value='Test123';");
		 Thread.sleep(4000);
		 Js.executeScript("document.getElementById('pass').value='!@#$';");
		 Thread.sleep(4000);

		 Js.executeScript("arguments[0].click()", Login);

	}

}
