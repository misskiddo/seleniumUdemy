package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SpiceJet {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			
		WebDriver driver = new FirefoxDriver();
			
		driver.get("http:\\www.spicejet.com");
		
		
		// CHECKBOX
		
		driver.findElement(By.cssSelector("[name*='chk_friendsandfamily']")).click();
		
		WebElement student = driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount'"));
		
		// Verify student is not selected
		Assert.assertFalse(student.isSelected());
		
	    // Select student 
		student.click();
		
		// Verify student is true
		Assert.assertTrue( student.isSelected());
		
		
		
	//	driver.findElement(By.cssSelector("label[for*='chk_Unmr'")).click();
		
		// Number of checkboxes
		
	
		List<WebElement> lista = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		System.out.println("How many checkboxes: " + 	lista.size());
		
		
		
		
		int numberDisplayed = 0;
		
		
		
		for (WebElement e : lista) {
			
			if (e.isDisplayed()) {
				numberDisplayed++;
			}
			else
				System.out.println("This checkbox is not displayed: " + e.getAttribute("name"));
				
		}
		System.out.println("How many boxes are displayed: " + numberDisplayed);
		
		// Verify that 5 checkboxes are displayed
		Assert.assertEquals(numberDisplayed, 5);
		
		
		
	}

}
