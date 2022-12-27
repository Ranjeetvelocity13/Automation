package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshots4Element {

	public static void main(String[] args) throws IOException {

		  System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			WebElement Screen = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		    File Source =((TakesScreenshot) Screen).getScreenshotAs(OutputType.FILE);

		    String Random=RandomString.make(7);
		    
		    String Filename ="FacebookLogo";
		    
		    File Dest = new File("/Users/ranjeetkendre/Desktop/eclipse-workspace/TesNgTutorial/23July_Automation/Screenshot/"+Filename+""+Random+".png");
		    
		    FileHandler.copy(Source, Dest);
		    
		    driver.quit();
	}

}
