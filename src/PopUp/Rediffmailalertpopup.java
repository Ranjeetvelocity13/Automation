package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailalertpopup {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	       Thread.sleep(3000);	
	            
	       driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Rahul");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	       Thread.sleep(3000);
	      Alert alert= driver.switchTo().alert();
	     
	      Thread.sleep(3000);
	      String Text =alert.getText();
	      
	      if(Text.equals("Please  your password")) {
	    	  System.out.println("Correct alert message");
	      }
	      else {
	    	  System.out.println("Incorrect alert message");
	      }
	      alert.accept();
	      Thread.sleep(3000);
	      driver.quit();
	
	}

}
