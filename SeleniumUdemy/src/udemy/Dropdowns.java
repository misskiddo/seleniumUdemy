package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// STATIC VS DYNAMIC DROPDOWN
		// STATIC --> "SELECT" TAG
		// DYNAMIC --> The list is loaded/refreshed after the user has done some action. 
		
		//System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.spicejet.com");
		
		String option = "dynamic";
		
		if (option.equals("static")){
		
			driver.findElement(By.id("divpaxinfo")).click();
			
			// #ctl00_mainContent_ddl_Adult
			WebElement selector = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			
			Select s = new Select(selector);
			s.selectByValue("2");
			s.selectByIndex(8); // It will display 9
			s.selectByVisibleText("7");
		}
		
		/////////////////////////// DYNAMIC //////////////////////////
		Thread.sleep(2000L);
	   // 	//a[@value='HBX'] xpath for Hubi (From)
		
	   //   //a[@value='MAA'] xpath for chenai (TO)
		
		// Open Departure City dropdown
		driver.findElement(By.cssSelector("[value='Departure City']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		
		//driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR"))
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		//.findElement(By.xpath("//a[@value='MAA']"));
		
		
		//driver.findElement(By.cssSelector("a[value='MAA']")).click();
		
		
		
		

	}

}
