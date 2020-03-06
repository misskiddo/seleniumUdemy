package section15;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// DesiredCapabilities
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		
		//RemoteWebDriver( server, desideredCapabilities)
		// http://10.0.2.15:5566, OS : LINUX
		URL url = new URL(" http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver( url, dc);
		
		driver.get("http://www.google.es");
		

		/* java -Dwebdriver.chrome.driver="geckodriver.exe" -jar selenium-server.jar -role webdriver -hub http://10.151.126.49:4444/grid/register -port 5566
		 * 
		 * 
		 * 
		 * java -Dwebdriver.chrome.driver="C:\webdrivers\chromedriver.exe" -jar selenium-server.jar -role webdriver -hub http://192.168.56.1:4444/grid/register -port 5566
		*/
		
	}

}

		
		