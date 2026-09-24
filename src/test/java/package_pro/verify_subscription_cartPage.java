package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class verify_subscription_cartPage extends Base_test {

	@Test
	public void verify()
	{
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		String text = element2.getText();
		Assert.assertTrue(text.toLowerCase().contains("subscription"));

		driver.findElement(By.id("susbscribe_email")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.id("subscribe")).click();
		WebElement element3 = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"));
		String text2 = element3.getText();
		Assert.assertTrue(text2.equalsIgnoreCase("You have been successfully subscribed!"));

	}
}
