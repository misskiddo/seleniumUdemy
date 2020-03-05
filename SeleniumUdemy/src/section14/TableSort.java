package section14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on Header to sort it descending
		driver.findElement(By.xpath("//b[contains(text(),'Veg/fruit name')]")).click();
		
		//Click on Header to sort it ascending
	//	driver.findElement(By.xpath("//b[contains(text(),'Veg/fruit name')]")).click();
		
		WebElement table = driver.findElement(By.className("wrapperTwo"));

    	//xpath   //tr/td[2]
		//css      tr td:nth-child(2) 
		List<WebElement> secondColumn1 = table.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> duplicatedList = new ArrayList<String>();
		
		
		for (WebElement w : secondColumn1) {
			originalList.add(w.getText());
			//duplicatedList.add(w.getText());
		}
		System.out.println(originalList);
	
		duplicatedList = (ArrayList<String>) originalList.clone();
			
		System.out.println(duplicatedList);
	
		Collections.sort(duplicatedList);
		Collections.reverse(duplicatedList);
		System.out.println(duplicatedList);
		
		//Compare original and duplicated Lists
		
		if (originalList.equals(duplicatedList)) {
			System.out.println("they are sorted");
		}
		else
			System.out.println("Not sorted");
		

		
		
		

		
		
		
		
		
		
		
	}

}
