package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		//String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl = "http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver","c:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		String actualPageTitle = driver.getTitle();
		//String expectedPageTitle = "Yo soy todo un chef";
		
		
		String tagName = driver.findElement(By.id("email")).getTagName();
      //  System.out.println(tagName);
        
        // Locator by ID
        driver.findElement(By.id("email")).sendKeys("misskiddo@hotmail.com");
        
        //Locator by Name
        driver.findElement(By.name("pass")).sendKeys("*****");
        
        
        // Locator by Xpath
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
               
     /*
        // Locator by Link Text 
        driver.findElement(By.partialLinkText("Forgot")).click();
        
        //Locator by classname
        driver.findElement(By.className("inputtext")).sendKeys("hello");
        
        // Locator by CSS with #
        driver.findElement(By.cssSelector(cssSelector))*/
   
        
        
        
        
        
	/*	if(actualPageTitle.contentEquals(expectedPageTitle))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed. The expected title is: "+  expectedPageTitle + 
					" and the actual is" + actualPageTitle);
		
		*/
		
	//	driver.close();
			
			
	}

}
