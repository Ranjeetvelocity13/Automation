package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter UserID
		Thread.sleep(2000);
		
	FileInputStream File=new FileInputStream("/Users/ranjeetkendre/Downloads/Untitled spreadsheet (4).xlsx");
	Sheet Sh =WorkbookFactory.create(File).getSheet("Sheet");
	
	String Username =Sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		
		//Enter Password
		
		String Password =Sh.getRow(1).getCell(1).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		//Click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Name=driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
		
		String Name1=Sh.getRow(1).getCell(1).getStringCellValue();
		
		if(Name.equals(Name1)) {
			System.out.println("Correct user name");
		}
		else {
			System.out.println("Incorrect username");
		}
		
		driver.quit();
	}

}