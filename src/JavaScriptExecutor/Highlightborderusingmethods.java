package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightborderusingmethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Element =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        WebElement Input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		 WebElement pass=  driver.findElement(By.xpath("//input[@type=\"password\"]"));
        
        Thread.sleep(2000);
        drawborder(Element, driver);
        drawborder(Input, driver);
        drawborder(pass, driver);
		

	}
	public static void drawborder(WebElement elemet,WebDriver driver) {
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].style.border='10px solid red'", elemet);
		Js.executeScript("arguments[0].style.background='yellow'", elemet);
	
	}

}
