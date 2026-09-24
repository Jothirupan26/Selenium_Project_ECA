package package_pro;

import org.openqa.selenium.By;

import Generic_utilities.Base_test;

public class LogOut extends Base_test {

	public void logout() {
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}
}
