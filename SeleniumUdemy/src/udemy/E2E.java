package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http:\\www.spicejet.com");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		
		
		
		// Click on Departure City dropdown --> id ctl00_mainContent_ddl_originStation1_CTXT
	
		WebElement departureDropdown = driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']"));
		
		departureDropdown.click();
		departureDropdown.sendKeys("DEL");
			
		Thread.sleep(2000L);
				
		// Select Arrival City --> id ctl00_mainContent_ddl_destinationStation1_CTXT
		
		WebElement arrivalDropdown = driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR"));
				
		arrivalDropdown.findElement(By.cssSelector("[value='MAA']")).click();;
	
		//arrivalDropdown.click();
		
		Thread.sleep(2000L);
		
		
		// Select current date in Calendar
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		/* OPEN PASSENGERS DROPDOWN*/
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		// Adult dropdown -- ctl00_mainContent_ddl_Adult
		
		WebElement adultDd = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			
		
		Select selector = new Select(adultDd);
		
		selector.selectByValue("5");
		
		
		
		// Select family and friends checkbox  name =ctl00$mainContent$chk_friendsandfamily
		driver.findElement(By.cssSelector("input[name*='chk_friendsandfamily']")).click();
		
		// Click on Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
	}

}
