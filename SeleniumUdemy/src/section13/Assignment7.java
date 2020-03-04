package section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.id("product"));
		
		//Number of rows
		int rows = table.findElements(By.tagName("tr")).size();
		System.out.println("# of rows: " + rows);
		
		//Number of columns
		
		int columns = table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).size();
		
	//	int columns = table.findElements(By.tagName("th")).size();
		System.out.println("# of columns: " + columns);
		
		
		// Print 3 Second row
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]")).getText());
		
	/*	List<WebElement> rowToPrint = table.findElements(By.xpath("//tbody/tr[3]/td"));
		for (WebElement w : rowToPrint) {
			System.out.println(w.getText());
		}*/

	}

}
