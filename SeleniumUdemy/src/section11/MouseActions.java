package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		Actions a = new Actions(driver);
		
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		
		WebElement searchField = 	driver.findElement(By.id("twotabsearchtextbox"));
		
	
		
		a.moveToElement(searchField).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().
			build().perform();
		
				
		// left click
		a.moveToElement(menu).contextClick().build().perform();
		
		
		
	
		
		

	}

}
