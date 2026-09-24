package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Product_quantity extends Base_test {

	@Test
	public void addQ() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=' Products']")).click();

		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));

		Assert.assertTrue(element.getText().equalsIgnoreCase("All Products"));

		WebElement viewProduct = driver.findElement(By.xpath(
				"//p[text()='Blue Top']//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']"));

		// Scroll the View Product button to the center of the screen
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", viewProduct);

		Thread.sleep(1000);

		// Click using JavaScript because the advertisement iframe is blocking the
		// normal click
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewProduct);

		Thread.sleep(2000);

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("4");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Blue Top']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Blue Top"), true);
	}
}