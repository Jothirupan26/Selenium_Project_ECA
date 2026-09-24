package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Functionality extends Base_test {

	@Test
	public void scroll() {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		actions.scrollToElement(element);
		WebElement element2 = driver
				.findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
		actions.scrollToElement(element2);

	}
}
