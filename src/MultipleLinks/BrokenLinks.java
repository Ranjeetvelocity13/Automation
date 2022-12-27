package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
       System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		int brokenlinks = 0;
		
		for(WebElement element :Links) {
		
			String url = element.getAttribute("href");
			
			{
				if(url==null || url.isEmpty()) {//true
					System.out.println("URl is empty or null");
				}
				
				URL Link = new URL(url);
				
				HttpsURLConnection httpcode = (HttpsURLConnection) Link.openConnection();
			    httpcode.connect();
			   // 200>=400  -- false
			    //404>=400 - true
			    if(httpcode.getResponseCode()>=400) {
			    	
			    	System.out.println(httpcode.getResponseCode()+"--->"+url+"Is---> brokn links");
			        brokenlinks++;  //1
			    }
			    else               
			    	System.out.println(httpcode.getResponseCode()+"--->"+url+"Is--->Valid inks");			    
			}		
		}
		
		System.out.println("Number of broken links:"+brokenlinks);

		driver.quit();
	}

}
