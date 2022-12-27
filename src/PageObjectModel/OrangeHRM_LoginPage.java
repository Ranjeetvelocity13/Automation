package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {

	
  //Data member should be declared globally with access level private by using @Findby annotations
      
	
   @FindBy(xpath = "//input[@name=\"username\"]")
   private WebElement Username;

   @FindBy(xpath = "//input[@name=\"password\"]")
   public WebElement Password;
   
   @FindBy(xpath = "//button[@type=\"submit\"]")
   private WebElement Loginbutton;
   
   
   //2. Initialize within a constructor with access level public using pagefactory
    
   public OrangeHRM_LoginPage(WebDriver driver) {
	   
	   PageFactory.initElements(driver, this);
   }

   //3. Utilize within a method with access level public
   
   public void UserName() {
	   Username.sendKeys("Admin");
   }
   
   public void Pass() {
	   Password.sendKeys("admin123");
   }

   public void LoginButton() {
	   Loginbutton.click();
   }
}
