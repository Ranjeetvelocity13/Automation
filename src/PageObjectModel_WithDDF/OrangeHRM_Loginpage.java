package PageObjectModel_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Loginpage {

	 @FindBy(xpath = "//input[@name=\"username\"]")
	   private WebElement Username;
	 
	 @FindBy(xpath = "//input[@name=\"password\"]")
	   public WebElement Password;
	   
	   @FindBy(xpath = "//button[@type=\"submit\"]")
	   private WebElement Loginbutton;
	   
	 
	 public OrangeHRM_Loginpage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public void User(String UserID) {
		 Username.sendKeys(UserID);
	}
	 
	 public void Pass(String Passwords) {
		   Password.sendKeys(Passwords);
	   }

	   public void LoginButton() {
		   Loginbutton.click();
	   }
}
