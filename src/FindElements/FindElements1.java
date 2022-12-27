package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
	//	List<WebElement> Link=driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		
		//2.
		List<WebElement> Link=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
	
		System.out.println(Link.size());
		
		for(WebElement ele :Link) {
			System.out.println(ele.getText());
		}
		
		//3.
		List<WebElement> Link1=driver.findElements(By.xpath("//a[@class=\"nav\"]"));
        System.out.println("Number of links :"+Link1.size());
	}

}
