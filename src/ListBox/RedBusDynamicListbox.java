package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDynamicListbox {

	public static void main(String[] args) throws InterruptedException {

		//Step -1
		   System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.redbus.in/");
		   
		   Thread.sleep(4000);
		   
		   driver.findElement(By.id("src")).sendKeys("Pune");
		   Thread.sleep(3000);
		   
           List<WebElement> City= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/li"));
		   
           System.out.println("Total Count :"+City.size());
           
           for(int i=0;i<City.size();i++) {
        	   
        	   City.get(i).getText();
        	   System.out.println(City.get(i).getText());
        	   if(City.get(i).getText().equals("Wakad, Pune")){
        		   System.out.println(City.get(i).getText());
        		   City.get(i).click();
        		   break;
        	   }
           }
           
            System.out.println();
 		   driver.findElement(By.id("dest")).sendKeys("Mumbai");
 		   Thread.sleep(3000);
          List<WebElement>  DestCity = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/li"));
	
        System.out.println("Total City Count :"+DestCity.size());
        for(int i=0;i<DestCity.size();i++) {
     	   
     	   DestCity.get(i).getText();
     	   System.out.println(DestCity.get(i).getText());
     	   if(DestCity.get(i).getText().equals("Goregaon East, Mumbai")){
     		   System.out.println(DestCity.get(i).getText());
     		   DestCity.get(i).click();
     		   break;
	}
     	   
        }
        
        driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
        driver.findElement(By.id("search_btn")).click();
	}
}
