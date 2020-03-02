package section11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// Click on Multiple Windows
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		// click on "click here"
		driver.findElement(By.linkText("Click Here")).click();
		
		//A new tab is open. Take all the windows' ids
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
		//Take text "New Window" and print it
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
		// Switch to the parent window
		driver.switchTo().window(parent);
		
		//Take the text "Opening a new window" and print it
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
		
		
		
		
	}
	
	
	

}
