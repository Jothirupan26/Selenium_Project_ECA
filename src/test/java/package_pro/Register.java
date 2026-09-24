package package_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utilities.Base_test;

public class Register extends Base_test {

	@Test
	public void Resgiter() {
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		WebElement text = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		Assert.assertEquals(text.getText(), "New User Signup!");
		System.out.println(text.getText());

		driver.findElement(By.name("name")).sendKeys("Jthirupan");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("jothirupan@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByVisibleText("18");

		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("May");

		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByVisibleText("2004");

		driver.findElement(By.id("first_name")).sendKeys("Jothirupan");
		driver.findElement(By.id("last_name")).sendKeys("D");
		driver.findElement(By.id("company")).sendKeys("Ameican Express");
		driver.findElement(By.id("address1")).sendKeys("Ambal nagar,ekattuthangal");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		driver.findElement(By.id("state")).sendKeys("Tamilnadu");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("zipcode")).sendKeys("600032");
		driver.findElement(By.id("mobile_number")).sendKeys("6379839172");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		
		WebElement getText04 = driver.findElement(By.xpath("//b[text()='Account Created']"));
        Assert.assertEquals(getText04.equals("Logged in as"), false);
        System.out.print(getText04.getText());
	}
}
