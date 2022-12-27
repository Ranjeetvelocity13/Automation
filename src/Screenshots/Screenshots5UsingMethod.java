package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshots5UsingMethod {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		  System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			String File = "Facebook";
			
			TakeScreenshot(File);
			
			TakeScreenshot(File);
			
			TakeScreenshot(File);
			
	}
	
	public static void TakeScreenshot(String Filename) throws IOException {
		
		   File Source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
		    String Random=  RandomString.make(5);
		 
		    File Dest = new File("/Users/ranjeetkendre/Desktop/eclipse-workspace/TesNgTutorial/23July_Automation/Screenshot/"+Filename+""+Random+".png");
				
		    FileHandler.copy(Source, Dest);
	}

}
