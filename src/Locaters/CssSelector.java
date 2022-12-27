package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
	
		//1. ID and tagname

		 System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			//Step 2
			WebDriver driver = new ChromeDriver();
			
			// Step 3
			driver.get("https://app.hubspot.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
//			1
//			driver.findElement(By.cssSelector("#username")).sendKeys("Test2334");
//			
//			driver.findElement(By.cssSelector("#password")).sendKeys("12334");
//			
			
	//2
//            driver.findElement(By.cssSelector("input#username")).sendKeys("Test2334");
//			
//			driver.findElement(By.cssSelector("input#password")).sendKeys("12334");
//			Thread.sleep(3000);

			
			//3 tag and class name
			
			driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Test@gmail.com");
			

			driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("234eeee5");
	
			driver.findElement(By.cssSelector("path.UICheckbox__PrivateCheckboxIconInnerSVG-l8c7hr-3.gWPfKk.private-checkbox__icon__inner")).click();
			
			driver.findElement(By.cssSelector("#loginBtn")).click();
			
			
			
	}

}
