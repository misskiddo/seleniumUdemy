package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.spicejet.com");
		
		WebElement oneWayCheckbox = driver.findElement(By.cssSelector("[id*='rbtnl_Trip_0']"));
		WebElement roundTripCheckbox = driver.findElement(By.cssSelector("[id*='rbtnl_Trip_1']"));
		//WebElement calendarReturnDate = driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2"));
		
	//	String styleAttribute = driver.findElement(By.id("Div1")).getAttribute("style");
		WebElement calendar = driver.findElement(By.id("Div1"));
		
		Assert.assertTrue(oneWayCheckbox.isSelected());
		
		// Validate that the Return Calendar is disabled
		if ((calendar.getAttribute("style")).contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		roundTripCheckbox.click();
	//	styleAttribute = driver.findElement(By.id("Div1")).getAttribute("style");
	
		
		if ((calendar.getAttribute("style")).contains("1")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//Assert.assertTrue(calendarReturnDate.isEnabled());
		
		
	
		
		

		// Open calendar
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		
		// Select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		

	}

}
