package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		
		
		System.out.println("parent: " + driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids= driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		
		// Go to the parent window
		String parent = it.next();
			
		// Go to the child
		String child = it.next();
		
		driver.switchTo().window(child);
	
		// Print child title
		System.out.println("child: " + driver.getTitle());
		
		//Switch back to parent
		driver.switchTo().window(parent);
		
		// Print parent title
		System.out.println("parent: " + driver.getTitle());
		
		
	}

}
