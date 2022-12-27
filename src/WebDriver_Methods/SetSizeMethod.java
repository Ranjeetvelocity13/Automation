package WebDriver_Methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		// Step 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(3000);
		
		Dimension Size = new Dimension(900,800); // W&H
		
		driver.manage().window().setSize(Size);
		
		Thread.sleep(6000);
		
		System.out.println(driver.manage().window().getSize());
				

	}

}
