package MultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links present :"+Link.size());
		System.out.println();
		//Print alll the links
		
		for(WebElement link :Link) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
		driver.quit();
		
	}

}
