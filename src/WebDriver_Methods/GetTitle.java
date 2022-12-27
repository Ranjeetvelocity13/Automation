package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		
		//Step 1 :
		
				System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
				
				System.setProperty("webdriver.chrome.driver", "chromedriver");

				// Step 
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(4000);
				
				String ExpectedTitle  =  "Facebook – log in or sign";

				String Title = driver.getTitle();
				
				System.out.println(Title);
				
				if(Title.equals(ExpectedTitle)) {
					System.out.println("Correct title");
					
				}
				else {
					System.out.println("Incorrect title");
				}				
						
				driver.close();
				
	}

}
