package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String BaseURL = "https://demo.automationtesting.in/Windows.html";
		driver.get(BaseURL);
		
		driver.findElement(By.xpath("//a[contains(text(),'New Seperate')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		driver.manage().window().maximize();
		
		String Parentwindow = driver.getWindowHandle();//Parent window
		
		Set<String>childWindows=driver.getWindowHandles(); // All new window
		
		for(String childWindow :childWindows) {
			
			if(!Parentwindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				
				String Text=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]")).getText();
		     System.out.println(Text);
		     
		driver.close();
			}
		}
		driver.switchTo().window(Parentwindow);	
		
    String Text	=driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site ')]")).getText();
		
	
	System.out.println(Text);	

    driver.quit();
	}

}
