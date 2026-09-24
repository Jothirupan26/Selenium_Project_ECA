package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Remove_cart extends Base_test {
	@Test
	public void remove() {
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		WebElement element2 = driver
				.findElement(By.xpath("//p[text()='Blue Top']/ancestor::div[@class='single-products']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element2).perform();

		driver.findElement(By.xpath(
				"//p[text()='Blue Top']/ancestor::div[@class='productinfo text-center']/descendant::a[@class='btn btn-default add-to-cart']"))
				.click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		WebElement element3 = driver

				.findElement(By.xpath("//p[text()='Winter Top']/ancestor::div[@class='single-products']"));
		actions.moveToElement(element3).perform();
		driver.findElement(By.xpath(
				"//p[text()='Winter Top']/ancestor::div[@class='productinfo text-center']/descendant::a[@class='btn btn-default add-to-cart']"))
				.click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
	}
}
