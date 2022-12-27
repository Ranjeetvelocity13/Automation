package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardaction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");

		//driver.get("https://text-compare.com/");
		Actions  act =new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.xpath("//P[@id=\"result\"]")).getText());

		
		act.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//P[@id=\"result\"]")).getText());

	    act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//P[@id=\"result\"]")).getText());

	}

}
