package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		
		for (int i =1 ;i<firstColumnFooter.findElements(By.tagName("a")).size() ; i++ ) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			firstColumnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			//firstColumnFooter.findElements(By.tagName("a")).get(i).click()
		}
		

	}

}
