package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Prashant");

			driver.findElement(By.name("lastname")).sendKeys("DFGH");
			
			driver.findElement(By.name("reg_email__")).sendKeys("234567");
			
			driver.findElement(By.xpath("(//input[@type=\"password\" or @name=\"reg_passwd__\"])[2]")).sendKeys("@#$%^&*");
		
			String Day ="//select[@id=\"day\"]/option";
			String Month ="//select[@id=\"month\"]/option";
			String Year ="//select[@id=\"year\"]/option";
			
			String DOB = "15-May-2020";
			
			String date[]= DOB.split("-");
			
			Slectdropdown(Day,date[0]);
			Slectdropdown(Month,date[1]);
			Slectdropdown(Year,date[2]);
	}

	public static void Slectdropdown(String element, String values) {
		
		List<WebElement> V1=driver.findElements(By.xpath(element));
		System.out.println(V1);
		//System.out.println(V1.size());
		         // 0<31  - True
		for(int i=0;i<V1.size();i++) {
			                          //0-- 0
			System.out.println(V1.get(i).getText());
			     //  15  .equal 15 -
			if(V1.get(i).getText().equals(values)) {
				V1.get(i).click();
				break;
			}
		}
	}
}
