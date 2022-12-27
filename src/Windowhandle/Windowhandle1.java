package Windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle1 {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	           Thread.sleep(3000);	
	           
	        String WindowID = driver.getWindowHandle();
	        // Returns id of the single browser window
	        System.out.println(WindowID);
	      // CDwindow-0FE8E6836C3CA2854F874347CB858255
	      // CDwindow-0B6F4C832504988C819F879748E09D03
	}

}
