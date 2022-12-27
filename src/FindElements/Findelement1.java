package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		//1.
		WebElement Searchbox =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		Searchbox.sendKeys("Oneplus");
		
		//2.
		WebElement Links=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
	    System.out.println(Links.getText());
	    
	    //3.
	    WebElement Link1=driver.findElement(By.xpath("//a[@class=\"nav\"]"));
	    System.out.println(Link1.getText()); //org.openqa.selenium.NoSuchElementException:

	}

}
