package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cleartrip.com");

		// Select 2 adults
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByIndex(1);

		// Select 4 Children
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByValue("4");

		// Select today's date on Depart On
		driver.findElement(By.cssSelector(".span.span15.datePicker")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// Click More Options
		driver.findElement(By.cssSelector("a[title='More search options']")).click();

		// Insert preferred Airline Indigo
		driver.findElement(By.cssSelector("input[placeholder='Airline name']")).sendKeys("indigo");

		// Click Search button
		driver.findElement(By.xpath("//input[@title='Search flights']")).click();

		// Grab error message and print it
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
