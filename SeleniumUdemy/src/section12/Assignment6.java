package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1 select checkbox Option 2
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		
		//2 Grab the label from the selected checkbox
		String label = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println("the label is: "+ label);
		
		// 3 Go to the dropdown and select the same option (not hardcoded) 
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText(label);
		
		//4 Enter the step2 label on Switch to Aler example editbox
		driver.findElement(By.name("enter-name")).sendKeys(label);
		
		//5 Click alert  and verify if text grabbed from step 2 is present
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText();
		if (text.contains(label))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
	}

}
