package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Place_order_Resister_checkout extends Base_test {

	@Test
	public void Place_Order() {

		// Click Products
		driver.findElement(By.xpath("//a[text()=' Products']")).click();

		// Verify All Products page
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));

		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		// Locate Blue Top product
		WebElement element2 = driver
				.findElement(By.xpath("//p[text()='Blue Top']/ancestor::div[@class='single-products']"));

		// Hover over Blue Top
		Actions actions = new Actions(driver);
		actions.moveToElement(element2).perform();

		// Locate Add to Cart button
		WebElement addToCart = driver
				.findElement(By.xpath("//p[text()='Blue Top']" + "/ancestor::div[@class='productinfo text-center']"
						+ "/descendant::a[@class='btn btn-default add-to-cart']"));

		// Scroll Add to Cart button to the center of the screen
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", addToCart);

		// Hover over Add to Cart
		actions.moveToElement(addToCart).perform();

		// Click Add to Cart
		actions.click().perform();

		// Click Continue Shopping
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		// Click Cart
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();

		// Click Proceed To Checkout
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
	}
}
