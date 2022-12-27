package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

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
		
		//selectByVisibleText(String text)
		
//		Select select1 = new Select(Day);
//		select1.selectByVisibleText("25");
//		
//		Select select2 =new Select(Month);
//		select2.selectByVisibleText("May");
//				
//		Select select3 =new Select(Year);
//		select3.selectByVisibleText("2022");
//		
		//2.Select by value
		
//		Select select4 = new Select(Day);
//		select4.selectByValue("15");
//		
//		Select select5 =new Select(Month);
//		select5.selectByValue("10");
//		
//		Select select6 =new Select(Year);
//		select6.selectByValue("1995");
			
		Select select7 = new Select(Day);
		select7.selectByIndex(15);
		
		Select select8 =new Select(Month);
		select8.selectByIndex(5);
		
		Select select9 =new Select(Year);
		select9.selectByIndex(30);
				
		
	}

}
