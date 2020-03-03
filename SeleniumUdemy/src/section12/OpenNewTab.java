package section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	

		// Get number of links from the first column of the footer. Using driver
		WebElement firstColumnFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println("# of links from the first column of the footer: "
				+ firstColumnFooter.findElements(By.tagName("a")).size());

		// Click on each link and check if the pages are opening
		String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				
		
		for (int i =1 ;i<firstColumnFooter.findElements(By.tagName("a")).size() ; i++ ) {
					
			firstColumnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		// Get all the tabs
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		while (it.hasNext()) {
			String currentPage = it.next();
			driver.switchTo().window(currentPage);
			System.out.println("Title page: " + driver.getTitle());
	
		}
		

	}

}
