package section11;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//Access frame by WebElement
		WebElement frameTop = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(frameTop);
		
		//Access frame by name
		driver.switchTo().frame("frame-middle");
		
		//driver.switchTo().fra
		
		//Get text
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

		
	}
	
}
