package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame1 = driver.findElement(By.className("demo_frame"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("draggable")).click();;
		
	}

}
