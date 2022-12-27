package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/upload");

           Thread.sleep(3000);	
           
           driver.findElement(By.id("file-upload")).sendKeys("/Users/ranjeetkendre/Downloads/Username.xlsx");
           Thread.sleep(4000);
           
           driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
	}

}
