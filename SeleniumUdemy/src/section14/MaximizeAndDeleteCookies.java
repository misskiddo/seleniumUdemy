package section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MaximizeAndDeleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
					
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Delete one cookie
		driver.manage().deleteCookieNamed("sessionKey");

		//Delete ALL cookies
		driver.manage().deleteAllCookies();
		
		
		
		
		
		driver.get("http://google.com");
		
		
	}

}
