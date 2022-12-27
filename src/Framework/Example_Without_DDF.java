package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Without_DDF {

	public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter UserID
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		//Enter Password
		String Data = "Paul Collings";
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		//Click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Name=driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
	
		if(Data.equals(Name)) {
			System.out.println("Correct user name");
		}
		else {
			System.out.println("Incorrect username");
		}
		
		driver.quit();
	}

}
