package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingScope {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Get total number of links on the page
		System.out.println("# of links on the page: " + driver.findElements(By.tagName("a")).size());

		// Get number of links on the footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println("# of links on the footer: " + footer.findElements(By.tagName("a")).size());

		// Get number of links from the first column of the footer. Using driver
		WebElement firstColumnFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println("# of links from the first column of the footer: "
				+ firstColumnFooter.findElements(By.tagName("a")).size());

		// Get number of links from the second column of the footer. Using footer driver
		WebElement secondColumnFooter = footer.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		System.out.println("# of links from the second column of the footer: "
				+ secondColumnFooter.findElements(By.tagName("a")).size());
		
	
		
		

	}

}
