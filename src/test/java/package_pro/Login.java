package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Login extends Base_test {

	@Test
	public void LoginMethod() {
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

		WebElement title = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		Assert.assertEquals(title.getText().equals("Login to your account"), true);

		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

		WebElement info = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertTrue(info.getText().contains("Logged in as"));
		 
	}
}
