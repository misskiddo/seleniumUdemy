package section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		// Open date picker
		driver.findElement(By.id("travel_date")).click();
		
		selectMonth2(driver, "August");
		
		selectDay2(driver,"30");
		
		
	}
	
	private static void selectMonth2(WebDriver driver, String desiredMonth) {
		WebElement month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		WebElement nextButton = driver.findElement(By.cssSelector(".datepicker-days .next"));
		
		while (!month.getText().contains(desiredMonth)) {
			System.out.println("Month: " + month.getText());
			nextButton.click();
		}
		
	}
	
	
	private static void selectMonth1(WebDriver driver, String desiredMonth) {
		
		WebElement month = driver.findElement(By.className("datepicker-switch"));
		
		WebElement nextButton = driver.findElement(By.className("next"));
		
		while (!month.getText().contains(desiredMonth)) {
			System.out.println("Month: " + month.getText());
			nextButton.click();
		}
		
	}

	public static void selectDay1(WebDriver driver, String day) {

		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day']"));
		
		for (WebElement w : dates) {
			System.out.println("Day: " + w.getText());
			if (w.getText().equals(day)) {
				w.click();
				break;
			}
		}
	}
	
	
	public static void selectDay2(WebDriver driver, String day) {

	//  WebElement dataPicker = driver.findElement(By.className("datepicker-days"));
		WebElement dataPicker = driver.findElement(By.xpath("//*[@class='datepicker-days' and not(@class='old')]"));
		//contains(@class,'k-other-mo
			String xpath = "//*[text()='" + day + "']";
			
			dataPicker.findElement(By.xpath(xpath)).click();
			
	}

}
