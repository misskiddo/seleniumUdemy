package udemy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\\\webdrivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\facebook.com");
		/*
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("myemail");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();*/
		
		//CSS with className --> tagName.className
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("className");
		
		// CSS with id --> tagName#id
		driver.findElement(By.cssSelector("input#pass")).sendKeys("passwrod");
		
		
	
		
		
		
	}

}
