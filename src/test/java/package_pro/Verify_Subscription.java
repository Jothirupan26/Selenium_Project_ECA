package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Verify_Subscription extends Base_test {

	@Test
	public void veify() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.id("footer"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

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
