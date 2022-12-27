package Windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle2 {

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

         //Secondway
         ArrayList<String> WinList =new ArrayList(WindowID);
         
         String Parent =WinList.get(0);
         String Child = WinList.get(1);
         
         System.out.println("Parent :"+Parent);
         System.out.println("Child :"+Child);
         driver.quit();
         
	}

}
