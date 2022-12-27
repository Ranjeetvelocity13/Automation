package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://text-compare.com/");
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);

		WebElement input1=driver.findElement(By.id("email"));
		WebElement input2=driver.findElement(By.id("pass"));
 
		Thread.sleep(3000);
		
		input1.sendKeys("This is my first java program");
		
		Actions act  = new Actions(driver);
		Thread.sleep(2000);
		
		//CTRL + A
		//act.keyDown(Keys.CONTROL);
		act.keyDown(Keys.COMMAND);
		act.sendKeys("a");
		//act.keyUp(Keys.CONTROL);
		act.keyUp(Keys.COMMAND);
        act.build().perform();
        
        //CTRL +c
        act.keyDown(Keys.COMMAND);
		act.sendKeys("c");
		//act.keyUp(Keys.CONTROL);
		act.keyUp(Keys.COMMAND);
        act.build().perform();
        
        //Tab
        act.sendKeys(Keys.TAB);
        act.build().perform();
        
		//CTRL +V
        act.keyDown(Keys.COMMAND);
		act.sendKeys("v");
		//act.keyUp(Keys.CONTROL);
		act.keyUp(Keys.COMMAND);
        act.build().perform();
        
        //compare text
        if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
        	System.out.println("Correct copied");
        }
        else {
        	System.out.println("Incorrect copied");
        }
        
	}

}
