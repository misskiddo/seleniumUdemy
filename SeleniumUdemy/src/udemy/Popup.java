package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String name = "Toñi";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		
		String text = driver.switchTo().alert().getText();
		
		if (text.contains(name))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		//Assert.assertEquals(text, name);
		
		//Click OK on the alert pop up
		driver.switchTo().alert().accept();
		
		
		// Open  Second pop up
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		
		text = driver.switchTo().alert().getText();
		
		if (text.contains(name))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
