package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {

	public static void main(String[] args) throws IOException {
			
	        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			
			//Take screenshot and copy into object
			
		   File Source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
           System.out.println(Source);
           
           File Destination = new File("/Users/ranjeetkendre/Desktop/23July/Sample.jpg");
           
           FileHandler.copy(Source, Destination);
           
	}

}
