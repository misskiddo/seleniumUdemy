package section10;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		WebElement example1 = driver.findElement(By.partialLinkText("Example 1"));
		
		wait.until(ExpectedConditions.elementToBeClickable(example1));
		
		example1.click();
		
		
		// Click on Start
		//driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		driver.findElement(By.cssSelector("[id = 'start'] button")).click();
		
		
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3));
		
		wait2.until(  new Function<WebDriver, WebElement>() {
			public WebElement apply (WebDriver driver) {
			//	return driver.findElement(By.cssSelector("[id='finish'] h4"));
				if (driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed()) {
					return driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
				}
				else
					return null;
			
				
			}
			
		});
		
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());
		
		

	}

}
