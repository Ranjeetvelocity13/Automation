package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

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
		//driver.findElement(By.id("day"))
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year  = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		//Q1 - How will u get total no size

		Select Select1  =new Select(Day);
		
		List<WebElement> ListDay =Select1.getOptions();
		
		System.out.println("Totla days :"+ListDay.size());
		
		//Q2 How will u print all the values
		
		for(int i=0;i<ListDay.size();i++) {
			
			String DayValues = ListDay.get(i).getText();
			
			System.out.println(DayValues);
			
			//Q3 - How will u select specific values from list box with the help of get method

			if(DayValues.equals("15")) {
				ListDay.get(i).click();
				break;
			}
		}
	
		System.out.println("*******************************************");
		
		Select Select2 = new Select(Month);
		
       List<WebElement> ListMonth = Select2.getOptions();
		
		System.out.println("Totla days :"+ListMonth.size());
		
		//Q2 How will u print all the values
		
		for(int i=0;i<ListMonth.size();i++) {
			
			String MonthValues = ListMonth.get(i).getText();
			
			System.out.println(MonthValues);
			
			//Q3 - How will u select specific values from list box with the help of get method

			if(MonthValues.equals("May")) {
				ListMonth.get(i).click();
				break;
			}
		}   
		}

}
