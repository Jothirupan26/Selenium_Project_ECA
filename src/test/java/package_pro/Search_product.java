package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Search_product extends Base_test {
	@Test
	public void search() {
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		driver.findElement(By.id("search_product")).sendKeys("Jeans");
		driver.findElement(By.id("submit_search")).click();
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Searched Products"), true);

	}

}
