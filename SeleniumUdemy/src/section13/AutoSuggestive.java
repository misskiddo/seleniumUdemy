package section13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web");
		
		WebElement inputField = driver.findElement(By.name("fromPlaceName"));
		
		inputField.sendKeys("BENG");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		
		String text = (String) js.executeScript(script);
		
		int i =0;
		
		//Verify that Bengaluru Internation Port is displayed in the dropdown
		
		while (!text.equalsIgnoreCase("Bengaluru Internation airPort") && i<10) {
			i++;
			inputField.sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			System.out.println(i + ": " + text);	
		}
		

		if (i>=10) {
			System.out.println("City not found");
		}
		
	
	}

}
