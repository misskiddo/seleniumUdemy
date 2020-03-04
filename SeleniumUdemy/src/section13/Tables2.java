package section13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tables2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Live Scores")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SIN vs HK - SIN Won')]")).click();
		
		driver.findElement(By.linkText("Scorecard")).click();
		
		
		// Identify first table
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
		// Row and get the 3 column --> div:nth-child(3)
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		table.click();
		int sum =0;
		for (int i=0 ; i<count -2; i++) {
			
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			sum += Integer.parseInt(value);
			System.out.println(i + ": " + value);
		
		}
		String extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		System.out.println("Extras: " + extra );
		sum += Integer.parseInt(extra);
		
		System.out.println("Total: " + total );
		System.out.println("Calculated total: " + sum );
		
		Assert.assertEquals(Integer.parseInt(total), sum);
		
		
		
		
		

	}

}
