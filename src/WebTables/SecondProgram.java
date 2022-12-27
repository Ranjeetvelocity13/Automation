package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		WebElement Example = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		// First way
		Js.executeScript("arguments[0].scrollIntoView();", Example);
		int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();

		System.out.println("Total no of rows :" + Row);

		int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total no of column :" + Col);

		// Second way

		List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total no of rows :" + Row1.size());

		List<WebElement> Col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Total no of column :" + Col1.size());

		// Retrieve all the data from table

		for (int i = 2; i <= Row; i++) {//Outer loop

			for (int j = 1; j <= Col; j++) {// inner loop

				String data = driver
						.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				if (data.equals("Canada")) {
					
					System.out.println("Row Number :" + i + ":" + "Col Number :" + j);
					
				break;
				
				}
			}
		}
	}
}