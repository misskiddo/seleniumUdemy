package section10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImplicitExplicit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] productsToAdd = { "Cucumber", "Carrot" };
			
		addItems(driver, productsToAdd);
		goToCart(driver);
		
	
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Introduce promo code
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		// Click on apply
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
			
		// Verify that the couppon has been applied
	//	String textPromo = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		String textPromo = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		
		
		Assert.assertEquals(textPromo, "Code applied ..!");
		

	}

	public static void goToCart(WebDriver driver) {
		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		
	}


	public static  void addItems(WebDriver driver, String [] productsToAdd) {
		

		int j = 0;
		// Convert array to array list
		List itemsNeededList = Arrays.asList(productsToAdd);
		
		List<WebElement> listProducts = driver.findElements(By.className("product-name"));

		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		for (int i = 0; i < listProducts.size(); i++) {

			// String[] productName = listProducts.get(i).getText().split("-");

			// Remove space
			// String formattedName = productName[0].trim();

			// Brocolli = Brocolli - 1 kg
			String productNameFormatted = listProducts.get(i).getText().split(" -")[0];

			if (itemsNeededList.contains(productNameFormatted)) {
				j++;

				System.out.println("Added to the cart: " + productNameFormatted);

				addToCartButtons.get(i).click();
				// Java lists start on 0, xpath array on 1
				// driver.findElement(By.xpath("(//button[text()='ADD TO
				// CART'])["+(i+1)+"]")).click();

				if (j == productsToAdd.length)
					break;

			}

		}

	}



}
