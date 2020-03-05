package section14;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		// Desired capabilities
		ChromeOptions c = new ChromeOptions();
		DesiredCapabilities dC = DesiredCapabilities.chrome();
		
		//             Use the first OR the second
		//First way
		dC.acceptInsecureCerts();
		
		// Second Way
		dC.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		c.merge(dC);
				
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		

	}

}
