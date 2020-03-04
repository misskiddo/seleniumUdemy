package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggest {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				
				driver.get("http:\\www.makemytrip.com");
				
				WebElement fromCity = driver.findElement(By.cssSelector("#fromCity"));
				
				// Click on FromCity
				fromCity.click();
				
				WebElement inputFromCity = driver.findElement(By.cssSelector(".react-autosuggest__input"));
			
				//.react-autosuggest__input
				
				// Select Bombai
				inputFromCity.sendKeys("BOM");
				inputFromCity.sendKeys(Keys.ARROW_DOWN);
				inputFromCity.sendKeys(Keys.ENTER);
				
				WebElement toCity = driver.findElement(By.cssSelector("input[placeholder='To']"));
				
				toCity.sendKeys("JFK");
				try {
					toCity.sendKeys(Keys.ARROW_DOWN);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(1000L);
				toCity.sendKeys(Keys.ENTER);
				//toCity.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

	}

}
