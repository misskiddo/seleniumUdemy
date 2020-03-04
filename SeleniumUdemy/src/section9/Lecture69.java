package section9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture69 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] productsToAdd = { "Cucumber", "Carrot", "Beetroot","Pumpkin" };

		// Convert array to array list
		List itemsNeededList = Arrays.asList(productsToAdd);

		int j = 0;

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
