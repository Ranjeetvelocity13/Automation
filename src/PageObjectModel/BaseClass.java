package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OrangeHRM_LoginPage OHP = new OrangeHRM_LoginPage(driver);
		
		OHP.UserName();
		Thread.sleep(2000);
		OHP.Pass();
		Thread.sleep(2000);
        OHP.LoginButton();
        
        
        OrangeHRM_Dashboardpage OHD =new OrangeHRM_Dashboardpage(driver);
        
        OHD.NameVal();
        Thread.sleep(3000);
        OHD.Time();
        
        driver.quit();
	}
	


}
