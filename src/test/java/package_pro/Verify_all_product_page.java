package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Verify_all_product_page extends Base_test {

	@Test
	public void verify() {
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		driver.findElement(By.xpath(
				"//p[text()='Blue Top']//ancestor::div[@class='product-image-wrapper']//descendant::a[text()='View Product']"))
				.click();

		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Blue Top"), true);

		WebElement element3 = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
		Assert.assertEquals(element3.getText().contains("category: Women > Tops"), true);

		WebElement element4 = driver.findElement(By.xpath("//span[contains(text(),'Rs.')]"));
		String text = element4.getText();

		text = text.replace("Rs", "").replace(".", "").trim();

		int price = Integer.parseInt(text);
		Assert.assertTrue(price > 100);

		WebElement element5 = driver.findElement(By.xpath("//p[contains(text(),' In Stock')]"));
		Assert.assertTrue(element5.isDisplayed());

		WebElement element6 = driver.findElement(By.xpath("//p[contains(text(),' New')]"));
		String text2 = element6.getText();

		Assert.assertTrue(text2.equals("New") || text2.equals("Old"), "error");
	}
}
