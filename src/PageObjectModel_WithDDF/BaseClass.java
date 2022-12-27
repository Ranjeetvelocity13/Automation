package PageObjectModel_WithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.OrangeHRM_LoginPage;

public class BaseClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//To fetch data from excel sheet
	    	
	    String path ="/Users/ranjeetkendre/Downloads/23July.xlsx";
	    
	    FileInputStream file =new FileInputStream(path);
	    
	    Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
	    
	    //created obj of orangeHRM class
	    
	    OrangeHRM_Loginpage DM = new OrangeHRM_Loginpage(driver);
  		//Fetch username from excel sheet
		
		String UseUserrID=Data.getRow(1).getCell(0).getStringCellValue();
		
	    DM.User(UseUserrID);
	    
		String Password1=Data.getRow(1).getCell(1).getStringCellValue();

	    DM.Pass(Password1);
	    
	    DM.LoginButton();
	}

}
