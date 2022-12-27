package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshots2Randomnames {

	public static void main(String[] args) throws IOException {
		
		  System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			
			//Take screenshot and copy into object
			
		    File Source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
		      String Random = RandomString.make(5);
		      
		      String Filename = "Facebook";
		      
		      File Dest = new File("/Users/ranjeetkendre/Desktop/23July/"+Filename+""+Random+".jpg");
	
		      FileHandler.copy(Source, Dest);
		      
		      driver.quit();
		      
	}

}
