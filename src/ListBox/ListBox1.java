package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Prashant");

		driver.findElement(By.name("lastname")).sendKeys("DFGH");
		
		driver.findElement(By.name("reg_email__")).sendKeys("234567");
		
		driver.findElement(By.xpath("(//input[@type=\"password\" or @name=\"reg_passwd__\"])[2]")).sendKeys("@#$%^&*");
	
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value=\"23\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"3\" and contains(text(),'Mar')]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2014\"]")).click();
		
		driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
	}

}
