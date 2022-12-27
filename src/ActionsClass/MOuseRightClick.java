package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
	//	driver.get("https://www.flipkart.com/");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(3000);
		
		Actions act  = new Actions(driver);
		Thread.sleep(2000);
		
	   WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

	   act.contextClick(button).build().perform();
	 
	    driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		act.contextClick(button).build().perform();

	 
	
		driver.findElement(By.xpath("(//span[contains(text(),'Paste')])[2]")).click();
	}
	

}
