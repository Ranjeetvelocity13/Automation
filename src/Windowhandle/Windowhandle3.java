package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle3 {

	public static void main(String[] args) throws InterruptedException {


		   System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       Thread.sleep(3000);	
       
       driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
       
       Thread.sleep(3000);	
       
      Set<String>WindowID = driver.getWindowHandles();
    //Method is used to store all the opened windows id in the set data  
      //First method - iterator
      Iterator<String> it = WindowID.iterator();
      
      String parentwindow = it.next();
      String ChildWindow =  it.next();
      System.out.println("Parentwindow :"+parentwindow);
      System.out.println("ChildWindow :"+ChildWindow);
      
      Thread.sleep(3000);
      
      driver.switchTo().window(parentwindow);     
      Thread.sleep(3000);
      driver.switchTo().window(ChildWindow);
      System.out.println("Child Window Title :"+driver.getTitle());
      
      driver.switchTo().window(parentwindow);
      Thread.sleep(3000);
      System.out.println("Parent window title :"+driver.getTitle());
      Thread.sleep(3000);

      driver.switchTo().window(ChildWindow);
      Thread.sleep(3000);
      driver.findElement(By.id("myText")).sendKeys("Rdkendre@gmail.com");
      driver.findElement(By.xpath("//button[@id=\"linkadd\"]")).click();
      
      Thread.sleep(3000);

      driver.quit();
	}

}
