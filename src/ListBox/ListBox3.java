package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

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
	
		WebElement Day   = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year  = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		String DOB = "25/4/2021";
		
		String [] Date = DOB.split("/");
		//0  - 25
		//1  - 4
		//2  - 2021
		
		ListBox(Day, Date[0]);
		ListBox(Month, Date[1]);
		ListBox(Year, Date[2]);
		
//		ListBox(Day, "25");
//		ListBox(Month, "4");
//		ListBox(Year, "2021");
		
	}	
	
	public static void ListBox(WebElement element, String Text) {	
		
		Select Select1 = new Select(element);
		Select1.selectByValue(Text);
		
	}

}
