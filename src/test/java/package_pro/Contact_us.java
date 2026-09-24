package package_pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Contact_us extends Base_test {

	@Test
	public void Contact() {
		String title = driver.getTitle();
		Assert.assertEquals(title.equals("Automation Exercise"), true);

		driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
		WebElement verify = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(verify));
		Assert.assertEquals(verify.getText().equalsIgnoreCase("Get In Touch"), true);
		driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Jothirupan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("NA");
		driver.findElement(By.id("message"))
				.sendKeys("jk ndnf jndfj  ffnf kkjsdjd kdjjkjds kjdsjkj dksjdkj kjsdj kjsdkj");
		WebElement element = driver.findElement(By.xpath("//input[@name='upload_file']"));
		element.sendKeys("C:\\Users\\JOTHIRUPAN\\Downloads\\SQL ANSWERS.pdf");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
 
		
		driver.switchTo().alert().accept();

		 

		WebElement element2 = driver
				.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]"));
		Assert.assertEquals(
				element2.getText().equalsIgnoreCase("Success! Your details have been submitted successfully."), true);
		System.out.println(element2.getText());

		driver.findElement(By.xpath("//span[text()=' Home']")).click();
		String title2 = driver.getTitle();
		Assert.assertEquals(title.equals("Automation Exercise"), true);
		
	}
}
