package Generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_test {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void Login() {
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("jothirupand@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

	}
	

	@AfterMethod
	public void logout() {

		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}

	@AfterClass
	public void CloseBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
