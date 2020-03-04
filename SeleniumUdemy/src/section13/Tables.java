package section13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Live Scores")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SIN vs HK - SIN Won')]")).click();
		
		driver.findElement(By.linkText("Scorecard")).click();
		
		
		// Identify first table
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
		// Row and get the 3 column --> div:nth-child(3)
		List<WebElement> list = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		
		for (WebElement w : list) {
			System.out.println(w.getText());
		}
				

	}

}
