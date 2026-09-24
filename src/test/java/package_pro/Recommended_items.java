package package_pro;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Recommended_items extends Base_test {

	@Test
	public void Reitems()
	{
		WebElement element = driver.findElement(By.xpath("//h2[text()='recommended items']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(element);
		
		Assert.assertTrue(element.isDisplayed());
		driver.findElement(By.xpath("(//div[@class='recommended_items']/descendant::a[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']"));
		actions.scrollToElement(element2);
		
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
		Assert.assertTrue(element3.isDisplayed());
  
		
	}
}
