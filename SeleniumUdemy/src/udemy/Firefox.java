package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c:\\webdrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("usrename");
		
		driver.findElement(By.name("pw")).sendKeys("*****");
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		//driver.findElement(By.className("  ")).click();
				

	}

}
