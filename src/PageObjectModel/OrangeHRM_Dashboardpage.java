package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Dashboardpage{

	
	//1.
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	public WebElement Name;
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	public WebElement Timework;
	
//	public WebElement TimeWork = driver.findelemet(By.xpath("//p[@class=\\\"oxd-text oxd-text--p\\\"]"))

    //2. 
	public OrangeHRM_Dashboardpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public void  NameVal() {
		
		String Text=Name.getText();
		System.out.println(Text);
		
		if(Text.equals("Paul Collings")) {
			System.out.println("Correct username");
		}
		else {
			System.out.println("Incorect username");
		}
	}
	
	public void Time() {
		Boolean Time=Timework.isDisplayed();
		System.out.println(Time);
	}
}
