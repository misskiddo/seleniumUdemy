package section13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Introduce 3 letters
		WebElement input = 	driver.findElement(By.id("autocomplete"));
		input.sendKeys("IT");
		input.sendKeys(Keys.ARROW_DOWN);
		 
		method1(driver, input);
		
		input.sendKeys("US");
		method2(driver, input, "United States (USA)");
		

	}
	
	public static void method2(WebDriver driver, WebElement input, String city) {
		int i= 0;
		while (!input.getAttribute("value").equalsIgnoreCase(city) && i<=10) {
			input.sendKeys(Keys.ARROW_DOWN);
			i++;
			System.out.println(i + ": " + input.getAttribute("value"));
			
		}
		
		
		if (i>10) {
			System.out.println("City not found");
		}
		else
			System.out.println("City found!! :)");
		
	}
	
	
	public static void method1(WebDriver driver, WebElement input) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('autocomplete').value;";
		String text = (String)js.executeScript(script);
		
		// Select mauritania
		int i= 0;
		while (!text.equalsIgnoreCase("Mauritania") && i<=10) {
			input.sendKeys(Keys.ARROW_DOWN);
			i++;
			text = (String)js.executeScript(script);
			System.out.println(i + ": " + text);
			
		}
		
		if (i>10) {
			System.out.println("City not found");
		}
		else
			System.out.println("City found!! :)");
		
	}

}
