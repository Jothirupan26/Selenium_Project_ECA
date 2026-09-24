package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class ViewCartProduct extends Base_test {

	@Test
	public void verify() {
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='All Products']"));
		Assert.assertEquals(element.getText().equalsIgnoreCase("All Products"), true);

		driver.findElement(By.xpath("//a[text()='H&M']")).click();
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Brand - H&M Products']"));
		Assert.assertTrue(element2.isDisplayed());

		driver.findElement(By.xpath("//a[text()='Polo']")).click();
		WebElement element3 = driver.findElement(By.xpath("(//a[@class='google-anno'])[1]"));
		Assert.assertTrue(element3.isDisplayed());

	}
}
