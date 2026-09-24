package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Review_on_product extends Base_test {
	@Test
	public void Review() {
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		driver.findElement(By.xpath(
				"//p[text()='Blue Top']//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']"))
				.click();

		driver.findElement(By.id("name")).sendKeys("joe");
		driver.findElement(By.id("email")).sendKeys("joe@gmai.com");
		driver.findElement(By.id("review")).sendKeys("Thank you for your review.");
		driver.findElement(By.id("button-review")).sendKeys("button-review");
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Thank you for your review.']"));
		Assert.assertTrue(element2.isDisplayed());
	}
}
